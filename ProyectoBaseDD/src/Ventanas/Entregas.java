package Ventanas;

import Clases.AlmacenC;
import Clases.BasedeDatos;
import Clases.EntregasC;
import Clases.ProveedoresC;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Entregas extends javax.swing.JFrame {

    static DefaultComboBoxModel<ProveedoresC> modeloProveedores = new DefaultComboBoxModel<>();
    public DefaultTableModel modeloTablaEntregas = new DefaultTableModel();
    BasedeDatos base = new BasedeDatos();
    public static EntregasC pSeleccionado = null;

    public Entregas() {
        initComponents();
        if (tablaEntregas.getColumnCount() == 0) {
            cargarColumnasTabla();
        } else {}
        llenarModeloTabla();
        llenarComboProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        canti = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntregas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboProveedores = new javax.swing.JComboBox<>();
        btnInicio = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().add(canti, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 110, -1));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/insertar.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 114, 70, 70));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/borrar.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 114, 70, 70));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Buscar:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, -1, -1));

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 264, 96, -1));

        tablaEntregas.setModel(modeloTablaEntregas);
        tablaEntregas.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged (ListSelectionEvent event){
                    if(!event.getValueIsAdjusting() && (tablaEntregas.getSelectedRow() >= 0)){
                        int filaSeleccionada = tablaEntregas.getSelectedRow();

                        EntregasC e = (EntregasC) modeloTablaEntregas.getValueAt(filaSeleccionada, 0);

                        ProveedoresC  prove = (ProveedoresC) comboProveedores.getSelectedItem();

                        comboProveedores.setSelectedItem(prove);
                        canti.setText(String.valueOf(e.getCantidad()));

                        pSeleccionado = e;
                    }
                }
            }
        );
        tablaEntregas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEntregasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEntregas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 316, 490, 350));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Insertar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Borrar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 190, -1, -1));

        comboProveedores.setModel(modeloProveedores);
        comboProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(comboProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 180, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/iniciio.jpg"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, 40));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel11.setText("Presiona para volver al inicio");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, -1));

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

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int idprodu = Integer.parseInt(txtIdProducto.getText());
        int cantidad = Integer.parseInt(canti.getText());
        
//        AlmacenC producto = (AlmacenC) comboProductos.getSelectedItem();
        ProveedoresC proveedor = (ProveedoresC) comboProveedores.getSelectedItem();
        
        Calendar calendario = Calendar.getInstance();
        java.util.Date fechaActual = calendario.getTime();
        long fechaMiliegundos = fechaActual.getTime();
        java.sql.Date fecha = new java.sql.Date(fechaMiliegundos);

        EntregasC entrega = new EntregasC(idprodu, proveedor.getIdProveedor(), cantidad, fecha);

        base.insertarEntregas(entrega);
        
        base.sumarCanti(cantidad,idprodu);
        
        llenarModeloTabla();
        JOptionPane.showMessageDialog(this, "La entrega se ha\nagregado correctamente.");
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        limpiarTabla();
        String cadenaBusqueda = buscar.getText();
        ArrayList<EntregasC> listaEntregas = base.buscarEntregas(cadenaBusqueda);
        int numeroEntregas = listaEntregas.size();
        modeloTablaEntregas.setNumRows(numeroEntregas);
        for (int i = 0; i < numeroEntregas; i++) {
            EntregasC e = listaEntregas.get(i);
            int idprove = e.getIdProveedor();
            int cantidad = e.getCantidad();
            Date fecha = e.getFecha();

            modeloTablaEntregas.setValueAt(e, i, 0);
            modeloTablaEntregas.setValueAt(idprove, i, 1);
            modeloTablaEntregas.setValueAt(cantidad, i, 2);
            modeloTablaEntregas.setValueAt(fecha, i, 3);
        }
    }//GEN-LAST:event_buscarKeyReleased

    private void llenarComboProveedor() {
        comboProveedores.removeAllItems();
        ArrayList<ProveedoresC> lista = base.consultarProveedores();
        for (ProveedoresC proveedor : lista) {
            modeloProveedores.addElement(proveedor);
        }
    }

    private void cargarColumnasTabla() {
        modeloTablaEntregas.addColumn("Id producto");
        modeloTablaEntregas.addColumn("Id proveedor");
        modeloTablaEntregas.addColumn("Cantidad");
        modeloTablaEntregas.addColumn("Fecha");
    }

    private void llenarModeloTabla() {
        ArrayList<EntregasC> listaEntregas = base.consultarEntregas();
        int numeroEntregas = listaEntregas.size();
        modeloTablaEntregas.setNumRows(numeroEntregas);
        for (int i = 0; i < numeroEntregas; i++) {
            EntregasC a = listaEntregas.get(i);
//            int idProd = a.getIdProducto();
            int idProve = a.getIdProveedor();
            int cantidad = a.getCantidad();
            Date fecha = a.getFecha();
            modeloTablaEntregas.setValueAt(a, i, 0);
            modeloTablaEntregas.setValueAt(idProve, i, 1);
            modeloTablaEntregas.setValueAt(cantidad, i, 2);
            modeloTablaEntregas.setValueAt(fecha, i, 3);
        }
    }

    public void limpiarTabla() {
        int numFilas = modeloTablaEntregas.getRowCount();
        if (numFilas > 0) {
            for (int i = numFilas - 1; i >= 0; i--) {
                modeloTablaEntregas.removeRow(i);
            }
        }
    }

    private void comboProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProveedoresActionPerformed

    private void tablaEntregasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntregasMouseClicked
      
    }//GEN-LAST:event_tablaEntregasMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (pSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione una entregade la tabla");
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar la entrega?"); // 0 = Si, 1 = No
            if (opc == 0) {
                modeloTablaEntregas.removeRow(tablaEntregas.getSelectedRow());
                base.borrarEntrega(pSeleccionado);
                llenarModeloTabla();
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (pSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione una entrega de la tabla");
        } else {
            new ActualizarEntregas(pSeleccionado).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

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
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField canti;
    private javax.swing.JComboBox<ProveedoresC> comboProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEntregas;
    private javax.swing.JTextField txtIdProducto;
    // End of variables declaration//GEN-END:variables
}
