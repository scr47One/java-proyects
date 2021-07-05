package Ventanas;

import Clases.BasedeDatos;
import Clases.Consultav;
import Clases.VentasC;
import java.awt.Point;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BorrarVenta extends javax.swing.JFrame
{

    public DefaultTableModel modeloTablaVentas = new DefaultTableModel();
    BasedeDatos base = new BasedeDatos();
    public VentasC ventaSeleccionada = null;
    public Consultav info = null;

    public BorrarVenta()
    {
        initComponents();
        if (tablaVentas.getColumnCount() == 0)
        {
            cargarColumnasTabla();
        } else
        {
        }
        llenarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        infotext = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaVentas.setModel(modeloTablaVentas);
        tablaVentas.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged (ListSelectionEvent event){
                    if(!event.getValueIsAdjusting() && (tablaVentas.getSelectedRow() >= 0)){
                        int filaSeleccionada = tablaVentas.getSelectedRow();

                        VentasC v = (VentasC ) modeloTablaVentas.getValueAt(filaSeleccionada, 0);

                        ventaSeleccionada = v;
                    }
                }
            }
        );
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tablaVentasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                tablaVentasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVentas);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegresarActionPerformed(evt);
            }
        });

        infotext.setColumns(20);
        infotext.setRows(5);
        jScrollPane2.setViewportView(infotext);

        jLabel1.setText("Información venta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnBorrar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (ventaSeleccionada == null)
        {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione una venta de la tabla");
        } else
        {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar la venta?"); // 0 = Si, 1 = No
            if (opc == 0)
            {
                modeloTablaVentas.removeRow(tablaVentas.getSelectedRow());
                base.borrarVenta(ventaSeleccionada);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new Ventas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void tablaVentasMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tablaVentasMousePressed
    {//GEN-HEADEREND:event_tablaVentasMousePressed


    }//GEN-LAST:event_tablaVentasMousePressed

    private void tablaVentasMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tablaVentasMouseClicked
    {//GEN-HEADEREND:event_tablaVentasMouseClicked

        infotext.setText("");
        infotext.setEnabled(false);
        int col = tablaVentas.getSelectedRow();
        ArrayList<Consultav> listaInfo = base.consultaInfo(tablaVentas.getModel().getValueAt(col, 0).toString());
        int id = listaInfo.size();
        for (int i = 0; i < id; i++)
        {
            Consultav v = listaInfo.get(i);
            String Stinfo = v.getNumerocon();
            String Stinfo2 = v.getInfo();
            infotext.setText(Stinfo + " "
                    + Stinfo2);
        }
    }//GEN-LAST:event_tablaVentasMouseClicked

    private void llenarModeloTabla()
    {
        ArrayList<VentasC> listaVentas = base.consultarVentas();
        int numeroClientes = listaVentas.size();
        modeloTablaVentas.setNumRows(numeroClientes);
        for (int i = 0; i < numeroClientes; i++)
        {
            VentasC v = listaVentas.get(i);
            int idCliente = v.getIdCliente();
            int idEmpleado = v.getIdEmpleado();
            double subtotal = v.getSubtotal();
            String fecha = v.getFecha();
            
            
            modeloTablaVentas.setValueAt(v, i, 0);
            modeloTablaVentas.setValueAt(idCliente, i, 1);
            modeloTablaVentas.setValueAt(idEmpleado, i, 2);
            modeloTablaVentas.setValueAt(subtotal, i, 3);
            modeloTablaVentas.setValueAt("0.16", i, 4);
            modeloTablaVentas.setValueAt(fecha, i, 5);
        }
    }

    private void cargarColumnasTabla()
    {
        modeloTablaVentas.addColumn("Id venta");
        modeloTablaVentas.addColumn("Id cliente");
        modeloTablaVentas.addColumn("Id empleado");
        modeloTablaVentas.addColumn("Subtotal");
        modeloTablaVentas.addColumn("Iva");
        modeloTablaVentas.addColumn("Fecha");
    }

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(BorrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(BorrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(BorrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(BorrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new BorrarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextArea infotext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
