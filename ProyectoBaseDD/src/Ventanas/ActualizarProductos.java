package Ventanas;

import Clases.AlmacenC;
import Clases.BasedeDatos;
import Clases.DepartamentosC;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ActualizarProductos extends javax.swing.JFrame {

    DefaultComboBoxModel<DepartamentosC> modeloDepartamento = new DefaultComboBoxModel<>();
    BasedeDatos base = new BasedeDatos();

    public ActualizarProductos(AlmacenC a) {
        initComponents();
        llenarCajas(a);
        llenarComboDepartamentos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clavpro = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboDepartamento = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Existencia");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, 98, -1));

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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        comboDepartamento.setModel(modeloDepartamento);
        getContentPane().add(comboDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 180, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void llenarCajas(AlmacenC a) {

        int idP = a.getIdProducto();
        String nombre = a.getNombre();
        String descripcion = a.getDescripcion();
        int exi = a.getExistencia();
        double precio = a.getPrecio();

        clavpro.setText(String.valueOf(idP));
        nom.setText(nombre);
        desc.setText(descripcion);
        txtExistencia.setText(String.valueOf(exi));
        txtPrecio.setText(String.valueOf(precio));

    }

    private void clavproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clavproActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        DepartamentosC dep = (DepartamentosC) comboDepartamento.getSelectedItem();

        int idP = Integer.parseInt(clavpro.getText());
        int idD = dep.getIdDepartamento();
        String nombre = nom.getText();
        String descripcion = desc.getText();
        int exi = Integer.parseInt(txtExistencia.getText());
        double precio = Double.parseDouble(txtPrecio.getText());

        AlmacenC alm = new AlmacenC(idP, idD, nombre, descripcion, exi, precio);

        base.actualizarAlmacen(alm, Almacen.productoSeleccionado.getIdProducto());
        JOptionPane.showMessageDialog(this, "El producto se ha\nmodificado correctamente.");
        this.dispose();
        new Almacen().setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new Almacen().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void llenarComboDepartamentos() {
        comboDepartamento.removeAllItems();
        comboDepartamento.removeAllItems();
        ArrayList<DepartamentosC> lista = base.consultarDepartamentos();
        for (DepartamentosC producto : lista) {
            modeloDepartamento.addElement(producto);
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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField clavpro;
    private javax.swing.JComboBox<DepartamentosC> comboDepartamento;
    private javax.swing.JTextField desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
