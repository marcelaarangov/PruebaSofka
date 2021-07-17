package Pistas;

/**
 *
 * @author Home
 */
// Constructor Clase Pistas
public class Pistas {

    int idPista, LimiteKm, NumCarriles;

    public Pistas(int idPista, int LimiteKm, int NumCarriles) {
        this.idPista = idPista;
        this.LimiteKm = LimiteKm;
        this.NumCarriles = NumCarriles;
    }

    public int getIdPista() {
        return idPista;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    public int getLimiteKm() {
        return LimiteKm;
    }

    public void setLimiteKm(int LimiteKm) {
        this.LimiteKm = LimiteKm;
    }

    public int getNumCarriles() {
        return NumCarriles;
    }

    public void setNumCarriles(int NumCarriles) {
        this.NumCarriles = NumCarriles;
    }

}
