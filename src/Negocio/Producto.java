/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

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

    public Producto(double valorCosto, double valorVenta, String talla, String color, String sexo, String codigoBarra, String descuento) {
        this.valorCosto = valorCosto;
        this.valorVenta = valorVenta;
        this.talla = talla;
        this.color = color;
        this.sexo = sexo;
        this.codigoBarra = codigoBarra;
        this.descuento = descuento;
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
   
    
    
    
}
