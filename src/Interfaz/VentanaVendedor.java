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
public class VentanaVendedor extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAdmin
     */
    public VentanaVendedor() {
        initComponents();
        setLocationRelativeTo(null); //centrado 
        setTitle("Ventana Vendedor"); //titulo
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
        ventas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        reportes = new javax.swing.JMenu();
        devoluciones = new javax.swing.JMenu();

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

        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        ventas.setText("Ventas");

        jMenuItem1.setText("Vender Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ventas.add(jMenuItem1);

        jMenuBar2.add(ventas);

        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        reportes.setText("Reportes");
        jMenuBar2.add(reportes);

        devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolucion.png"))); // NOI18N
        devoluciones.setText("Devoluciones");
        jMenuBar2.add(devoluciones);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    vendedorProducts vendedor = new vendedorProducts(escritorio);
    escritorio.add(vendedor);
    vendedor.setLocation(100, 100);
    vendedor.pack();
    vendedor.setVisible(true);
    vendedor.show();



    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JMenu devoluciones;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem finalizarDia;
    private javax.swing.JMenuItem iniciarDia;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu reportes;
    private javax.swing.JMenu tienda;
    private javax.swing.JMenu ventas;
    // End of variables declaration//GEN-END:variables
}
