package Ventanas;

import Clases.AlmacenC;
import Clases.BasedeDatos;
import Clases.ClientesC;
import Clases.DetalleVentaC;
import Clases.EmpleadosC;
import Clases.VentasC;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import Clases.TarjetaPuntosC;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Ventas extends javax.swing.JFrame {

    DefaultTableModel modeloTablaProductos = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DefaultListModel<AlmacenC> modeloListaProductos = new DefaultListModel();
    DefaultComboBoxModel<ClientesC> modeloClientes = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<EmpleadosC> modeloEmpleados = new DefaultComboBoxModel<>();
    BasedeDatos base = new BasedeDatos();
    public double subtotal = 0.0;
    public double total = 0.0;
    public int pago = 0;

    public Ventas() {
        initComponents();
        if (tablaProductos.getColumnCount() == 0) {
            cargarColumnasTabla();
        } else {
        }
        llenarComboClientes();
        llenarComboEmpleados();
        cargarListenerModeloTabla();
    }

    private void cargarListenerModeloTabla() {
        modeloTablaProductos.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tme) {
                int numFilas = modeloTablaProductos.getRowCount();
                subtotal = 0.0;
                for (int i = 0; i < numFilas; i++) {
                    String importe = (String) modeloTablaProductos.getValueAt(i, 6);
                    subtotal += Double.parseDouble(importe);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        claveven = new javax.swing.JTextField();
        btnInicio = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        comboEmpleados = new javax.swing.JComboBox<>();
        comboClientes = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JList<>();
        btnQuitar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Clave de la venta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Empleado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, -1, -1));

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/insertar.png"))); // NOI18N
        btnInsertar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 70, 70));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/borrar.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 70, 70));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("REALIZAR VENTA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Borrar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));
        getContentPane().add(claveven, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 66, 20));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/iniciio.jpg"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 40));

        jLabel13.setText("Presiona para volver al inicio");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Buscar:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        buscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                buscarKeyReleased(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 97, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/linea1.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 60));

        tablaProductos.setModel(modeloTablaProductos);
        tablaProductos.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                tablaProductosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 450, 190));

        comboEmpleados.setModel(modeloEmpleados);
        getContentPane().add(comboEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 240, -1));

        comboClientes.setModel(modeloClientes);
        getContentPane().add(comboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 240, -1));

        listaProductos.setModel(modeloListaProductos);
        listaProductos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                listaProductosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(listaProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 290, -1));

        btnQuitar.setText("Quitar producto");
        btnQuitar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnQuitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        btnCancelar.setText("Cancelar Venta");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        btnTicket.setText("Ticket");
        btnTicket.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTicketActionPerformed(evt);
            }
        });
        getContentPane().add(btnTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasedd/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        System.out.println(subtotal);

        int idVenta = Integer.parseInt(claveven.getText());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
        String fechaActual = formatter.format(fecha);
        
        System.out.println("");
        ClientesC cli = (ClientesC) comboClientes.getSelectedItem();
        EmpleadosC emp = (EmpleadosC) comboEmpleados.getSelectedItem();
        int idCliente = cli.getIdCliente();
        int idEmpleado = emp.getIdEmpleado();

        VentasC venta = new VentasC(idVenta, idCliente, idEmpleado, subtotal, fechaActual);

        total = subtotal * 1.16;

        int numFilas = modeloTablaProductos.getRowCount();
        JOptionPane.showMessageDialog(this, "El total es: " + total);
        String pagoS = JOptionPane.showInputDialog(this, "Pago: ");
        pago = Integer.parseInt(pagoS);

        while (pago < total) {

            JOptionPane.showMessageDialog(this, "No le alcanza.");
            JOptionPane.showMessageDialog(this, "El total es: " + total);
            pagoS = JOptionPane.showInputDialog(this, "Pago: ");
            pago = Integer.parseInt(pagoS);

        }

        JOptionPane.showMessageDialog(this, "Su cambio es: " + (pago - total));
        base.insertarVentas(venta);
        JOptionPane.showMessageDialog(this, "La venta se ha hecho correctamente.\nGracias por su compra.");
        //###########################################################################################################
        base.consultaventa(idVenta);
        String idv = String.valueOf(idCliente);
        ArrayList<TarjetaPuntosC> listaT = base.buscarTarjetaCliente(idv);
        
        int id = listaT.size();
        
        for (int i = 0; i < id; i++)
        {
            TarjetaPuntosC v = listaT.get(i);
//            Date fechav=v.getVencimientoPuntos();
//            String vencimiento = formatter.format(fechav);
            int idtarjeta = v.getIdTarjeta();
//            System.out.println(vencimiento+idtarjeta);
            base.sumapuntos(idCliente, idtarjeta,idVenta);
        }
        //###############################################################################################################
        for (int i = 0; i < numFilas; i++) {
            String idProductoS = (String) modeloTablaProductos.getValueAt(i, 0);
            int idProducto = Integer.parseInt(idProductoS);
            String cantidadS = (String) modeloTablaProductos.getValueAt(i, 5);
            int cantidad = Integer.parseInt(cantidadS);

            DetalleVentaC detalle = new DetalleVentaC(idProducto, idVenta, cantidad, total);
            base.insertarDetalleVenta(detalle);
            System.out.println("Se inserto el detalle de venta.");
//            JOptionPane.showMessageDialog(this, "El detalle de venta se ha hecho correctamente.");
        }

        for (int i = 0; i < numFilas; i++) {
            String idProductoS = (String) modeloTablaProductos.getValueAt(i, 0);
            int idProducto = Integer.parseInt(idProductoS);

            String cantidadS = (String) modeloTablaProductos.getValueAt(i, 5);
            int cantidad = Integer.parseInt(cantidadS);

            int exi = base.regresarCantidad(idProducto);

            int actual = exi - cantidad;

            base.actualizarExistencias(actual, idProducto);
        }

        for (int i = numFilas - 1; i >= 0; i--) {
            modeloTablaProductos.removeRow(i);
        }
         
   
        
        limpiarLista();
        buscar.setText("");
        
//        new MostrarTicket(pago, (pago-total)).setVisible(true);

    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        new BorrarVenta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        limpiarLista();
        String cadenaBusqueda = buscar.getText();
        if (cadenaBusqueda.isEmpty()) {
            limpiarLista();
        } else {
            ArrayList<AlmacenC> listaProductos1 = base.buscarProductos(cadenaBusqueda);
            for (AlmacenC p : listaProductos1) {
                modeloListaProductos.addElement(p);
            }
        }
    }//GEN-LAST:event_buscarKeyReleased

    private void listaProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProductosMousePressed
        JList list = (JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            AlmacenC p = (AlmacenC) list.getSelectedValue();
            anadirATabla(p);
        }
    }//GEN-LAST:event_listaProductosMousePressed

    private void tablaProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProductosKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_SHIFT) {
            int filaSeleccionada = tablaProductos.getSelectedRow();
            String cantidad = JOptionPane.showInputDialog(this, "Modifique la cantidad de compra: ");
            int can = Integer.parseInt(cantidad);

            String idProductoS = (String) modeloTablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0);
            int idProd = Integer.parseInt(idProductoS);

            int exi = base.regresarCantidad(idProd);

            if (can > exi) {
                JOptionPane.showMessageDialog(this, "No alcanzan las piezas para venderle.");
            } else {
                String precioVenta = (String) modeloTablaProductos.getValueAt(filaSeleccionada, 4);
                double importe = Double.parseDouble(cantidad) * Double.parseDouble(precioVenta);
                String importeS = String.valueOf(importe);
                modeloTablaProductos.setValueAt(cantidad, filaSeleccionada, 5);
                modeloTablaProductos.setValueAt(importeS, filaSeleccionada, 6);
            }

        }
    }//GEN-LAST:event_tablaProductosKeyReleased

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        int numFilas = modeloTablaProductos.getRowCount();
        if (numFilas > 0) {
            int filaSeleccionada = tablaProductos.getSelectedRow();
            modeloTablaProductos.removeRow(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(this, "No hay producto para quitar.");
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int numFilas = modeloTablaProductos.getRowCount();
        for (int i = numFilas - 1; i >= 0; i--) {
            modeloTablaProductos.removeRow(i);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        new MostrarTicket().setVisible(true);
    }//GEN-LAST:event_btnTicketActionPerformed

    private void anadirATabla(AlmacenC p) {
        String idProducto = String.valueOf(p.getIdProducto());
        String nombre = p.getNombre();
        String descripcion = p.getDescripcion();
        String existencia = String.valueOf(p.getExistencia());
        String precio = String.valueOf(p.getPrecio());

        String datos[] = {idProducto, nombre, descripcion, existencia, precio, "1", precio};
        modeloTablaProductos.addRow(datos);
    }

    private void cargarColumnasTabla() {

        modeloTablaProductos.addColumn("Id producto"); //0
        modeloTablaProductos.addColumn("Nombre Producto"); //1
        modeloTablaProductos.addColumn("Descripcion"); //2
        modeloTablaProductos.addColumn("Existencia"); //3
        modeloTablaProductos.addColumn("Precio"); //4
        modeloTablaProductos.addColumn("Cantidad de Compra"); //5
        modeloTablaProductos.addColumn("Importe"); //6
    }

    private void llenarComboClientes() {
        comboClientes.removeAllItems();
        ArrayList<ClientesC> lista = base.consultarClientes();
        for (ClientesC producto : lista) {
            modeloClientes.addElement(producto);
        }
    }

    private void llenarComboEmpleados() {
        comboEmpleados.removeAllItems();
        ArrayList<EmpleadosC> lista = base.consultarEmpleados();
        for (EmpleadosC producto : lista) {
            modeloEmpleados.addElement(producto);
        }
    }

    private void limpiarLista() {
        modeloListaProductos.clear();
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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnTicket;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField claveven;
    private javax.swing.JComboBox<ClientesC> comboClientes;
    private javax.swing.JComboBox<EmpleadosC> comboEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<AlmacenC> listaProductos;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
