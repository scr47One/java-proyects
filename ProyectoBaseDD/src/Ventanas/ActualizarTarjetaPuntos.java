package Ventanas;

import Clases.BasedeDatos;
import Clases.ClientesC;
import Clases.TarjetaPuntosC;
import Clases.VentasC;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ActualizarTarjetaPuntos extends javax.swing.JFrame {

    DefaultComboBoxModel<ClientesC> modeloClientes = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<VentasC> modeloVentas = new DefaultComboBoxModel<>();
    BasedeDatos base = new BasedeDatos();

    public ActualizarTarjetaPuntos(TarjetaPuntosC t) {
        initComponents();
        llenarComboClientes();
        llenarComboVentas();
        llenarCajas(t);
    }
    
    private void llenarCajas(TarjetaPuntosC t) {
        String numTarjeta = t.getNumeroTarjeta();
        Date vencimiento = t.getVencimientoPuntos();
        int totalPuntos = t.getTotalPuntos();

        clavetar.setText(String.valueOf(t));
        numtar.setText(numTarjeta);
        vencp.setText(vencimiento.toString());
        totalp.setText(String.valueOf(totalPuntos));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clavetar = new javax.swing.JTextField();
        numtar = new javax.swing.JTextField();
        vencp = new javax.swing.JTextField();
        totalp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        comboCliente = new javax.swing.JComboBox<>();
        comboVenta = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Tarjeta de Puntos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Clave de la tarjeta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Cliente: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Clave de la venta: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Numero de la tarjeta:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 206, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Vencimiento de puntos: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 206, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Total de los puntos:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 288, -1, -1));
        getContentPane().add(clavetar, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 86, 97, 22));
        getContentPane().add(numtar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, 167, -1));
        getContentPane().add(vencp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 239, 191, -1));
        getContentPane().add(totalp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 321, 158, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 70));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        comboCliente.setModel(modeloClientes);
        getContentPane().add(comboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, -1));

        comboVenta.setModel(modeloVentas);
        getContentPane().add(comboVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 80, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 490, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        try
        {
            int idTarjeta = Integer.parseInt(clavetar.getText());
            String numTarjeta = numtar.getText();
            String vencimiento = vencp.getText();
            int totalPuntos = Integer.parseInt(totalp.getText());
            java.util.Date fechv= new SimpleDateFormat("dd/MM/yy").parse(vencimiento);
            ClientesC cli = (ClientesC) comboCliente.getSelectedItem();
            VentasC ven = (VentasC) comboVenta.getSelectedItem();
            int idCliente = cli.getIdCliente();
            int idVenta = ven.getIdVenta();
            
            TarjetaPuntosC tarjeta = new TarjetaPuntosC(idTarjeta, idCliente, idVenta, numTarjeta, (Date) fechv, totalPuntos);
            base.actualizarTarjeta(tarjeta, TarjetaPuntos.tarjetaSeleccionada.getIdTarjeta());
            JOptionPane.showMessageDialog(this, "La tarjeta se ha modificado correctamente.");
            this.dispose();
            new TarjetaPuntos().setVisible(true);
        } catch (ParseException ex)
        {
            Logger.getLogger(ActualizarTarjetaPuntos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new TarjetaPuntos().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void llenarComboClientes() {
        comboCliente.removeAllItems();
        ArrayList<ClientesC> lista = base.consultarClientes();
        for (ClientesC producto : lista) {
            modeloClientes.addElement(producto);
        }
    }

    private void llenarComboVentas() {
        comboVenta.removeAllItems();
        ArrayList<VentasC> lista = base.consultarVentas();
        for (VentasC producto : lista) {
            modeloVentas.addElement(producto);
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
            java.util.logging.Logger.getLogger(TarjetaPuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarjetaPuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarjetaPuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarjetaPuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarjetaPuntos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField clavetar;
    private javax.swing.JComboBox<ClientesC> comboCliente;
    private javax.swing.JComboBox<VentasC> comboVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numtar;
    private javax.swing.JTextField totalp;
    private javax.swing.JTextField vencp;
    // End of variables declaration//GEN-END:variables
}
