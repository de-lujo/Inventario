/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import DAO.Conexion;
import Negocio.Producto;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ian Quiroga
 */
public class EditarProducts extends javax.swing.JInternalFrame {

   ArrayList<Integer> lista_id = new ArrayList<Integer> ();  // arreglo de los ids a rescatar
   
   
    public EditarProducts() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        precioMin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precio = new javax.swing.JComboBox();
        edad = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        talla = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        codigoBarra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablas = new javax.swing.JTable();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Editar Productos");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPrecio.jpg"))); // NOI18N
        jLabel5.setText("Precio entre: ");

        precio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "$0 - $9.990", "$10.000 - $19.990", "$20.000 - $29.990", "$ > 30.000" }));

        edad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Año", "Meses", " " }));
        edad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edadItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/talla2.png"))); // NOI18N
        jLabel2.setText("Edad :");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/talla1.png"))); // NOI18N
        jLabel7.setText("Talla :");

        talla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        talla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tallaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(precioMin))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(talla, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(precioMin)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codigo.png"))); // NOI18N
        jLabel3.setText("Código Barra :");

        codigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBarraActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/categoria.jpg"))); // NOI18N
        jLabel4.setText("Categoría :");

        categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Babero", "Ropa", "Pijama", " " }));
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/color.png"))); // NOI18N
        jLabel6.setText("Color :");

        color.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        tablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Talla", "Color", "Valor", "Tienda", "Bodega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablas);

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizarProducto.jpg"))); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscar)
                                .addGap(84, 84, 84)
                                .addComponent(modificar)
                                .addGap(91, 91, 91)
                                .addComponent(eliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar)
                    .addComponent(eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        
        //String edad= (String) edad.getSelectedItem();;      
        int cat= categoria.getSelectedIndex();
        String venta=(String) precio.getSelectedItem();
        String  colour= color.getText();
        String tallas= (String) talla.getSelectedItem();
        String cod= codigoBarra.getText();
       
        
        String consulta= "select N_producto, nombre, talla, color, valorVenta,stockTienda, stockBodega from producto where N_producto > 0";
        
        if (cat != 0) consulta=consulta + " AND Categoria_idCategoria="+ cat;
        
        if (!venta.equals(" "))  consulta=consulta + " AND valorVenta ="+ venta;
        
        if (!colour.equals(" "))  consulta=consulta + " AND color ="+ colour;
        
        if (!tallas.equals(" "))  consulta=consulta + " AND talla ="+ tallas;
        
        if (!cod.equals(" "))  consulta=consulta + " AND codigoBarra=" + cod;
        
        consulta= consulta +";";

        try {
            Producto.rescatarProducto(consulta, tablas, lista_id);
            //this.dispose();
          
        } catch (SQLException ex) {
            Logger.getLogger(EditarProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_buscarActionPerformed

    private void codigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBarraActionPerformed
       
         
        
        
    }//GEN-LAST:event_codigoBarraActionPerformed

    private void tallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tallaActionPerformed
        
        
        
        
        
        
        
       
    }//GEN-LAST:event_tallaActionPerformed

    public String[] getTalla (String edad){
        
        if(edad.equals("Año")){
            
            String[] combo1= new String[6];
            
            combo1[0] = "1 Año";
            combo1[1] = "2 Años";
            combo1[2] = "3 Años";
            combo1[3] = "4 Años";
            combo1[4] = "5 Años";
            combo1[5] = "6 Años o más";
            
            return combo1;

        }
        
        else if (edad.equals("Meses")){
            
            String[] combo2= new String[4];
            
            combo2[0] ="0 - 3 Meses";
            combo2[1] ="4 - 6 Meses";
            combo2[2] ="7 - 9 Meses";
            combo2[3] ="10 - 11 Meses";
            
            return combo2;

        }
        
        return null;
    
    }
    
    
    private void edadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edadItemStateChanged
       
        if (evt.getStateChange() == ItemEvent.SELECTED){
        
            if (this.edad.getSelectedIndex() >0){
            
                this.talla.setModel(new DefaultComboBoxModel (this.getTalla(this.edad.getSelectedItem().toString())));
            
            }
        
        }
        
        
    }//GEN-LAST:event_edadItemStateChanged

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed



        


    }//GEN-LAST:event_categoriaActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

    if (tablas.getSelectedRow() != -1){
        
        try {
            Producto.mostrarProducto(lista_id.get(tablas.getSelectedRow()));
            
        } catch (SQLException ex) {
            Logger.getLogger(EditarProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un producto.");
       
    }
        
        
        

    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

     

    
        
        
        

    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox categoria;
    private javax.swing.JTextField codigoBarra;
    private javax.swing.JTextField color;
    private javax.swing.JComboBox edad;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox precio;
    private javax.swing.JLabel precioMin;
    private javax.swing.JTable tablas;
    private javax.swing.JComboBox talla;
    // End of variables declaration//GEN-END:variables
}