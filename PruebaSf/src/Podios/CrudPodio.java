/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Podios;
import java.sql.Connection;
import javax.swing.JOptionPane;
import pruebasf.Conexion;
import Podios.Podio;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class CrudPodio {
    Podio podio = new Podio();
            
    ArrayList<Podio> podios = new ArrayList<Podio>();
    
    public void Insertar(int Primero, int Segundo, int Tercero) {
           for (int i = 0; i < 10; i++) {
            podio.setPrimerLugar(Primero);
            podio.setSegundoLugar(Segundo);
            podio.setTercerLugar(Tercero);
            podios.add(podio);
        } 
        
    }
}
