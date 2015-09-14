/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.Serializable;

/**
 *
 * @author CRAVELO
 */
public class Vendedores implements Serializable{
    
    public static final String nomTabla = "Vendedor";
    public static final String SELECT_ALL = "select * from Vendedor";
    
    private String  id;
    private String usuario;
    private String nombre;
    private String apellido;
    private String pass1; 
    private String pass2; 


    
    
    public Vendedores(){
    
    
    } 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPass1() {
        return pass1;
    }

    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }

    
    
    

}
