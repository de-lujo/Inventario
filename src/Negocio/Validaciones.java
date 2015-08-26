/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Ian Quiroga
 */
public class Validaciones {
    
    String nombre;
    
  public Validaciones(){
  
  
  }
  
  
  
  
  
  public static void soloNumbers(java.awt.event.KeyEvent evt){
  
  char c=evt.getKeyChar();
  
  if (((c < '0') || (c > '9')) && (c != '.' /*corresponde a BACK_SPACE*/)) {
  
   evt.consume();
   JOptionPane.showMessageDialog(null, "Debe ingresar números.");
   
  }

  
  }
   
    
}
