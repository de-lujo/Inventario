/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import Interfaz.Vendedores;
import java.util.List;

/**
 *
 * @author CRAVELO
 */
public interface VendedoresDAO {
    
    public List<Vendedores> list();
    
    public String insert(Vendedores vendedores);
    
    public int idVendedor();
    
    public Vendedores get(int id);
    
    public String delete(int id);
    
    public String update(Vendedores vendedores);
    
}
