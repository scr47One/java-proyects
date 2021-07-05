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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class TarjetaPuntos extends javax.swing.JFrame {

    public DefaultTableModel modeloTablaTarjetas = new DefaultTableModel();
    static DefaultComboBoxModel<ClientesC> modeloClientes = new DefaultComboBoxModel<>();
    static DefaultComboBoxModel<VentasC> modeloVentas = new DefaultComboBoxModel<>();
    BasedeDatos base = new BasedeDatos();
    public static TarjetaPuntosC tarjetaSeleccionada = null;

    public TarjetaPuntos() {
        initComponents();
        if (tablaTarjetas.getColumnCount() == 0) {
            cargarColumnasTabla();
        } else {
        }
        llenarModeloTabla();
        llenarComboClientes();
        llenarComboVentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

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
        btnBorrar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTarjetas = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        comboCliente = new javax.swing.JComboBox<>();
        comboVenta = new javax.swing.JComboBox<>();
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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

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

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/borrar.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 70, 70));

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/insertar.png"))); // NOI18N
        btnInsertar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 70, 70));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/iniciio.jpg"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 40, 40));

        jLabel10.setText("Presiona para volver al inicio");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 70));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Buscar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        buscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                buscarKeyReleased(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 110, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Insertar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setText("Borrar");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        tablaTarjetas.setModel(modeloTablaTarjetas);
        tablaTarjetas.getSelectionModel().addListSelectionListener(
            new ListSelectionListener()
            {
                public void valueChanged (ListSelectionEvent event)
                {
                    if(!event.getValueIsAdjusting() && (tablaTarjetas.getSelectedRow() >= 0))
                    {
                        int filaSeleccionada = tablaTarjetas.getSelectedRow();

                        TarjetaPuntosC t = (TarjetaPuntosC) modeloTablaTarjetas.getValueAt(filaSeleccionada, 0);

                        clavetar.setText(String.valueOf(t.getIdTarjeta()));
                        numtar.setText(t.getNumeroTarjeta());
                        vencp.setText(t.getVencimientoPuntos().toString());
                        totalp.setText(String.valueOf(t.getTotalPuntos()));

                        tarjetaSeleccionada = t;
                    }
                }
            }
        );
        jScrollPane1.setViewportView(tablaTarjetas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 450, 160));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        comboCliente.setModel(modeloClientes);
        getContentPane().add(comboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, -1));

        comboVenta.setModel(modeloVentas);
        getContentPane().add(comboVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 110, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 490, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int idTarjeta = Integer.parseInt(clavetar.getText());
        String numTarjeta = numtar.getText();
        String vencimiento = vencp.getText();
        try
        {
            java.util.Date fechv= new SimpleDateFormat("dd/MM/yy").parse(vencimiento);
        
        int totalPuntos = Integer.parseInt(totalp.getText());

        ClientesC cli = (ClientesC) comboCliente.getSelectedItem();
        VentasC ven = (VentasC) comboVenta.getSelectedItem();
        int idCliente = cli.getIdCliente();
        int idVenta = ven.getIdVenta();

        TarjetaPuntosC tarjeta = new TarjetaPuntosC(idTarjeta, idCliente, idVenta, numTarjeta, (Date) fechv, totalPuntos);
        base.insertarTarjetaPuntos(tarjeta);
        llenarModeloTabla();
        JOptionPane.showMessageDialog(this, "La tarjeta se ha agregado correctamente.");
        } catch (ParseException ex)
        {
            Logger.getLogger(TarjetaPuntos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (tarjetaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione una tarjeta de la tabla");
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar la tarjeta?"); // 0 = Si, 1 = No
            if (opc == 0) {
                modeloTablaTarjetas.removeRow(tablaTarjetas.getSelectedRow());
                base.borrarTarjeta(tarjetaSeleccionada);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (tarjetaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione una tarjeta de la tabla");
        } else {
            new ActualizarTarjetaPuntos(tarjetaSeleccionada).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        limpiarTabla();
        String cadenaBusqueda = buscar.getText();
        ArrayList<TarjetaPuntosC> listaTarjeta = base.buscarTarjeta(cadenaBusqueda);
        int numeroClientes = listaTarjeta.size();
        modeloTablaTarjetas.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++) {
            TarjetaPuntosC t = listaTarjeta.get(i);
            int idCliente = t.getIdCliente();
            int idVenta = t.getIdVenta();
            String numTarjeta = t.getNumeroTarjeta();
            Date vencimiento = t.getVencimientoPuntos();
            int totalPuntos = t.getTotalPuntos();

            modeloTablaTarjetas.setValueAt(t, i, 0);
            modeloTablaTarjetas.setValueAt(idCliente, i, 1);
            modeloTablaTarjetas.setValueAt(idVenta, i, 2);
            modeloTablaTarjetas.setValueAt(numTarjeta, i, 3);
            modeloTablaTarjetas.setValueAt(vencimiento, i, 4);
            modeloTablaTarjetas.setValueAt(totalPuntos, i, 5);
        }
    }//GEN-LAST:event_buscarKeyReleased

    private void cargarColumnasTabla() {
        modeloTablaTarjetas.addColumn("Id tarjeta");
        modeloTablaTarjetas.addColumn("Id cliente");
        modeloTablaTarjetas.addColumn("Id venta");
        modeloTablaTarjetas.addColumn("Numero Tarjeta");
        modeloTablaTarjetas.addColumn("Vencimiento de puntos");
        modeloTablaTarjetas.addColumn("Total de puntos");
    }

    private void llenarModeloTabla() {
        ArrayList<TarjetaPuntosC> listaProveedores = base.consultarTarjeta();
        int numeroClientes = listaProveedores.size();
        modeloTablaTarjetas.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++) {
            TarjetaPuntosC t = listaProveedores.get(i);
//            int idTarjeta = Integer.parseInt(clavetar.getText());
            int idCliente = t.getIdCliente();
            int idVenta = t.getIdVenta();
            String numTarjeta = t.getNumeroTarjeta();
            Date vencimiento = t.getVencimientoPuntos();
            int totalPuntos = t.getTotalPuntos();

            modeloTablaTarjetas.setValueAt(t, i, 0);
            modeloTablaTarjetas.setValueAt(idCliente, i, 1);
            modeloTablaTarjetas.setValueAt(idVenta, i, 2);
            modeloTablaTarjetas.setValueAt(numTarjeta, i, 3);
            modeloTablaTarjetas.setValueAt(vencimiento, i, 4);
            modeloTablaTarjetas.setValueAt(totalPuntos, i, 5);
        }
    }

    public void limpiarTabla() {
        int numFilas = modeloTablaTarjetas.getRowCount();
        if (numFilas > 0) {
            for (int i = numFilas - 1; i >= 0; i--) {
                modeloTablaTarjetas.removeRow(i);
            }
        }
    }

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
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField clavetar;
    private javax.swing.JComboBox<ClientesC> comboCliente;
    private javax.swing.JComboBox<VentasC> comboVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numtar;
    private javax.swing.JTable tablaTarjetas;
    private javax.swing.JTextField totalp;
    private javax.swing.JTextField vencp;
    // End of variables declaration//GEN-END:variables
}
