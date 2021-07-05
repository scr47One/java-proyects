package Ventanas;

import Clases.AlmacenC;
import Clases.BasedeDatos;
import Clases.DepartamentosC;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Almacen extends javax.swing.JFrame {

    public DefaultTableModel modeloTablaProductos = new DefaultTableModel();
    static DefaultComboBoxModel<DepartamentosC> modeloDepartamento = new DefaultComboBoxModel<>();
    BasedeDatos base = new BasedeDatos();
    public static AlmacenC productoSeleccionado = null;
    
    public Almacen() {
        initComponents();
        if (tablaProductos.getColumnCount() == 0) {
            cargarColumnasTabla();
        } else {
        }
        llenarComboDepartamentos();
        llenarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        clavpro = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        comboDepartamento = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Existencia");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, 98, -1));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/borrar.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 265, 70, 70));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Precion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, 78, -1));

        clavpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavproActionPerformed(evt);
            }
        });
        getContentPane().add(clavpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 161, -1));
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 207, 161, -1));
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 197, 161, 41));
        getContentPane().add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 265, 60, 22));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 305, 60, 22));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Almacen ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/insertar.png"))); // NOI18N
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 265, 70, 70));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Clave del producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 161, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Departamento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 89, 199, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Nombre del producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 178, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Descripcion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 164, 106, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Insertar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 341, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Borrar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 341, -1, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/iniciio.jpg"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        jLabel12.setText("Presiona para volver al inicio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Buscar:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 100, -1));

        tablaProductos.setModel(modeloTablaProductos);
        tablaProductos.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged (ListSelectionEvent event){
                    if(!event.getValueIsAdjusting() && (tablaProductos.getSelectedRow() >= 0)){
                        int filaSeleccionada = tablaProductos.getSelectedRow();

                        AlmacenC p = (AlmacenC) modeloTablaProductos.getValueAt(filaSeleccionada, 2);

                        DepartamentosC d = (DepartamentosC) modeloDepartamento.getSelectedItem();

                        clavpro.setText(String.valueOf(p.getIdProducto()));
                        modeloDepartamento.setSelectedItem(d);
                        nom.setText(p.getNombre());
                        desc.setText(p.getDescripcion());
                        txtExistencia.setText(String.valueOf(p.getExistencia()));
                        txtPrecio.setText(String.valueOf(p.getPrecio()));

                        productoSeleccionado = p;
                    }
                }
            }
        );
        jScrollPane1.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 410, 330));

        comboDepartamento.setModel(modeloDepartamento);
        getContentPane().add(comboDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 180, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarColumnasTabla() {
        
        modeloTablaProductos.addColumn("Id producto");
        modeloTablaProductos.addColumn("Id departamento");
        modeloTablaProductos.addColumn("Nombre Producto");
        modeloTablaProductos.addColumn("Descripcion");
        modeloTablaProductos.addColumn("Existencia");
        modeloTablaProductos.addColumn("Precio");
    }

    private void llenarModeloTabla() {
        ArrayList<AlmacenC> listaProductos = base.consultarProductos();
        int numeroProductos = listaProductos.size();
        modeloTablaProductos.setNumRows(numeroProductos);
        for (int i = 0; i < numeroProductos; i++) {
            AlmacenC a = listaProductos.get(i);
            int idP = a.getIdProducto();
            int idD = a.getIdDepartamento();
            String descripcion = a.getDescripcion();
            int exi = a.getExistencia();
            double precio = a.getPrecio();
            modeloTablaProductos.setValueAt(idP, i, 0);
            modeloTablaProductos.setValueAt(idD, i, 1);
            modeloTablaProductos.setValueAt(a, i, 2);
            modeloTablaProductos.setValueAt(descripcion, i, 3);
            modeloTablaProductos.setValueAt(exi, i, 4);
            modeloTablaProductos.setValueAt(precio, i, 5);
        }
    }

    private void llenarComboDepartamentos() {
        comboDepartamento.removeAllItems();
        ArrayList<DepartamentosC> lista = base.consultarDepartamentos();
        for (DepartamentosC producto : lista) {
            modeloDepartamento.addElement(producto);
        }
    }
    
    public void limpiarTabla() {
        int numFilas = modeloTablaProductos.getRowCount();
        if (numFilas > 0) {
            for (int i = numFilas - 1; i >= 0; i--) {
                modeloTablaProductos.removeRow(i);
            }
        }
    }

    private void clavproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clavproActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        DepartamentosC dep = (DepartamentosC) comboDepartamento.getSelectedItem();

        int idP = Integer.parseInt(clavpro.getText());
        int idD = dep.getIdDepartamento();
        String nombre = nom.getText();
        String descripcion = desc.getText();
        int exi = Integer.parseInt(txtExistencia.getText());
        double precio = Double.parseDouble(txtPrecio.getText());

        AlmacenC alm = new AlmacenC(idP, idD, nombre, descripcion, exi, precio);

        base.insertarAlmacen(alm);
        llenarModeloTabla();
        JOptionPane.showMessageDialog(this, "El producto se ha\nagregado correctamente.");
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (productoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un producto de la tabla");
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar el producto?"); // 0 = Si, 1 = No
            if (opc == 0) {
                modeloTablaProductos.removeRow(tablaProductos.getSelectedRow());
                base.borrarAlmacen(productoSeleccionado);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (productoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un producto de la tabla");
        } else {
            new ActualizarProductos(productoSeleccionado).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        limpiarTabla();
        String cadenaBusqueda = txtBuscar.getText();
        ArrayList<AlmacenC> listaProductos = base.buscarProductos(cadenaBusqueda);
        int numeroProductos = listaProductos.size();
        modeloTablaProductos.setNumRows(numeroProductos);
        for (int i = 0; i < numeroProductos; i++) {
            AlmacenC p = listaProductos.get(i);
            int idP = p.getIdProducto();
            int idD = p.getIdDepartamento();
            String descripcion = p.getDescripcion();
            int exi = p.getExistencia();
            double precio = p.getPrecio();

            modeloTablaProductos.setValueAt(idP, i, 0);
            modeloTablaProductos.setValueAt(idD, i, 1);
            modeloTablaProductos.setValueAt(p, i, 2);
            modeloTablaProductos.setValueAt(descripcion, i, 3);
            modeloTablaProductos.setValueAt(exi, i, 4);
            modeloTablaProductos.setValueAt(precio, i, 5);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField clavpro;
    private javax.swing.JComboBox<DepartamentosC> comboDepartamento;
    private javax.swing.JTextField desc;
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
    private javax.swing.JTextField nom;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
