/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasf;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Home
 */
public class Conexion {
    public Connection con;
    public Conexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mibasedatos", "root", "");
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }
    public static void main(String[] args) {
        

     
    }
}
