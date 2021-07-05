package Ventanas;

import Clases.BasedeDatos;
import Clases.EmpleadosC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Empleados extends javax.swing.JFrame {

    public static DefaultTableModel modeloTablaEmp = new DefaultTableModel();
    BasedeDatos base = new BasedeDatos();
    public static EmpleadosC empleadoSeleccionado = null;

    public Empleados() {
        initComponents();
        if (tablaEmpleados.getColumnCount() == 0) {
            cargarColumnasTabla();
        } else {}
        llenarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salemp = new javax.swing.JTextField();
        apemp = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        amemp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        telemp = new javax.swing.JTextField();
        buscaremp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diremp = new javax.swing.JTextField();
        claveemp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        puestoemp = new javax.swing.JTextField();
        nomemp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        btnInicio = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(salemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 156, 29));
        getContentPane().add(apemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 156, 29));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/insertar.png"))); // NOI18N
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 70, 70));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Apellido Materno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 144, -1));

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/borrar.png"))); // NOI18N
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 70, 70));
        getContentPane().add(amemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 156, 29));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 103, 25));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Buscar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 70, 25));
        getContentPane().add(telemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 156, 29));

        buscaremp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarempKeyReleased(evt);
            }
        });
        getContentPane().add(buscaremp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 156, 29));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Dirección");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 103, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Clave del empleado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 166, 25));
        getContentPane().add(diremp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 156, 29));

        claveemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveempActionPerformed(evt);
            }
        });
        getContentPane().add(claveemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 156, 29));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Puesto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 103, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 103, 25));

        puestoemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoempActionPerformed(evt);
            }
        });
        getContentPane().add(puestoemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 156, 29));

        nomemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomempActionPerformed(evt);
            }
        });
        getContentPane().add(nomemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 156, 29));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Salario");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 103, 25));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Apellido Paterno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 143, 25));

        tablaEmpleados.setModel(modeloTablaEmp);
        tablaEmpleados.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged (ListSelectionEvent event){
                    if(!event.getValueIsAdjusting() && (tablaEmpleados.getSelectedRow() >= 0)){
                        int filaSeleccionada = tablaEmpleados.getSelectedRow();

                        EmpleadosC e = (EmpleadosC) modeloTablaEmp.getValueAt(filaSeleccionada, 1);

                        claveemp.setText(String.valueOf(e.getIdEmpleado()));
                        nomemp.setText(e.getNombre());
                        apemp.setText(e.getApellidope());
                        amemp.setText(e.getApellidome());
                        puestoemp.setText(e.getPuesto());
                        telemp.setText(e.getTelefono());
                        diremp.setText(e.getDireccion());
                        salemp.setText(String.valueOf(e.getSalario()));

                        empleadoSeleccionado = e;
                    }
                }
            }
        );
        jScrollPane2.setViewportView(tablaEmpleados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 600, 350));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/iniciio.jpg"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 40, 40));

        jLabel13.setText("Presiona para volver al inicio");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Insertar");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setText("Borrar");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int clave = Integer.parseInt(claveemp.getText());
        String nombre = nomemp.getText();
        String apellidop = apemp.getText();
        String apellidom = amemp.getText();
        String puesto = puestoemp.getText();
        String telefono = telemp.getText();
        String direccion = diremp.getText();
        int salario = Integer.parseInt(salemp.getText());

        EmpleadosC emple = new EmpleadosC(clave, nombre, apellidop, apellidom, puesto, telefono, direccion, salario);
        base.insertarEmpleados(emple);
        llenarModeloTabla();
        JOptionPane.showMessageDialog(this, "El empleado se ha\nagregado correctamente.");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void claveempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveempActionPerformed

    private void nomempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomempActionPerformed

    private void puestoempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoempActionPerformed

    private void buscarempKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarempKeyReleased
        limpiarTabla();
        String cadenaBusqueda = buscaremp.getText();
        ArrayList<EmpleadosC> listaEmpleados = base.buscarEmpleados(cadenaBusqueda);
        int numeroClientes = listaEmpleados.size();
        modeloTablaEmp.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++) {
            EmpleadosC e = listaEmpleados.get(i);
            int id = e.getIdEmpleado();
//            String nombre = e.getNombre();
            String apeP = e.getApellidope();
            String apeM = e.getApellidome();
            String puesto = e.getPuesto();
            String telefono = e.getTelefono();
            String direccion = e.getDireccion();
            int salario = e.getSalario();

            modeloTablaEmp.setValueAt(id, i, 0);
            modeloTablaEmp.setValueAt(e, i, 1);
            modeloTablaEmp.setValueAt(apeP, i, 2);
            modeloTablaEmp.setValueAt(apeM, i, 3);
            modeloTablaEmp.setValueAt(puesto, i, 4);
            modeloTablaEmp.setValueAt(telefono, i, 5);
            modeloTablaEmp.setValueAt(direccion, i, 6);
            modeloTablaEmp.setValueAt(salario, i, 7);
        }
    }//GEN-LAST:event_buscarempKeyReleased

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (empleadoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un empleado de la tabla");
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar el empleado?"); // 0 = Si, 1 = No
            if (opc == 0) {
                modeloTablaEmp.removeRow(tablaEmpleados.getSelectedRow());
                base.borrarEmpleado(empleadoSeleccionado);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (empleadoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un empleado de la tabla");
        } else {
            new ActualizarEmpleados(empleadoSeleccionado).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cargarColumnasTabla() {
        modeloTablaEmp.addColumn("Id empleado");
        modeloTablaEmp.addColumn("Nombre");
        modeloTablaEmp.addColumn("Apellido Paterno");
        modeloTablaEmp.addColumn("Apellido Materno");
        modeloTablaEmp.addColumn("Puesto");
        modeloTablaEmp.addColumn("Telefono");
        modeloTablaEmp.addColumn("Direccion");
        modeloTablaEmp.addColumn("Salario");
    }

    private void llenarModeloTabla() {
        ArrayList<EmpleadosC> listaProducto = base.consultarEmpleados();
        int numeroClientes = listaProducto.size();
        modeloTablaEmp.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++) {
            
            EmpleadosC e = listaProducto.get(i);
            int id = e.getIdEmpleado();
//            String nombre = e.getNombre();
            String apeP = e.getApellidope();
            String apeM = e.getApellidome();
            String puesto = e.getPuesto();
            String telefono = e.getTelefono();
            String direccion = e.getDireccion();
            int salario = e.getSalario();
            
            modeloTablaEmp.setValueAt(id, i, 0);
            modeloTablaEmp.setValueAt(e, i, 1);
            modeloTablaEmp.setValueAt(apeP, i, 2);
            modeloTablaEmp.setValueAt(apeM, i, 3);
            modeloTablaEmp.setValueAt(puesto, i, 4);
            modeloTablaEmp.setValueAt(telefono, i, 5);
            modeloTablaEmp.setValueAt(direccion, i, 6);
            modeloTablaEmp.setValueAt(salario, i, 7);
        }
    }

    public void limpiarTabla() {
        int numFilas = modeloTablaEmp.getRowCount();
        if (numFilas > 0) {
            for (int i = numFilas - 1; i >= 0; i--) {
                modeloTablaEmp.removeRow(i);
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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amemp;
    private javax.swing.JTextField apemp;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField buscaremp;
    private javax.swing.JTextField claveemp;
    private javax.swing.JTextField diremp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomemp;
    private javax.swing.JTextField puestoemp;
    private javax.swing.JTextField salemp;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField telemp;
    // End of variables declaration//GEN-END:variables
}
