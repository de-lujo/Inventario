/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DAO.Conexion;
import Interfaz.ActualizarProducts;
import Interfaz.AgregarProducts;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mysql.Conector;

/**
 *
 * @author CRAVELO
 */
public class Producto {
    
    private double valorCosto; 
    private double valorVenta; 
    private String talla; 
    private String color; 
    private String sexo; 
    private String codigoBarra; 
    private String descuento; 
    static Conector c= new Conector();

    public Producto(double valorCosto, double valorVenta, String talla, String color, String sexo, String codigoBarra, String descuento) {
        this.valorCosto = valorCosto;
        this.valorVenta = valorVenta;
        this.talla = talla;
        this.color = color;
        this.sexo = sexo;
        this.codigoBarra = codigoBarra;
        this.descuento = descuento;
    }

    public Producto() {

    }
    

    public double getValorCosto() {
        return valorCosto;
    }

    public void setValorCosto(double valorCosto) {
        this.valorCosto = valorCosto;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }
    
    
    
     public static void insertarProducto(String Consulta) throws SQLException{
     
        
        PreparedStatement ps= c.conexion.prepareStatement(Consulta);
        ps.executeUpdate();
        ps.close();
        
     
     }
     
     public static void rescatarProducto (String Consulta, JTable tablas, ArrayList<Integer> lista_id) throws SQLException{
         
            //Conector c= new Conector();
            PreparedStatement pst= c.conexion.prepareStatement(Consulta);
            ResultSet rs= pst.executeQuery(Consulta);
            ResultSetMetaData rsm = rs.getMetaData();
            
            ArrayList<Object[]> datos=new ArrayList<>();   
            
            while (rs.next()) {            
                
                System.out.println(rsm.getColumnCount());
                
                 Object[] filas=new Object[rsm.getColumnCount()-1];
                 for (int i = 0; i < filas.length; i++) {
                     
                     if (i == 0) {
                     
                        lista_id.add((Integer) rs.getObject(1));
                      }
                     
                     filas[i]=rs.getObject(i+2);

                 }
                 
                 //tengo el id, debo realizar evento de listener a cada item seleccionado
                 datos.add(filas);
             }
            
            DefaultTableModel dtm=(DefaultTableModel)tablas.getModel();
            
            if (datos.size() == 0){
    
               for (int i = 0; i < dtm.getRowCount(); i++) {
                dtm.removeRow(i);
                
               }
               JOptionPane.showMessageDialog(null, "No existe resultados.");
          
            }
            
            
            else {
                
            for (int i = 0; i <datos.size(); i++) {
                dtm.addRow(datos.get(i));
              }
            }
        
    }
     
     
     
     
     public static void mostrarProducto(int id, JDesktopPane escritorio) throws SQLException{
     
         String[] datos= new String[9];
         
         String Consulta="SELECT *FROM producto where N_producto=" + id+";";
         Statement st= c.conexion.createStatement();
         ResultSet rs= st.executeQuery(Consulta);
         //ResultSetMetaData rsm = rs.getMetaData();
  
         while(rs.next()){
             
         datos[0]= rs.getString("valorCosto"); //valorCosto
         datos[1]= rs.getString("talla"); //talla
         datos[2]= rs.getString("color"); //color
         datos[3]= rs.getString("sexo");//Sexo
         datos[4]= rs.getString("codigoBarra");//Codigo Barra
         datos[5]= rs.getString("categoria"); //Categoria
         datos[6]= rs.getString("nombre");//nombre
         datos[7]= rs.getString("stockBodega"); //stockBodega
         datos[8]= rs.getString("stockTienda");//id_Producto
         
         }
         
         
         
         
        
         ActualizarProducts  nuevo= new ActualizarProducts(datos, true, id);
         
         escritorio.add(nuevo);
         
         nuevo.setTitle("Actualizar Producto");
         nuevo.pack();
         nuevo.show();
         nuevo.toFront();
       
         // rs.getString(2);
        
     
     
     
     
     }
     
     
     
     public static boolean validaProducto( String cod) throws SQLException{
     
         String Consulta="SELECT count(N_producto) as valor from producto where codigoBarra=" +cod+";";
         Statement st= c.conexion.createStatement();
         ResultSet rs= st.executeQuery(Consulta);
         int valor=0;
         
         while(rs.next()){
         
             valor=Integer.parseInt(rs.getString("valor"));
         
         }
         
         if (valor == 1) return true;
         
         else return false;
         
     
     }
     

        
}
