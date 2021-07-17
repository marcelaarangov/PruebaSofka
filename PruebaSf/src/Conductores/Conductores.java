/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conductores;

/**
 *
 * @author Home
 */
// Constructor Clase Conductores
public class Conductores {

    int idConductor, Puntaje;

    String Nombre;

    public Conductores(int id, String Nombre) {
        this.idConductor = id;
        this.Puntaje = 0;
        this.Nombre = Nombre;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje = Puntaje;
    }
}
