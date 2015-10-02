/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;

/**
 *
 * @author Ian Quiroga
 */
public class VentanaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAdmin
     */
    public VentanaAdmin() {
        initComponents();
        setLocationRelativeTo(null); //centrado 
        setTitle("Ventana Administrador"); //titulo
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();
        tienda = new javax.swing.JMenu();
        iniciarDia = new javax.swing.JMenuItem();
        finalizarDia = new javax.swing.JMenuItem();
        productos = new javax.swing.JMenu();
        agregarProductos = new javax.swing.JMenuItem();
        editarProducto = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        ventas = new javax.swing.JMenu();
        reportes = new javax.swing.JMenu();
        devoluciones = new javax.swing.JMenu();
        usuarios = new javax.swing.JMenu();
        agregarUsuario = new javax.swing.JMenuItem();
        editarUsuario = new javax.swing.JMenuItem();
        eliminarUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.gif"))); // NOI18N
        inicio.setText("Inicio");

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sesionCerrada.png"))); // NOI18N
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        inicio.add(cerrarSesion);

        jMenuBar2.add(inicio);

        tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tienda.png"))); // NOI18N
        tienda.setText("Tienda");

        iniciarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar.png"))); // NOI18N
        iniciarDia.setText("Iniciar día");
        iniciarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarDiaActionPerformed(evt);
            }
        });
        tienda.add(iniciarDia);

        finalizarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        finalizarDia.setText("Finalizar día");
        finalizarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarDiaActionPerformed(evt);
            }
        });
        tienda.add(finalizarDia);

        jMenuBar2.add(tienda);

        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.gif"))); // NOI18N
        productos.setText("Productos");

        agregarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarProducto.gif"))); // NOI18N
        agregarProductos.setText("Agregar Productos");
        agregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductosActionPerformed(evt);
            }
        });
        productos.add(agregarProductos);

        editarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizarProducto.jpg"))); // NOI18N
        editarProducto.setText("Editar Productos");
        editarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProductoActionPerformed(evt);
            }
        });
        productos.add(editarProducto);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarProducto.gif"))); // NOI18N
        jMenuItem3.setText("Eliminar Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        productos.add(jMenuItem3);

        jMenuBar2.add(productos);

        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        ventas.setText("Ventas");
        jMenuBar2.add(ventas);

        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        reportes.setText("Reportes");
        jMenuBar2.add(reportes);

        devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolucion.png"))); // NOI18N
        devoluciones.setText("Devoluciones");
        jMenuBar2.add(devoluciones);

        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.gif"))); // NOI18N
        usuarios.setText("Usuarios");

        agregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestionarUsuario.png"))); // NOI18N
        agregarUsuario.setText("Agregar Usuarios");
        agregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarUsuarioActionPerformed(evt);
            }
        });
        usuarios.add(agregarUsuario);

        editarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarUsuario.png"))); // NOI18N
        editarUsuario.setText("Editar Usuarios");
        editarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioActionPerformed(evt);
            }
        });
        usuarios.add(editarUsuario);

        eliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarUsuario.png"))); // NOI18N
        eliminarUsuario.setText("Eliminar Usuarios");
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });
        usuarios.add(eliminarUsuario);

        jMenuBar2.add(usuarios);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarDiaActionPerformed

    private void finalizarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizarDiaActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void agregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUsuarioActionPerformed
       
        AgregarUserOk addUser = new AgregarUserOk();
       
        
        //addUser.setLocation(150, 150);
        addUser.pack();
        
        addUser.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        addUser.setVisible(true);
        
        
        
      
      addUser.setResizable(true);
    addUser.setClosable(true); 
     escritorio.add(addUser);


        
        
    }//GEN-LAST:event_agregarUsuarioActionPerformed

    private void editarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioActionPerformed
        
        try {
            EditarUsers2 editUser = new EditarUsers2();
            
            escritorio.add(editUser).setMaximumSize(null);
            
            editUser.setLocation(150, 150);
            editUser.show();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

           
    }//GEN-LAST:event_editarUsuarioActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        
 
        
        
        
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

    private void editarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProductoActionPerformed
        
        
    EditarProducts editarProducts = new EditarProducts(escritorio);
    escritorio.add(editarProducts);
    editarProducts.setLocation(100, 100);
    editarProducts.pack();
    editarProducts.setVisible(true);
    editarProducts.show();
        
    }//GEN-LAST:event_editarProductoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void agregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductosActionPerformed
       
    AgregarProducts agregarProducts = new AgregarProducts();
    escritorio.add(agregarProducts);
    agregarProducts.setLocation(100, 100);
    agregarProducts.pack();
    agregarProducts.setVisible(true);
    agregarProducts.show();
        
        
    }//GEN-LAST:event_agregarProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarProductos;
    private javax.swing.JMenuItem agregarUsuario;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JMenu devoluciones;
    private javax.swing.JMenuItem editarProducto;
    private javax.swing.JMenuItem editarUsuario;
    private javax.swing.JMenuItem eliminarUsuario;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem finalizarDia;
    private javax.swing.JMenuItem iniciarDia;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu productos;
    private javax.swing.JMenu reportes;
    private javax.swing.JMenu tienda;
    private javax.swing.JMenu usuarios;
    private javax.swing.JMenu ventas;
    // End of variables declaration//GEN-END:variables
}
