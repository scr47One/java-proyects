package Clases.Interfaces;

import Clases.Carrera;
import Clases.FondoSwing;
import Clases.Instituto;
import Clases.Interfaces.VentanaPrincipal;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.NodoArbol;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class TransferirCarrera extends javax.swing.JDialog {

    boolean institucion = false;

    public TransferirCarrera(java.awt.Frame parent, boolean modal) throws IOException {
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
        titulo = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        jComboBoxInstitucion = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCarrera = new javax.swing.JComboBox();
        Carrera2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxInstitucion1 = new javax.swing.JComboBox();
        Carrera3 = new javax.swing.JLabel();
        Carrera4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transferir Carrera");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        pnlInstitucion.setLayout(null);

        titulo.setBackground(new java.awt.Color(153, 153, 153));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Transferir Carrera");
        pnlInstitucion.add(titulo);
        titulo.setBounds(250, 60, 220, 30);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        pnlInstitucion.add(cancelar);
        cancelar.setBounds(190, 340, 100, 23);

        aceptar.setText("Transferir");
        aceptar.setEnabled(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        pnlInstitucion.add(aceptar);
        aceptar.setBounds(330, 340, 110, 23);

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
        jComboBoxInstitucion.setBounds(240, 140, 230, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transferir2.png"))); // NOI18N
        pnlInstitucion.add(jLabel2);
        jLabel2.setBounds(150, 40, 70, 70);

        jComboBoxCarrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCarreraItemStateChanged(evt);
            }
        });
        jComboBoxCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCarreraActionPerformed(evt);
            }
        });
        pnlInstitucion.add(jComboBoxCarrera);
        jComboBoxCarrera.setBounds(240, 190, 230, 30);

        Carrera2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Carrera2.setText("Carrera ");
        pnlInstitucion.add(Carrera2);
        Carrera2.setBounds(160, 190, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo_titulos.png"))); // NOI18N
        pnlInstitucion.add(jLabel1);
        jLabel1.setBounds(110, 40, 400, 70);

        jComboBoxInstitucion1.setEnabled(false);
        jComboBoxInstitucion1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxInstitucion1ItemStateChanged(evt);
            }
        });
        jComboBoxInstitucion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInstitucion1ActionPerformed(evt);
            }
        });
        pnlInstitucion.add(jComboBoxInstitucion1);
        jComboBoxInstitucion1.setBounds(240, 250, 230, 30);

        Carrera3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Carrera3.setText("Institución");
        pnlInstitucion.add(Carrera3);
        Carrera3.setBounds(140, 140, 110, 30);

        Carrera4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Carrera4.setText("Transferir a");
        pnlInstitucion.add(Carrera4);
        Carrera4.setBounds(130, 250, 100, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/g.jpg"))); // NOI18N
        pnlInstitucion.add(fondo);
        fondo.setBounds(-10, 0, 610, 420);

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
        if (!jComboBoxInstitucion.getSelectedItem().toString().equals("Selecciona una institucion...") && jComboBoxCarrera.getSelectedItem() != null && jComboBoxInstitucion1.getSelectedItem() != null) {
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
        int valor = JOptionPane.showConfirmDialog(this, "Se transferira la carrera con todas las reuniones existente ¿Desea continuar? ", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (valor == JOptionPane.YES_OPTION) {

            String NombreInstitucion = jComboBoxInstitucion.getSelectedItem().toString();
            String etq[] = new String[2];
            etq[0] = NombreInstitucion;
            etq[1] = jComboBoxCarrera.getSelectedItem().toString();

            System.out.println("-------------------Transferencia------------------------");

            //Eliminamos de la tabla hash, el elemento a transferir
            NodoArbol[] arr = VentanaPrincipal.AHash.Eliminar(jComboBoxCarrera.getSelectedItem().toString(), jComboBoxInstitucion.getSelectedItem().toString());

            //Creamos un arreglo, para la eliminacion en multilista
            Nodo[] Eliminacion = new Nodo[2]; //Creamos un Arreglo donde se guardara la raiz y el nodo eliminado
            Eliminacion = Multilistas.eliminar(VentanaPrincipal.r, 0, etq);//Eliminamos de la multilista
            VentanaPrincipal.r = Eliminacion[0]; // A la raiz, le damos el nuevo valor

            //Desplegamos en consola la multilista despues de eliminar
            
            System.out.println("Carrera a transferir: " + Eliminacion[1].getEtq());

            //Buscamos que el instituto a insetar existe
            Nodo auxbusca = Multilistas.busca(VentanaPrincipal.r, jComboBoxInstitucion1.getSelectedItem().toString());

            //Buscamos que la carrera no exista en la institucion
            Nodo aux = Multilistas.busca(auxbusca.getAbj(), Eliminacion[1].getEtq());

            if (aux == null) {

                //Ajustamos el arreglo de string para insertar
                etq = new String[2];
                etq[0] = jComboBoxInstitucion1.getSelectedItem().toString();;
                
                etq[1] = Eliminacion[1].getEtq();
                
                Eliminacion[1].setArriba(auxbusca);
                
                VentanaPrincipal.r = Multilistas.insertar(VentanaPrincipal.r, Eliminacion[1], 0, etq);
                System.out.println(Multilistas.desp(VentanaPrincipal.r, 0));

                Nodo B = Multilistas.busca(VentanaPrincipal.r, jComboBoxInstitucion1.getSelectedItem().toString());
                Nodo C = Multilistas.busca(B.getAbj(), jComboBoxCarrera.getSelectedItem().toString());
                System.out.println("Destino");
                System.out.println("Carrera: " + C.getEtq());
                System.out.println("Institucion de la carrera: " + C.getArriba().getEtq());

                VentanaPrincipal.AHash.Insertar(Eliminacion[1].getEtq(), Eliminacion[1]);

                JOptionPane.showMessageDialog(null, "La carrera fue transferida");

            } else {

                JOptionPane.showMessageDialog(null, "La carrera ya existe en este instituto");
                arr[0].setHilo(Eliminacion[1]);
                etq = new String[2];
                etq[0] = jComboBoxInstitucion.getSelectedItem().toString();;
                etq[1] = Eliminacion[1].getEtq();
                Nodo auxbusca1 = Multilistas.busca(VentanaPrincipal.r, jComboBoxInstitucion.getSelectedItem().toString());
                Eliminacion[1].setArriba(auxbusca1);
                VentanaPrincipal.AHash.Insertar(Eliminacion[1].getEtq(), Eliminacion[1]);

                Nodo B = Multilistas.busca(VentanaPrincipal.r, jComboBoxInstitucion1.getSelectedItem().toString());
                Nodo C = Multilistas.busca(B.getAbj(), jComboBoxCarrera.getSelectedItem().toString());
                System.out.println("Destino");
                System.out.println("Carrera: " + C.getEtq());
                System.out.println("Institucion de la carrera: " + C.getArriba().getEtq());
                VentanaPrincipal.r = Multilistas.insertar(VentanaPrincipal.r, Eliminacion[1], 0, etq);
                System.out.println(Multilistas.desp(VentanaPrincipal.r, 0));
            }

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Procedimiento cancelado");
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void jComboBoxInstitucionItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxInstitucionItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxInstitucionItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jComboBoxCarrera.removeAllItems();
            jComboBoxInstitucion1.removeAllItems();
            jComboBoxInstitucion1.setEnabled(false);

            Carrera aux;
            String Nombreaux = jComboBoxInstitucion.getSelectedItem().toString();
            Nodo auxbusca = Multilistas.busca(VentanaPrincipal.r, Nombreaux);

            if (auxbusca != null && auxbusca.getAbj() != null) {
                auxbusca = auxbusca.getAbj();

                while (auxbusca != null) {
                    aux = (Carrera) auxbusca.getObj();
                    String auxS = aux.getNombre();
                    jComboBoxCarrera.addItem(auxS);
                    auxbusca = auxbusca.getSig();
                }

                Instituto auxI;
                Nodo raiz = VentanaPrincipal.r;

                while (raiz != null) {
                    auxI = (Instituto) raiz.getObj();
                    String auxS = auxI.getNombre();

                    jComboBoxInstitucion1.addItem(auxS);
                    jComboBoxInstitucion1.removeItem(jComboBoxInstitucion.getSelectedItem());

                    raiz = raiz.getSig();
                }
                if (jComboBoxInstitucion1.getItemCount() == 0) {
                    jComboBoxInstitucion1.setEnabled(true);
                } else {
                    jComboBoxInstitucion1.setEnabled(true);
                }

            }

        }
        habilitarB();
    }//GEN-LAST:event_jComboBoxInstitucionItemStateChanged

    private void jComboBoxInstitucionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxInstitucionActionPerformed
    {//GEN-HEADEREND:event_jComboBoxInstitucionActionPerformed

    }//GEN-LAST:event_jComboBoxInstitucionActionPerformed

    private void jComboBoxCarreraItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxCarreraItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxCarreraItemStateChanged

        habilitarB();
    }//GEN-LAST:event_jComboBoxCarreraItemStateChanged

    private void jComboBoxCarreraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxCarreraActionPerformed
    {//GEN-HEADEREND:event_jComboBoxCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCarreraActionPerformed

    private void jComboBoxInstitucion1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxInstitucion1ItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxInstitucion1ItemStateChanged

    }//GEN-LAST:event_jComboBoxInstitucion1ItemStateChanged

    private void jComboBoxInstitucion1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxInstitucion1ActionPerformed
    {//GEN-HEADEREND:event_jComboBoxInstitucion1ActionPerformed
        habilitarB();
    }//GEN-LAST:event_jComboBoxInstitucion1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TransferirCarrera dialog = null;
                try {
                    dialog = new TransferirCarrera(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(TransferirCarrera.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel Carrera2;
    private javax.swing.JLabel Carrera3;
    private javax.swing.JLabel Carrera4;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox jComboBoxCarrera;
    private javax.swing.JComboBox jComboBoxInstitucion;
    private javax.swing.JComboBox jComboBoxInstitucion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlInstitucion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
