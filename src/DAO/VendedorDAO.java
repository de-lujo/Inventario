/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaz.Vendedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DAO.VendedoresDAO;
import mysql.Conector;

/**
 *
 * @author CRAVELO
 */
public class VendedorDAO implements VendedoresDAO{
Conector c = new Conector();
    
    public VendedorDAO(){
   
    
    }

    @Override
    public List<Vendedores> list() {
    List<Vendedores>     list = null;
    String sql = "select * from Vendedor";
        try {
            
            PreparedStatement st = c.conexion.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            list = new ArrayList<Vendedores>();
            while (rs.next()) {                
                Vendedores c = new Vendedores();
                
             c.setId(rs.getString(1));
            
                c.setNombre(rs.getString(2));
                c.setUsuario(rs.getString(3));
                c.setPass1(rs.getString(4));
                c.setApellido(rs.getString(5));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return  list;
    }

     @Override
    public String insert(Vendedores vendedores) {
       String result= null;
       String sql="Insert into Vendedor (nombre, usuario, pass, apellidos)"
               + " values (?,?,?,?)";
        try {
           
            PreparedStatement ps= c.conexion.prepareStatement(sql);
            
            ps.setString(1, vendedores.getNombre());
            ps.setString(2, vendedores.getUsuario());
            ps.setString(3, vendedores.getPass1());
            ps.setString(4, vendedores.getApellido());
            ps.executeUpdate();            
            ps.close();c.conexion.close();
            
        } catch (Exception e) {
            System.out.println("Error:  " + e.getMessage());
            result = e.getMessage();
        }
        return  result;
    }

 

 

  


    @Override
    public String delete(int id) {
        String result= null;
        String sql= "delete from Vendedor where idVendedor=?";
        try {
            
            PreparedStatement ps= c.conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            c.conexion.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            result = e.getMessage();
        }
        return  result;
    }



    public String update(Vendedores vendedores) {
        String result= null;
        String sql ="update Vendedor set nombre=?, usuario =?,"
                + " pass=?, apellido=? "
                + " where idVendedor =?";
        try {
          
            PreparedStatement ps = c.conexion.prepareStatement(sql);
            ps.setString(1, vendedores.getNombre());
            ps.setString(2, vendedores.getUsuario());
            ps.setString(3, vendedores.getPass1());
            ps.setString(4, vendedores.getApellido());
           
            ps.executeUpdate();
            c.conexion.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return  result;
    }

    @Override
    public int idVendedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendedores get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
