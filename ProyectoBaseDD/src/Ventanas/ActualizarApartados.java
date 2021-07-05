package Ventanas;

import Clases.AlmacenC;
import Clases.ApartadosC;
import Clases.BasedeDatos;
import Clases.ClientesC;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ActualizarApartados extends javax.swing.JFrame {

    static DefaultComboBoxModel<ClientesC> modeloClientes = new DefaultComboBoxModel<>();
    static DefaultComboBoxModel<AlmacenC> modeloProductos = new DefaultComboBoxModel<>();
    BasedeDatos base = new BasedeDatos();

    public ActualizarApartados(ApartadosC a) {
        initComponents();
        llenarComboClientes();
        llenarComboProductos();
        llenarCajas(a);
    }

    private void llenarCajas(ApartadosC a) {

        String descripcion = a.getDescripcion();
        int cantidad = a.getCantidad();
        int adelanto = a.getAdelanto();
        String fecha = a.getVencimientoPago();

        claveapa.setText(String.valueOf(a));
        desc.setText(descripcion);
        canti.setText(String.valueOf(cantidad));
        adel.setText(String.valueOf(adelanto));
        vencpa.setText(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        claveapa = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        canti = new javax.swing.JTextField();
        adel = new javax.swing.JTextField();
        vencpa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        comboClientes = new javax.swing.JComboBox<>();
        comboProductos = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Apartados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 119, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Cliente: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Producto: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Clave del apartado: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Descripcion: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Cantidad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Adelanto ($):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Vencimiento de pago:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(claveapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 67, 116, 22));
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 115, -1));

        canti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantiActionPerformed(evt);
            }
        });
        getContentPane().add(canti, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 115, -1));

        adel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelActionPerformed(evt);
            }
        });
        getContentPane().add(adel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 115, -1));
        getContentPane().add(vencpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 113, 22));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 450, 70));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        comboClientes.setModel(modeloClientes);
        getContentPane().add(comboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 240, -1));

        comboProductos.setModel(modeloProductos);
        getContentPane().add(comboProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 210, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 450, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantiActionPerformed

    private void adelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adelActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int idApartado = Integer.parseInt(claveapa.getText());
        String descripcion = desc.getText();
        int cantidad = Integer.parseInt(canti.getText());
        int adelanto = Integer.parseInt(adel.getText());
        String fecha = vencpa.getText();
        ClientesC cli = (ClientesC) comboClientes.getSelectedItem();
        AlmacenC pro = (AlmacenC) comboProductos.getSelectedItem();
        int idCliente = cli.getIdCliente();
        int idProducto = pro.getIdProducto();

        ApartadosC apa = new ApartadosC(idApartado, idCliente, idProducto, descripcion, cantidad, adelanto, fecha);
        base.actualizarApartado(apa, Apartados.apartadoSeleccionado.getIdApartado());
        JOptionPane.showMessageDialog(this, "El apartado se ha\n modificado correctamente.");
        this.dispose();
        new Apartados().setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new Apartados().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void llenarComboClientes() {
        comboClientes.removeAllItems();
        ArrayList<ClientesC> lista = base.consultarClientes();
        for (ClientesC producto : lista) {
            modeloClientes.addElement(producto);
        }
    }

    private void llenarComboProductos() {
        comboProductos.removeAllItems();
        ArrayList<AlmacenC> lista = base.consultarProductos();
        for (AlmacenC producto : lista) {
            modeloProductos.addElement(producto);
        }
    }

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
            java.util.logging.Logger.getLogger(ActualizarApartados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarApartados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarApartados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarApartados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarApartados(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adel;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField canti;
    private javax.swing.JTextField claveapa;
    private javax.swing.JComboBox<ClientesC> comboClientes;
    private javax.swing.JComboBox<AlmacenC> comboProductos;
    private javax.swing.JTextField desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField vencpa;
    // End of variables declaration//GEN-END:variables
}
