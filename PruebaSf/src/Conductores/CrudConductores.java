package Conductores;

/**
 *
 * @author Home
 */
import java.sql.Connection;
import javax.swing.JOptionPane;
import pruebasf.Conexion;
import Conductores.Conductores;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CrudConductores {

    Conductores conductor = new Conductores();

    ArrayList<Conductores> Conductores = new ArrayList<Conductores>();

    public void Insertar(Conexion cn, Connection con) {

        Statement st;
        ResultSet rs;
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from Conductores");
            while (rs.next()) {
                conductor.setIdConductor(rs.getInt("idConductor"));
                conductor.setNombre(rs.getString("Nombre"));
                conductor.setPuntaje(rs.getInt("Puntaje"));
                Conductores.add(conductor);
            }
            cn.con.close();
        } catch (Exception e) {
        }

    }

    public void ImplimirConductores(Conexion cn, Connection con) {

        Statement st;
        ResultSet rs;
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from Conductores");
            while (rs.next()) {
                System.out.println(rs.getInt("idConductor") + " " + rs.getString("Nombre") + " " + rs.getInt("Puntaje"));
            }
            cn.con.close();
        } catch (Exception e) {
        }

    }

}
