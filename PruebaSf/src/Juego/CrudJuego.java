/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.sql.Connection;
import javax.swing.JOptionPane;
import pruebasf.Conexion;
import Juego.Juego;
import Podios.Podio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import Conductores.Conductores;
import Pistas.Pistas;
import Carros.Carros;
import Carriles.Carriles;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Home
 */
public class CrudJuego {

    static Scanner teclado = new Scanner(System.in);

    static int Jugadores = 0;
    static int ganadores = 0;
    static int idJuego;

    Conexion cn = new Conexion();
    Connection con;
    Statement st;
    ResultSet rs;

    static Conductores conductor;
    static Pistas pista;
    static Carros carro;
    static Carriles carril;
    static Podio podio = new Podio(1, 0, 0, 0);

    static String nombre = "";
    static ArrayList<Conductores> ArregloConductores = new ArrayList<>();
    static ArrayList<Pistas> ArregloPistas = new ArrayList<>();
    static ArrayList<Carros> ArregloCarros = new ArrayList<>();
    static ArrayList<Carriles> ArregloCarriles = new ArrayList<>();
    static ArrayList<Podio> ArregloPodios = new ArrayList<>();

    public void Jugar() {
        idJuego = 1;
        do {
            System.out.println("Ingrese el numero de jugadores mayor a 2:");
            Jugadores = teclado.nextInt();
        } while (Jugadores < 3);

        for (int i = 0; i < Jugadores; i++) { // ciclo para insernar n competidores
            insertarJugador(i);
        }
        CrearPista(1, Jugadores);
        AJugar();
        Agregar();
    }

    public void insertarJugador(int i) {
        System.out.println("Inserte el nombre del jugador numero" + (i + 1) + ":");
        nombre = teclado.next();
        conductor = new Conductores((i + 1), nombre);
        ArregloConductores.add(conductor);
    }

    public void CrearPista(int i, int Jugadores) {
        System.out.println("Inserte el número de kilometros para la pista");
        pista = new Pistas(i, (teclado.nextInt() * 1000), Jugadores);
        ArregloPistas.add(pista);
        AsignarConductor(ArregloConductores);
        RelcaionarCarril(ArregloCarros, ArregloPistas);

    }

    public void AsignarCarro(int i, String Nombre) {
        carro = new Carros((i + 1), Nombre);
        ArregloCarros.add(carro);

    }

    public void AsignarConductor(ArrayList<Conductores> Piloto) {
        for (int i = 0; i < Piloto.size(); i++) {
            AsignarCarro(i, Piloto.get(i).getNombre());

        }

    }

    public void AsignarCarril(int i, int idCar, int idJuego, int idPista) {
        carril = new Carriles(i, idCar, idJuego, idPista);
        ArregloCarriles.add(carril);

    }

    public void RelcaionarCarril(ArrayList<Carros> carros, ArrayList<Pistas> pistas) {
        for (int i = 0; i < carros.size(); i++) {
            AsignarCarril(i, carros.get(i).getIdCarro(), idJuego, pistas.get(0).getIdPista());

        }

    }

    public static void AJugar() {
        //compitiendo = asignarConductor.retornarLista();
        while (ganadores < 3) {
            for (int i = 0; i < ArregloCarros.size(); i++) {
                if (ArregloCarros.get(i).getDistancia() < pista.getLimiteKm()) {
                    System.out.println("Lanzando dado para el competidor " + ArregloCarros.get(i).getIdCarro());
                    ArregloCarros.get(i).LanzarDado();
                    System.out.println("Metros recorridos: " + ArregloCarros.get(i).getDistancia());
                    ganadores(ArregloCarros.get(i).getDistancia(), ArregloCarros.get(i).getIdCarro(), pista);
                }
            }

        }
        ArregloPodios.add(podio);
        podio.ImprimirPodio();
    }

    public static void ganadores(int distancia, int idCarro, Pistas pista) {
        int metros = pista.getLimiteKm();
        if (metros <= distancia) {
            ganadores++;
            podio(ganadores, idCarro);
        }
    }

    public static void podio(int posicion, int idCarro) {
        switch (posicion) {
            case 1:
                podio.setPrimerLugar(idCarro);
                break;
            case 2:
                podio.setSegundoLugar(idCarro);
                break;
            case 3:
                podio.setTercerLugar(idCarro);
                break;
        }
    }

    public void Agregar() {
        int PrimerLugar = podio.getPrimerLugar();
        int SegundoLugar = podio.getSegundoLugar();
        int TercerLugar = podio.getTercerLugar();
        try {
            String sql = "insert into podio (PrimerLugar,SegundoLugar,TercerLugar) values"
                    + "('" + PrimerLugar + "','" + SegundoLugar + "','" + TercerLugar + "')";
            con = cn.getConnection();
            st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Podio Registrado con Exito");
          
        } catch (Exception e) {
        } 
        


        
    }
}
