
package Carros;

/**
 *
 * @author Home
 */
// Constructor Clase Carros
public class Carros {
    int idCarro, Conductor, Posicion, Distancia, Juego;
    String Nombre;

    public Carros(int idCarro, String Nombre) {
        this.idCarro = idCarro;
        this.Nombre = Nombre;
    }

    
    

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getConductor() {
        return Conductor;
    }

    public void setConductor(int Conductor) {
        this.Conductor = Conductor;
    }

    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int Posicion) {
        this.Posicion = Posicion;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public int getJuego() {
        return Juego;
    }

    public void setJuego(int Juego) {
        this.Juego = Juego;
    }
    
    public void LanzarDado() {
        Distancia = Distancia + (((int) (Math.random() * 5 + 1))*100);
    }

}
