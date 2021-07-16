/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pistas;

import java.sql.Connection;
import javax.swing.JOptionPane;
import pruebasf.Conexion;
import Pistas.Pistas;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class CrudPistas {

    Pistas pista = new Pistas();

    ArrayList<Pistas> Pistas = new ArrayList<Pistas>();

    public void Insertar(Conexion cn, Connection con) {
        Statement st;
        ResultSet rs;
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from Pistas");
            while (rs.next()) {
                pista.setIdPista(rs.getInt("idPista"));
                pista.setLimiteKm(rs.getInt("LimiteKm"));
                pista.setNumCarriles(rs.getInt("NumCarriles"));
                Pistas.add(pista);
            }
            cn.con.close();
        } catch (Exception e) {
        }
    }

    public void ImplimirPistas(Conexion cn, Connection con) {

        Statement st;
        ResultSet rs;
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from Conductores");
            while (rs.next()) {
                System.out.println(rs.getInt("idPista") + " " + rs.getInt("LimiteKm") + " " + rs.getInt("NumCarriles"));
            }
            cn.con.close();
        } catch (Exception e) {
        }

    }
}
