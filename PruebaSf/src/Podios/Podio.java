/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Podios;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import pruebasf.Conexion;

/**
 *
 * @author Home
 */
// Constructor Clase Podio
public class Podio {

    int idPodio, PrimerLugar, SegundoLugar, TercerLugar;

    public Podio(int idPodio, int PrimerLugar, int SegundoLugar, int TercerLugar) {
        this.idPodio = idPodio;
        this.PrimerLugar = PrimerLugar;
        this.SegundoLugar = SegundoLugar;
        this.TercerLugar = TercerLugar;
    }

    public int getIdPodio() {
        return idPodio;
    }

    public void setIdPodio(int idPodio) {
        this.idPodio = idPodio;
    }

    public int getPrimerLugar() {
        return PrimerLugar;
    }

    public void setPrimerLugar(int PrimerLugar) {
        this.PrimerLugar = PrimerLugar;
    }

    public int getSegundoLugar() {
        return SegundoLugar;
    }

    public void setSegundoLugar(int SegundoLugar) {
        this.SegundoLugar = SegundoLugar;
    }

    public int getTercerLugar() {
        return TercerLugar;
    }

    public void setTercerLugar(int TercerLugar) {
        this.TercerLugar = TercerLugar;
    }

    public void ImprimirPodio() {
        System.out.println("El primer lugar para:" + getPrimerLugar());
        System.out.println("El Segundo lugar para:" + getSegundoLugar());
        System.out.println("El tercerlugar para:" + getTercerLugar());
    }

    
}
