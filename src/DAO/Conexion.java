/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CRAVELO
 */
public class Conexion {
    
    
    public static Connection iniciarConexion()
    {
        Connection conexion=null;
      
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/Baby";
            String usuarioDB="root";
            String passwordDB="";
            conexion= (Connection) DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        finally
        {
            return conexion;
        }
    }
    
    
    
    

   
   
   
  private static java.sql.Connection cns = null;
    private static Statement st = null;
    private static PreparedStatement ps = null; 
    
    public static final int CERRAR_TODO = 1;
    public static final int CERRAR_STATEMENT = 2;
    public static final int CERRAR_PREPAREDSTATEMENT = 3;
    public static final int CERRAR_ST_PS = 4;
    
    
    private static String host = "localhost";
    private static String dataBase = "Baby";
    private static String user = "root";
    private static String pass = "";
    
    public static void conectar()
     {
          try{
              if (cns==null){
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://"+host+":3306/"+dataBase;
                    cns = DriverManager.getConnection( url, user, pass );
                  System.out.println("conecto");   
              }
          }catch(ClassNotFoundException ex){
              JOptionPane.showMessageDialog(null, "Error Interno!", "Registro de Coneccion falló", JOptionPane.ERROR_MESSAGE);
          }
          catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Acceso denegado!!", "Usuario NO Autorizado", JOptionPane.ERROR_MESSAGE);
          }
                 
     }
    
    public static PreparedStatement getPreparedStatement(String sql)
    {
        if(cns == null)
            conectar();
        try{
            ps = cns.prepareStatement(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la consulta!!", "no se pudo obtener registros", JOptionPane.ERROR_MESSAGE);
            try{
                if(!ps.isClosed())
                 ps.close();
            }catch(SQLException ex2){}
            
        }
        return ps;
    }
    
    public static Statement getStatement()
    {
        if(cns == null)
            conectar();
        try{
            st = cns.createStatement();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la consulta!!", "no se pudo obtener registros", JOptionPane.ERROR_MESSAGE);
            try{
                if(!st.isClosed())
                    st.close();
            }catch(SQLException ex2){}
            
        }
        
        return st;
    }
    
    public static void cerrarTodo(int tipoCierre)
    {
        try{
            switch(tipoCierre)
            {
                case CERRAR_TODO:            
                    cerrarConexion();
                    cerrarStatement();
                    cerrarPreparedStatement();
                    break;
                case CERRAR_STATEMENT:
                    cerrarStatement();
                    break;
                case CERRAR_PREPAREDSTATEMENT:
                    cerrarPreparedStatement();
                    break;
                case CERRAR_ST_PS:
                    cerrarStatement();
                    cerrarPreparedStatement();
                    break;
                default:System.out.println();
            }
        }catch(SQLException ex){}
    }
    
    private static void cerrarConexion()throws SQLException
    {
        if(cns !=null)
        {
            if(!cns.isClosed())
            {
                cns.close();
            }
        }
    }
    
    private static void cerrarStatement()throws SQLException
    {
        if(st != null)
        {
            if(!st.isClosed())
                st.close();
        }
    }
    
    private static void cerrarPreparedStatement()throws SQLException
    {
       if(ps != null)
        {
            if(!ps.isClosed())
             ps.close();
        }
    }
    
}

    

