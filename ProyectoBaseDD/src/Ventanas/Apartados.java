package Ventanas;

import Clases.AlmacenC;
import Clases.ApartadosC;
import Clases.BasedeDatos;
import Clases.ClientesC;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Apartados extends javax.swing.JFrame {

    public DefaultTableModel modeloTablaApartados = new DefaultTableModel();
    static DefaultComboBoxModel<ClientesC> modeloClientes = new DefaultComboBoxModel<>();
    static DefaultComboBoxModel<AlmacenC> modeloProductos = new DefaultComboBoxModel<>();
    BasedeDatos base = new BasedeDatos();
    public static ApartadosC apartadoSeleccionado = null;

    public Apartados() {
        initComponents();
        if (tablaApartados.getColumnCount() == 0) {
            cargarColumnasTabla();
        } else {
        }
        llenarModeloTabla();
        llenarComboClientes();
        llenarComboProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        claveapa = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        canti = new javax.swing.JTextField();
        adel = new javax.swing.JTextField();
        vencpa = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaApartados = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        comboClientes = new javax.swing.JComboBox<>();
        comboProductos = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Apartados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 119, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Cliente: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Producto: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Clave del apartado: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Descripcion: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Cantidad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Adelanto ($):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Vencimiento de pago:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(claveapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 67, 116, 22));
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 115, -1));

        canti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantiActionPerformed(evt);
            }
        });
        getContentPane().add(canti, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 115, -1));

        adel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelActionPerformed(evt);
            }
        });
        getContentPane().add(adel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 115, -1));
        getContentPane().add(vencpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 113, 22));

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/insertar.png"))); // NOI18N
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 70, 70));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/borrar.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 70, 70));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Buscar:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 113, 22));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setText("Insertar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Borrar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/iniciio.jpg"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 40, 40));

        jLabel13.setText("Presiona para volver al inicio");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 450, 70));

        tablaApartados.setModel(modeloTablaApartados);
        tablaApartados.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged (ListSelectionEvent event){
                    if(!event.getValueIsAdjusting() && (tablaApartados.getSelectedRow() >= 0)){
                        int filaSeleccionada = tablaApartados.getSelectedRow();

                        ApartadosC a = (ApartadosC) modeloTablaApartados.getValueAt(filaSeleccionada, 0);

                        claveapa.setText(String.valueOf(a.getIdApartado()));
                        desc.setText(a.getDescripcion());
                        canti.setText(String.valueOf(a.getCantidad()));
                        adel.setText(String.valueOf(a.getAdelanto()));
                        vencpa.setText(a.getVencimientoPago());

                        apartadoSeleccionado = a;
                    }
                }
            }
        );
        jScrollPane1.setViewportView(tablaApartados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 430, 310));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        comboClientes.setModel(modeloClientes);
        getContentPane().add(comboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 240, -1));

        comboProductos.setModel(modeloProductos);
        getContentPane().add(comboProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 250, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 450, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantiActionPerformed

    private void adelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adelActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (apartadoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un apartado de la tabla");
        } else {
            new ActualizarApartados(apartadoSeleccionado).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int idApartado = Integer.parseInt(claveapa.getText());
        String descripcion = desc.getText();
        int cantidad = Integer.parseInt(canti.getText());
        int adelanto = Integer.parseInt(adel.getText());
        String fecha = vencpa.getText();
        ClientesC cli = (ClientesC) comboClientes.getSelectedItem();
        AlmacenC pro = (AlmacenC) comboProductos.getSelectedItem();
        int idCliente = cli.getIdCliente();
        int idProducto = pro.getIdProducto();

        ApartadosC apa = new ApartadosC(idApartado, idCliente, idProducto, descripcion, cantidad, adelanto, fecha);
        
        int can = base.insertarApartados(apa);
        System.out.println(can);
        
        if (can == 1) {
            JOptionPane.showMessageDialog(this, "El apartado se ha agregado correctamente.");
            llenarModeloTabla();
        } else{
            JOptionPane.showMessageDialog(this, "El limite de articulos para apartar son 5.");
            llenarModeloTabla();
        }

//        base.insertarApartados(apa);
//        llenarModeloTabla();
//        JOptionPane.showMessageDialog(this, "El apartado se ha agregado correctamente.");

    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (apartadoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un apartado de la tabla");
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar el apartado?"); // 0 = Si, 1 = No
            if (opc == 0) {
                modeloTablaApartados.removeRow(tablaApartados.getSelectedRow());
                base.borrarApartado(apartadoSeleccionado);
                llenarModeloTabla();
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        limpiarTabla();
        String cadenaBusqueda = buscar.getText();
        ArrayList<ApartadosC> listaProductos = base.buscarApartados(cadenaBusqueda);
        int numeroProductos = listaProductos.size();
        modeloTablaApartados.setNumRows(numeroProductos);
        for (int i = 0; i < numeroProductos; i++) {
            ApartadosC a = listaProductos.get(i);
//            int id1 = a.getIdApartado();
            int id2 = a.getIdCliente();
            int id3 = a.getIdProducto();
            String descripcion = a.getDescripcion();
            int cantidad = a.getCantidad();
            int adelanto = a.getAdelanto();
            String vencimientoPago = a.getVencimientoPago();

            modeloTablaApartados.setValueAt(a, i, 0);
            modeloTablaApartados.setValueAt(id2, i, 1);
            modeloTablaApartados.setValueAt(id3, i, 2);
            modeloTablaApartados.setValueAt(descripcion, i, 3);
            modeloTablaApartados.setValueAt(cantidad, i, 4);
            modeloTablaApartados.setValueAt(adelanto, i, 5);
            modeloTablaApartados.setValueAt(vencimientoPago, i, 6);
        }
    }//GEN-LAST:event_buscarKeyReleased

    private void cargarColumnasTabla() {
        modeloTablaApartados.addColumn("Id apartado");
        modeloTablaApartados.addColumn("Id cliente");
        modeloTablaApartados.addColumn("Id producto");
        modeloTablaApartados.addColumn("Descripcion");
        modeloTablaApartados.addColumn("Cantidad");
        modeloTablaApartados.addColumn("Adelanto");
        modeloTablaApartados.addColumn("Vencimiento Pago");
    }

    private void llenarModeloTabla() {
        ArrayList<ApartadosC> listaApartados = base.consultarApartados();
        int numeroClientes = listaApartados.size();
        modeloTablaApartados.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++) {
            ApartadosC a = listaApartados.get(i);
            int idCliente = a.getIdCliente();
            int idProducto = a.getIdProducto();
            String descripcion = a.getDescripcion();
            int cantidad = a.getCantidad();
            int adelanto = a.getAdelanto();
            String fecha = a.getVencimientoPago();
//            String nombre = p.getNombreProv();
            modeloTablaApartados.setValueAt(a, i, 0);
            modeloTablaApartados.setValueAt(idCliente, i, 1);
            modeloTablaApartados.setValueAt(idProducto, i, 2);
            modeloTablaApartados.setValueAt(descripcion, i, 3);
            modeloTablaApartados.setValueAt(cantidad, i, 4);
            modeloTablaApartados.setValueAt(adelanto, i, 5);
            modeloTablaApartados.setValueAt(fecha, i, 6);
        }
    }

    private void limpiarTabla() {
        int numFilas = modeloTablaApartados.getRowCount();
        if (numFilas > 0) {
            for (int i = numFilas - 1; i >= 0; i--) {
                modeloTablaApartados.removeRow(i);
            }
        }
    }

    private void llenarComboClientes() {
        comboClientes.removeAllItems();
        ArrayList<ClientesC> lista = base.consultarClientes();
        for (ClientesC producto : lista) {
            modeloClientes.addElement(producto);
        }
    }

    private void llenarComboProductos() {
        comboProductos.removeAllItems();
        ArrayList<AlmacenC> lista = base.consultarProductos();
        for (AlmacenC producto : lista) {
            modeloProductos.addElement(producto);
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
            java.util.logging.Logger.getLogger(Apartados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apartados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apartados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apartados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apartados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adel;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField canti;
    private javax.swing.JTextField claveapa;
    private javax.swing.JComboBox<ClientesC> comboClientes;
    private javax.swing.JComboBox<AlmacenC> comboProductos;
    private javax.swing.JTextField desc;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaApartados;
    private javax.swing.JTextField vencpa;
    // End of variables declaration//GEN-END:variables
}
