/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import DAO.Conexion;
import Interfaz.IngresoSistema;

import Interfaz.MenuPrincipal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CRAVELO
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        Conexion.conectar();

        Statement s = Conexion.getStatement();

        ResultSet rs = s.executeQuery("select * from Vendedor");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)+ " " + rs.getString(4));
        }

        Conexion.cerrarTodo(1);
        new IngresoSistema().setVisible(true);
       
    }

}
