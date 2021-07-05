package Ventanas;

import Clases.BasedeDatos;
import Clases.EmpleadosC;
import javax.swing.JOptionPane;

public class ActualizarEmpleados extends javax.swing.JFrame {

    BasedeDatos base = new BasedeDatos();

    public ActualizarEmpleados(EmpleadosC e) {
        initComponents();
        llenarCajas(e);
    }
    
    private void llenarCajas(EmpleadosC e) {
        int clave = e.getIdEmpleado();
        String nombre = e.getNombre();
        String apellidop = e.getApellidope();
        String apellidom = e.getApellidome();
        String puesto = e.getPuesto();
        String telefono = e.getTelefono();
        String direccion = e.getDireccion();
        int salario = e.getSalario();

        claveemp.setText(String.valueOf(clave));
        nomemp.setText(nombre);
        apemp.setText(apellidop);
        amemp.setText(apellidom);
        puestoemp.setText(puesto);
        telemp.setText(telefono);
        diremp.setText(direccion);
        salemp.setText(String.valueOf(salario));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salemp = new javax.swing.JTextField();
        apemp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amemp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telemp = new javax.swing.JTextField();
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
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(salemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 156, 29));
        getContentPane().add(apemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 156, 29));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Apellido Materno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 144, -1));
        getContentPane().add(amemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 156, 29));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 103, 25));
        getContentPane().add(telemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 156, 29));

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

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Apellido Paterno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 143, 25));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 900));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void claveempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveempActionPerformed

    private void nomempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomempActionPerformed

    private void puestoempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoempActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int clave = Integer.parseInt(claveemp.getText());
        String nombre = nomemp.getText();
        String apellidop = apemp.getText();
        String apellidom = amemp.getText();
        String puesto = puestoemp.getText();
        String telefono = telemp.getText();
        String direccion = diremp.getText();
        int salario = Integer.parseInt(salemp.getText());

        EmpleadosC emple = new EmpleadosC(clave, nombre, apellidop, apellidom, puesto, telefono, direccion, salario);
        base.actualizarEmpleado(emple, Empleados.empleadoSeleccionado.getIdEmpleado());
        JOptionPane.showMessageDialog(this, "El empleado se ha\nmodificado correctamente.");
        this.dispose();
        new Empleados().setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();
        new Empleados().setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

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
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField amemp;
    private javax.swing.JTextField apemp;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField claveemp;
    private javax.swing.JTextField diremp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomemp;
    private javax.swing.JTextField puestoemp;
    private javax.swing.JTextField salemp;
    private javax.swing.JTextField telemp;
    // End of variables declaration//GEN-END:variables
}
