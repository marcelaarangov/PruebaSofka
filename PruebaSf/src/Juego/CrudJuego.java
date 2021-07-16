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
import Pistas.CrudPistas;
import Podios.Podio;
import Conductores.CrudConductores;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class CrudJuego {
   public static Conexion cn = new Conexion();
    public static Connection con;
    static CrudConductores conductor = new CrudConductores();
    static CrudPistas pista = new CrudPistas();
    
    Juego juego = new Juego();
    ArrayList<Juego> juegoNuevo = new ArrayList<Juego>();
    
    public void Jugar (ArrayList jugadores, ArrayList pistas){
        
    }
    
    public CrudJuego() {
        conductor.Insertar(cn, con);
        pista.Insertar(cn, con);
    }
    
}
