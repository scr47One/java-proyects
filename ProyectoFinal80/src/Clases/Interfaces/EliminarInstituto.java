package Clases.Interfaces;

import Clases.FondoSwing;
import Clases.Instituto;
import Clases.Interfaces.VentanaPrincipal;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.NodoArbol;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class EliminarInstituto extends javax.swing.JDialog {

    public EliminarInstituto(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Instituto aux;
        Nodo raiz = VentanaPrincipal.r;
        while (raiz != null) {
            aux = (Instituto) raiz.getObj();
            String auxS = aux.getNombre();
            jComboBoxInstitucion.addItem(auxS);
            raiz = raiz.getSig();
        }

        FondoSwing fondo = new FondoSwing(ImageIO.read(new File("src/Recursos/background.png")));
        pnlInstitucion.setBorder(fondo);
        setVisible(true);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInstitucion = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jComboBoxInstitucion = new javax.swing.JComboBox();
        Carrera = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Institucion");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        pnlInstitucion.setLayout(null);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        pnlInstitucion.add(cancelar);
        cancelar.setBounds(180, 320, 90, 23);

        titulo.setBackground(new java.awt.Color(153, 153, 153));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Eliminar Instituto");
        pnlInstitucion.add(titulo);
        titulo.setBounds(240, 70, 250, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Institucion.png"))); // NOI18N
        pnlInstitucion.add(jLabel2);
        jLabel2.setBounds(130, 60, 60, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo_titulos.png"))); // NOI18N
        pnlInstitucion.add(jLabel1);
        jLabel1.setBounds(110, 50, 410, 80);

        aceptar.setText("Eliminar");
        aceptar.setEnabled(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        pnlInstitucion.add(aceptar);
        aceptar.setBounds(330, 320, 90, 23);

        jComboBoxInstitucion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona una institución..." }));
        jComboBoxInstitucion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxInstitucionItemStateChanged(evt);
            }
        });
        jComboBoxInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInstitucionActionPerformed(evt);
            }
        });
        pnlInstitucion.add(jComboBoxInstitucion);
        jComboBoxInstitucion.setBounds(250, 180, 230, 30);

        Carrera.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Carrera.setText("Institución");
        pnlInstitucion.add(Carrera);
        Carrera.setBounds(140, 180, 110, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/g.jpg"))); // NOI18N
        pnlInstitucion.add(fondo);
        fondo.setBounds(-10, -6, 610, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void habilitarB() {
        if (!jComboBoxInstitucion.getSelectedItem().toString().equals("Selecciona una institucion...")) {
            aceptar.setEnabled(true);
        } else {
            aceptar.setEnabled(false);
        }
    }
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarActionPerformed
    {//GEN-HEADEREND:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aceptarActionPerformed
    {//GEN-HEADEREND:event_aceptarActionPerformed
        int valor = JOptionPane.showConfirmDialog(this, "Toda la informacion relacionada a la institucion se perdera ¿Desea eliminarla? ", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (valor == JOptionPane.YES_OPTION) {
            String nameI = jComboBoxInstitucion.getSelectedItem().toString();
            String etq[] = new String[1];
            etq[0] = nameI;

            Nodo aux = Multilistas.busca(VentanaPrincipal.r, jComboBoxInstitucion.getSelectedItem().toString());

            VentanaPrincipal.AHash.eliminarTC(aux.getAbj(), aux.getEtq());
            
            System.out.println("---------------------Eliminacion de instituto----------------------");
            Nodo[] Eliminacion = new Nodo[2]; //Creamos un Arreglo donde se guardara la raiz y el nodo eliminado
            Eliminacion = Multilistas.eliminar(VentanaPrincipal.r, 0, etq);//Eliminamos de la multilista
            VentanaPrincipal.r = Eliminacion[0]; // A la raiz, le damos el nuevo valor

            System.out.println("\nDesplegando Multilista:" + Multilistas.desp(VentanaPrincipal.r, 0));
            System.out.println("Direccion del Nodo eliminado: " + Eliminacion[1]);
            System.out.println("Nodo eliminado: " + Eliminacion[1].getEtq());
            JOptionPane.showMessageDialog(null, "Instituto eliminado");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Procedimiento cancelado");
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void jComboBoxInstitucionItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxInstitucionItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxInstitucionItemStateChanged
        habilitarB();
    }//GEN-LAST:event_jComboBoxInstitucionItemStateChanged


    private void jComboBoxInstitucionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxInstitucionActionPerformed
    {//GEN-HEADEREND:event_jComboBoxInstitucionActionPerformed

    }//GEN-LAST:event_jComboBoxInstitucionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EliminarInstituto dialog = null;
                try {
                    dialog = new EliminarInstituto(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(EliminarInstituto.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrera;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox jComboBoxInstitucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlInstitucion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
