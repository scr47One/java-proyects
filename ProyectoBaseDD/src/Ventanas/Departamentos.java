package Ventanas;

import Clases.BasedeDatos;
import Clases.DepartamentosC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Departamentos extends javax.swing.JFrame {

    public DefaultTableModel modeloTablaDep = new DefaultTableModel();
    BasedeDatos base = new BasedeDatos();
    public static DepartamentosC departamentoSeleccionado = null;

    public Departamentos() {
        initComponents();
        if (tablaDepartamentos.getColumnCount() == 0) {
            cargarColumnasTabla();
        } else {}
        llenarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        pasdep = new javax.swing.JTextField();
        nomdep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        radep = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clavedep = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buscardep = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDepartamentos = new javax.swing.JTable();
        btnInicio = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Buscar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 77, 25));
        getContentPane().add(pasdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 59, 29));
        getContentPane().add(nomdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, 29));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Rack");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 60, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Pasillo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 68, 25));

        btnInsertar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/insertar.png"))); // NOI18N
        btnInsertar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 70, 70));
        getContentPane().add(radep, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 59, 29));

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/borrar.png"))); // NOI18N
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 70, 70));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Departamentos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Clave del departamento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 25));

        clavedep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavedepActionPerformed(evt);
            }
        });
        getContentPane().add(clavedep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 156, 29));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Nombre del Departamento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 25));

        buscardep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscardepKeyReleased(evt);
            }
        });
        getContentPane().add(buscardep, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 156, 29));

        tablaDepartamentos.setModel(modeloTablaDep);
        tablaDepartamentos.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged (ListSelectionEvent event){
                    if(!event.getValueIsAdjusting() && (tablaDepartamentos.getSelectedRow() >= 0)){
                        int filaSeleccionada = tablaDepartamentos.getSelectedRow();

                        DepartamentosC d = (DepartamentosC) modeloTablaDep.getValueAt(filaSeleccionada, 1);

                        clavedep.setText(String.valueOf(d.getIdDepartamento()));
                        nomdep.setText(d.getNombreDep());
                        pasdep.setText(String.valueOf(d.getPasillo()));
                        radep.setText(String.valueOf(d.getRack()));

                        departamentoSeleccionado = d;
                    }
                }
            }
        );
        jScrollPane1.setViewportView(tablaDepartamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 540, 360));

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
        jLabel8.setText("Insertar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Borrar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (departamentoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un departamento de la tabla");
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar el departamento?"); // 0 = Si, 1 = No
            if (opc == 0) {
                modeloTablaDep.removeRow(tablaDepartamentos.getSelectedRow());
                base.borrarDepartamento(departamentoSeleccionado);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int clave = Integer.parseInt(clavedep.getText());
        String nombre = nomdep.getText();
        int pasillo = Integer.parseInt(pasdep.getText());
        int rack = Integer.parseInt(radep.getText());

        DepartamentosC dep = new DepartamentosC(clave, nombre, pasillo, rack);
        base.insertarDepartamentos(dep);
        llenarModeloTabla();
        JOptionPane.showMessageDialog(this, "El departamento se ha\nagregado correctamente.");
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void clavedepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavedepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clavedepActionPerformed

    private void buscardepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscardepKeyReleased
        limpiarTabla();
        String cadenaBusqueda = buscardep.getText();
        ArrayList<DepartamentosC> listaDepartamentos = base.buscarDepartamentos(cadenaBusqueda);
        int numeroDepartamentos = listaDepartamentos.size();
        modeloTablaDep.setNumRows(numeroDepartamentos);
        for (int i = 0; i < numeroDepartamentos; i++) {
            DepartamentosC d = listaDepartamentos.get(i);
            int id = d.getIdDepartamento();
//            String nombre = d.getNombreDep();
            int pasillo = d.getPasillo();
            int rack = d.getRack();

            modeloTablaDep.setValueAt(id, i, 0);
            modeloTablaDep.setValueAt(d, i, 1);
            modeloTablaDep.setValueAt(pasillo, i, 2);
            modeloTablaDep.setValueAt(rack, i, 3);
        }
    }//GEN-LAST:event_buscardepKeyReleased

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (departamentoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un departamento de la tabla");
        } else {
            new ActualizarDepartamentos(departamentoSeleccionado).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cargarColumnasTabla() {
        modeloTablaDep.addColumn("Id departamento");
        modeloTablaDep.addColumn("Nombre");
        modeloTablaDep.addColumn("Pasillo");
        modeloTablaDep.addColumn("Rack");
    }

    private void llenarModeloTabla() {
        ArrayList<DepartamentosC> listaDep = base.consultarDepartamentos();
        int numerodep = listaDep.size();
        modeloTablaDep.setNumRows(numerodep);
        for (int i = 0; i < numerodep; i++) {
            DepartamentosC d = listaDep.get(i);
            int id = d.getIdDepartamento();
//            String nombre = d.getNombreDep();
            int pasillo = d.getPasillo();
            int rack = d.getRack();
            modeloTablaDep.setValueAt(id, i, 0);
            modeloTablaDep.setValueAt(d, i, 1);
            modeloTablaDep.setValueAt(pasillo, i, 2);
            modeloTablaDep.setValueAt(rack, i, 3);
        }
    }

    public void limpiarTabla() {
        int numFilas = modeloTablaDep.getRowCount();
        if (numFilas > 0) {
            for (int i = numFilas - 1; i >= 0; i--) {
                modeloTablaDep.removeRow(i);
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
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Departamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField buscardep;
    private javax.swing.JTextField clavedep;
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
    private javax.swing.JTextField nomdep;
    private javax.swing.JTextField pasdep;
    private javax.swing.JTextField radep;
    private javax.swing.JTable tablaDepartamentos;
    // End of variables declaration//GEN-END:variables
}
