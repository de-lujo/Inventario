/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Interfaz.Vendedores;
import java.util.List;
import model.DAO.VendedoresDAO;

/**
 *
 * @author CRAVELO
 */
public class VendedorNE {
    VendedoresDAO vendedoresDAO; 
    
    
     public List<Vendedores> list(){
        return vendedoresDAO.list();
    }
}
