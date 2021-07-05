package Ventanas;

import Clases.AlmacenC;
import Clases.BasedeDatos;
import Clases.EntregasC;
import Clases.ProveedoresC;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ActualizarEntregas extends javax.swing.JFrame {

    DefaultComboBoxModel<ProveedoresC> modeloProveedores = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<AlmacenC> modeloProductos = new DefaultComboBoxModel<>();
    BasedeDatos base = new BasedeDatos();

    public ActualizarEntregas(EntregasC e) {
        initComponents();
        llenarCajas(e);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        canti = new javax.swing.JTextField();
        comboProveedores = new javax.swing.JComboBox<>();
        comboProductos = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Producto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Proveedor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Entregas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        canti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantiActionPerformed(evt);
            }
        });
        getContentPane().add(canti, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 96, -1));

        comboProveedores.setModel(modeloProveedores);
        comboProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(comboProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, -1));

        comboProductos.setModel(modeloProductos);
        getContentPane().add(comboProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 700));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantiActionPerformed

    private void llenarCajas(EntregasC e) {

        int cantidad = e.getCantidad();

        canti.setText(String.valueOf(cantidad));

    }

    private void llenarComboProveedor() {
        comboProveedores.removeAllItems();
        ArrayList<ProveedoresC> lista = base.consultarProveedores();
        for (ProveedoresC proveedor : lista) {
            modeloProveedores.addElement(proveedor);
        }
    }

    private void llenarComboProductos() {
        comboProductos.removeAllItems();
        ArrayList<AlmacenC> lista = base.consultarProductos();
        for (AlmacenC producto : lista) {
            modeloProductos.addElement(producto);
        }
    }

    private void comboProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProveedoresActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int cantidad = Integer.parseInt(canti.getText());

        AlmacenC producto = (AlmacenC) comboProductos.getSelectedItem();
        ProveedoresC proveedor = (ProveedoresC) comboProveedores.getSelectedItem();

        Calendar calendario = Calendar.getInstance();
        java.util.Date fechaActual = calendario.getTime();
        long fechaMiliegundos = fechaActual.getTime();
        java.sql.Date fecha = new java.sql.Date(fechaMiliegundos);

        EntregasC entrega = new EntregasC(producto.getIdProducto(), proveedor.getIdProveedor(), cantidad, fecha);

        base.actualizarEntrega(entrega, Entregas.pSeleccionado.getIdProducto());
        JOptionPane.showMessageDialog(this, "La entrega se ha\nmodificado correctamente.");
        this.dispose();
        new Entregas().setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new Entregas().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarComboProductos();
        llenarComboProveedor();
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entregas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField canti;
    private javax.swing.JComboBox<AlmacenC> comboProductos;
    private javax.swing.JComboBox<ProveedoresC> comboProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
