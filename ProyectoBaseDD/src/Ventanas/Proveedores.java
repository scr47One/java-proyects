package Ventanas;

import Clases.BasedeDatos;
import Clases.ProveedoresC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Proveedores extends javax.swing.JFrame {

    public DefaultTableModel modeloTablaProv = new DefaultTableModel();
    BasedeDatos base = new BasedeDatos();
    public static ProveedoresC proveedorSeleccionado = null;

    public Proveedores() {
        initComponents();
        if (tablaProveedores.getColumnCount() == 0) {
            cargarColumnasTabla();
        } else {}
        llenarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        claveprov = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dirprov = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        telprov = new javax.swing.JTextField();
        nomprov = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Clave del proveedor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 171, 25));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 156, 29));
        getContentPane().add(claveprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 156, 29));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Telefono ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Direccion ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, 25));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Buscar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 77, 25));
        getContentPane().add(dirprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 156, 29));

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/insertar.png"))); // NOI18N
        btnIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 70, 70));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Nombre del proveedor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, 25));
        getContentPane().add(telprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 156, 29));
        getContentPane().add(nomprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 156, 29));

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/borrar.png"))); // NOI18N
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 70, 70));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Proveedores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 143, 25));

        tablaProveedores.setModel(modeloTablaProv);
        tablaProveedores.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged (ListSelectionEvent event){
                    if(!event.getValueIsAdjusting() && (tablaProveedores.getSelectedRow() >= 0)){
                        int filaSeleccionada = tablaProveedores.getSelectedRow();

                        ProveedoresC p = (ProveedoresC) modeloTablaProv.getValueAt(filaSeleccionada, 3);

                        claveprov.setText(String.valueOf(p.getIdProveedor()));
                        telprov.setText(p.getTelefono());
                        dirprov.setText(p.getDireccion());
                        nomprov.setText(p.getNombreProv());

                        proveedorSeleccionado = p;
                    }
                }
            }
        );
        tablaProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaProveedoresKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProveedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 540, 300));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 40));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/iniciio.jpg"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 40, 40));

        jLabel10.setText("Presiona para volver al inicio");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Ingresar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Borrar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int clave = Integer.parseInt(claveprov.getText());
        String telefono = telprov.getText();
        String direccion = dirprov.getText();
        String nombre = nomprov.getText();

        ProveedoresC prov = new ProveedoresC(clave, telefono, direccion, nombre);
        base.insertarProveedores(prov);
        llenarModeloTabla();
        JOptionPane.showMessageDialog(this, "El proveedor se ha\nagregado correctamente.");
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (proveedorSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un proveedor de la tabla");
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar el proveedor?"); // 0 = Si, 1 = No
            if (opc == 0) {
                modeloTablaProv.removeRow(tablaProveedores.getSelectedRow());
                base.borrarProveedor(proveedorSeleccionado);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tablaProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProveedoresKeyReleased

    }//GEN-LAST:event_tablaProveedoresKeyReleased

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        limpiarTabla();
        String cadenaBusqueda = txtBuscar.getText();
        ArrayList<ProveedoresC> listaProveedores = base.buscarProveedores(cadenaBusqueda);
        int numeroClientes = listaProveedores.size();
        modeloTablaProv.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++) {
            ProveedoresC p = listaProveedores.get(i);
            int id = p.getIdProveedor();
            String telefono = p.getTelefono();
            String direccion = p.getDireccion();
//            String nombre = p.getNombreProv();

            modeloTablaProv.setValueAt(id, i, 0);
            modeloTablaProv.setValueAt(telefono, i, 1);
            modeloTablaProv.setValueAt(direccion, i, 2);
            modeloTablaProv.setValueAt(p, i, 3);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (proveedorSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un proveedor de la tabla");
        } else {
            new ActualizarProveedores(proveedorSeleccionado).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cargarColumnasTabla() {
        modeloTablaProv.addColumn("Id proveedor");
        modeloTablaProv.addColumn("Telefono");
        modeloTablaProv.addColumn("Direccion");
        modeloTablaProv.addColumn("Nombre");
    }

    private void llenarModeloTabla() {
        ArrayList<ProveedoresC> listaProveedores = base.consultarProveedores();
        int numeroClientes = listaProveedores.size();
        modeloTablaProv.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++) {
            ProveedoresC p = listaProveedores.get(i);
            int id = p.getIdProveedor();
            String telefono = p.getTelefono();
            String direccion = p.getDireccion();
//            String nombre = p.getNombreProv();
            modeloTablaProv.setValueAt(id, i, 0);
            modeloTablaProv.setValueAt(telefono, i, 1);
            modeloTablaProv.setValueAt(direccion, i, 2);
            modeloTablaProv.setValueAt(p, i, 3);
        }
    }

    public void limpiarTabla() {
        int numFilas = modeloTablaProv.getRowCount();
        if (numFilas > 0) {
            for (int i = numFilas - 1; i >= 0; i--) {
                modeloTablaProv.removeRow(i);
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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField claveprov;
    private javax.swing.JTextField dirprov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomprov;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField telprov;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
