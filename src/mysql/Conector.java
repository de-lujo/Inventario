/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author CRAVELO
 */
public class Conector {
    
     public Connection conexion;
    public PreparedStatement pst;
    public ResultSet rs;
   
    


    
    public Conector(){
       
    CargarDriver();
    }
    
    void CargarDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("clase cargada correctamente");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Baby", "root", "");
            if (conexion != null) {
                System.out.println("Driver cargando driver [OK] clase individual");
            }
        } catch (SQLException ex) {
            System.out.println("Conectado a la DataBase [FAIL] " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

    }
    
    
}
