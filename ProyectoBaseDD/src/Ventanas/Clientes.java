package Ventanas;

import Clases.BasedeDatos;
import Clases.ClientesC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {

    public static DefaultTableModel modeloTablaClientes = new DefaultTableModel();
    BasedeDatos base = new BasedeDatos();
    public static ClientesC clienteSeleccionado = null;

    public Clientes() {
        
        initComponents();
        if (tablaClientes.getColumnCount() == 0) {
            cargarColumnasTabla();
        } else{}
        llenarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        nomcli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        apcli = new javax.swing.JTextField();
        rfccli = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailcli = new javax.swing.JTextField();
        buscarcli = new javax.swing.JTextField();
        telcli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        clavecli = new javax.swing.JTextField();
        amcli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnInicio = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 103, 25));
        getContentPane().add(nomcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 156, 29));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("RFC");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 103, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Apellido Paterno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 143, 25));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Buscar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 77, 25));
        getContentPane().add(apcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 156, 29));
        getContentPane().add(rfccli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 156, 29));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("E-mail");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 103, 25));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Telefono ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 103, 25));
        getContentPane().add(emailcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 156, 29));

        buscarcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarcliKeyReleased(evt);
            }
        });
        getContentPane().add(buscarcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 156, 29));
        getContentPane().add(telcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 156, 29));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Apellido Materno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 144, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 93, 25));

        btnInsertar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/insertar.png"))); // NOI18N
        btnInsertar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 70, 70));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Clave del cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 166, 25));

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/borrar.png"))); // NOI18N
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 70, 70));
        getContentPane().add(clavecli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 156, 29));
        getContentPane().add(amcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 156, 29));

        tablaClientes.setModel(modeloTablaClientes);
        tablaClientes.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged (ListSelectionEvent event){
                    if(!event.getValueIsAdjusting() && (tablaClientes.getSelectedRow() >= 0)){
                        int filaSeleccionada = tablaClientes.getSelectedRow();
                        ClientesC c = (ClientesC) modeloTablaClientes.getValueAt(filaSeleccionada, 1);

                        clavecli.setText(String.valueOf(c.getIdCliente()));
                        nomcli.setText(c.getNombrec());
                        apcli.setText(c.getApellidopc());
                        amcli.setText(c.getApellidomc());
                        rfccli.setText(c.getRFC());
                        telcli.setText(c.getTelefono());
                        emailcli.setText(c.getEmail());

                        clienteSeleccionado = c;
                    }
                }
            }
        );
        tablaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 600, 380));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/iniciio.jpg"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 40, 40));

        jLabel10.setText("Presiona para volver al inicio");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setText("Insertar");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 610, 870));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Borrar");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (clienteSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un cliente de la tabla");
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar el cliente?"); // 0 = Si, 1 = No
            if (opc == 0) {
                modeloTablaClientes.removeRow(tablaClientes.getSelectedRow());
                base.borrarCliente(clienteSeleccionado);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int clave = Integer.parseInt(clavecli.getText());
        String nombre = nomcli.getText();
        String apellidop = apcli.getText();
        String apellidom = amcli.getText();
        String rfc = rfccli.getText();
        String telefono = telcli.getText();
        String email = emailcli.getText();

        ClientesC clie = new ClientesC(clave, nombre, apellidop, apellidom, rfc, telefono, email);
        base.insertarClientes(clie);
        llenarModeloTabla();
        JOptionPane.showMessageDialog(this, "El cliente se ha\nagregado correctamente.");
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void tablaClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaClientesKeyReleased

    }//GEN-LAST:event_tablaClientesKeyReleased

    private void buscarcliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarcliKeyReleased
        limpiarTabla();
        String cadenaBusqueda = buscarcli.getText();
        ArrayList<ClientesC> listaClientes = base.buscarClientes(cadenaBusqueda);
        int numeroClientes = listaClientes.size();
        modeloTablaClientes.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++) {
            ClientesC c = listaClientes.get(i);
            int clave = c.getIdCliente();
//            String nombre = c.getNombrec();
            String apeP = c.getApellidopc();
            String apeM = c.getApellidomc();
            String rfc = c.getRFC();
            String telefono = c.getTelefono();
            String email = c.getEmail();

            modeloTablaClientes.setValueAt(clave, i, 0);
            modeloTablaClientes.setValueAt(c, i, 1);
            modeloTablaClientes.setValueAt(apeP, i, 2);
            modeloTablaClientes.setValueAt(apeM, i, 3);
            modeloTablaClientes.setValueAt(rfc, i, 4);
            modeloTablaClientes.setValueAt(telefono, i, 5);
            modeloTablaClientes.setValueAt(email, i, 6);
        }
    }//GEN-LAST:event_buscarcliKeyReleased

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (clienteSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un cliente de la tabla");
        } else {
            
            new ActualizarClientes(clienteSeleccionado).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cargarColumnasTabla() {
        modeloTablaClientes.addColumn("Id cliente");
        modeloTablaClientes.addColumn("Nombre");
        modeloTablaClientes.addColumn("Apellido Paterno");
        modeloTablaClientes.addColumn("Apellido Materno");
        modeloTablaClientes.addColumn("RFC");
        modeloTablaClientes.addColumn("Telefono");
        modeloTablaClientes.addColumn("Email");
    }

    private void llenarModeloTabla() {
        ArrayList<ClientesC> listaProducto = base.consultarClientes();
        int numeroClientes = listaProducto.size();
        modeloTablaClientes.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++) {
            ClientesC c = listaProducto.get(i);
            int id = c.getIdCliente();
            String apeP = c.getApellidopc();
            String apeM = c.getApellidomc();
            String rfc = c.getRFC();
            String telefono = c.getTelefono();
            String email = c.getEmail();
            modeloTablaClientes.setValueAt(id, i, 0);
            modeloTablaClientes.setValueAt(c, i, 1);
            modeloTablaClientes.setValueAt(apeP, i, 2);
            modeloTablaClientes.setValueAt(apeM, i, 3);
            modeloTablaClientes.setValueAt(rfc, i, 4);
            modeloTablaClientes.setValueAt(telefono, i, 5);
            modeloTablaClientes.setValueAt(email, i, 6);
        }
    }

    public void limpiarTabla() {
        int numFilas = modeloTablaClientes.getRowCount();
        if (numFilas > 0) {
            for (int i = numFilas - 1; i >= 0; i--) {
                modeloTablaClientes.removeRow(i);
            }
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amcli;
    private javax.swing.JTextField apcli;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField buscarcli;
    private javax.swing.JTextField clavecli;
    private javax.swing.JTextField emailcli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomcli;
    private javax.swing.JTextField rfccli;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField telcli;
    // End of variables declaration//GEN-END:variables
}
