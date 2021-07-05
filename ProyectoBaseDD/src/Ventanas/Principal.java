package Ventanas;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlm = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnDepartamentos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnClientes1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEntre = new javax.swing.JButton();
        btnVen = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnTarjetaP = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnSistemaAp = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnDespedidos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/almacen.png"))); // NOI18N
        btnAlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlm, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 186, 123, 93));

        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/empleados.png"))); // NOI18N
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 47, 123, 93));

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/provv.png"))); // NOI18N
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 47, 123, 93));

        btnDepartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/departamentos.jpg"))); // NOI18N
        btnDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 47, 123, 93));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setText("Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 151, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setText("Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 151, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setText("Proveedores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 151, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setText("Departamentos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 151, -1, -1));

        btnClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/clientes.jpg"))); // NOI18N
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 47, 123, 93));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setText("Almacen");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 290, -1, -1));

        btnEntre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/proveedores.png"))); // NOI18N
        btnEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntreActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntre, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 186, 123, 93));

        btnVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/ventas.png"))); // NOI18N
        btnVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenActionPerformed(evt);
            }
        });
        getContentPane().add(btnVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 186, 123, 93));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setText("Entregas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel7.setText("Ventas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 290, -1, -1));

        btnTarjetaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/tarjetap.png"))); // NOI18N
        btnTarjetaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetaPActionPerformed(evt);
            }
        });
        getContentPane().add(btnTarjetaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 123, 93));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel9.setText("Sistema de apartado");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        btnSistemaAp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/apar.png"))); // NOI18N
        btnSistemaAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemaApActionPerformed(evt);
            }
        });
        getContentPane().add(btnSistemaAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 123, 93));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel10.setText("Tarjeta de puntos");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel12.setText("Inicio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 70, -1));

        btnDespedidos.setText("Ver empleados despedidos");
        btnDespedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDespedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 190, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/pri.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -6, 600, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmActionPerformed
        new Almacen().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlmActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        new Empleados().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        new Proveedores().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentosActionPerformed
        new Departamentos().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDepartamentosActionPerformed

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
        new Clientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntreActionPerformed
        new Entregas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEntreActionPerformed

    private void btnVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenActionPerformed
        new Ventas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVenActionPerformed

    private void btnTarjetaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetaPActionPerformed
        new TarjetaPuntos().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTarjetaPActionPerformed

    private void btnSistemaApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemaApActionPerformed
        new Apartados().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSistemaApActionPerformed

    private void btnDespedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespedidosActionPerformed
        new Despedidos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDespedidosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlm;
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnDepartamentos;
    private javax.swing.JButton btnDespedidos;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnEntre;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSistemaAp;
    private javax.swing.JButton btnTarjetaP;
    private javax.swing.JButton btnVen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
