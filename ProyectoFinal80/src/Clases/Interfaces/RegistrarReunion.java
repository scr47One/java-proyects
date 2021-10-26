package Clases.Interfaces;

import java.util.Calendar;
import Clases.Carrera;
import Clases.FondoSwing;
import Clases.Instituto;
import Clases.Interfaces.VentanaPrincipal;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.Reunion;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;
import sun.util.calendar.BaseCalendar.Date;

public class RegistrarReunion extends javax.swing.JDialog {

    boolean dia = false;
    boolean carrera = false;

    public RegistrarReunion(java.awt.Frame parent, boolean modal) throws IOException {
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
        pnlAgregarCarrera.setBorder(fondo);
        ((JTextComponent) (year1).getDateEditor()).setEditable(false);

    }

    public void habilitarB() {
        if (!jTextFieldFolio.getText().isEmpty()
                && !jTextFieldMotivo.getText().isEmpty()
                && carrera == true
                && !jComboBoxInstitucion.getSelectedItem().toString().equals("Selecciona una institucion...")) {
            aceptar.setEnabled(true);
        } else {
            aceptar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAgregarCarrera = new javax.swing.JPanel();
        jTextFieldFolio = new javax.swing.JTextField();
        jTextFieldMotivo = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        Carrera = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        jComboBoxInstitucion = new javax.swing.JComboBox();
        lblFolio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Carrera2 = new javax.swing.JLabel();
        year1 = new com.toedter.calendar.JDateChooser();
        jComboBoxCarrera = new javax.swing.JComboBox();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Reunión");
        setMinimumSize(new java.awt.Dimension(600, 440));
        setResizable(false);

        pnlAgregarCarrera.setLayout(null);

        jTextFieldFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFolioActionPerformed(evt);
            }
        });
        jTextFieldFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFolioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFolioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFolioKeyTyped(evt);
            }
        });
        pnlAgregarCarrera.add(jTextFieldFolio);
        jTextFieldFolio.setBounds(230, 210, 240, 30);

        jTextFieldMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMotivoActionPerformed(evt);
            }
        });
        jTextFieldMotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMotivoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMotivoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMotivoKeyTyped(evt);
            }
        });
        pnlAgregarCarrera.add(jTextFieldMotivo);
        jTextFieldMotivo.setBounds(230, 260, 240, 30);

        titulo.setBackground(new java.awt.Color(153, 153, 153));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Registro De Reunión ");
        pnlAgregarCarrera.add(titulo);
        titulo.setBounds(230, 60, 260, 30);

        lblMotivo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        lblMotivo.setText("Motivo");
        pnlAgregarCarrera.add(lblMotivo);
        lblMotivo.setBounds(150, 260, 70, 30);

        Carrera.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Carrera.setText("Institución");
        pnlAgregarCarrera.add(Carrera);
        Carrera.setBounds(120, 130, 110, 30);

        lblFecha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        lblFecha.setText("Año");
        pnlAgregarCarrera.add(lblFecha);
        lblFecha.setBounds(174, 310, 40, 20);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        pnlAgregarCarrera.add(cancelar);
        cancelar.setBounds(190, 350, 90, 23);

        aceptar.setText("Aceptar");
        aceptar.setEnabled(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        pnlAgregarCarrera.add(aceptar);
        aceptar.setBounds(320, 350, 90, 23);

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
        jComboBoxInstitucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxInstitucionKeyPressed(evt);
            }
        });
        pnlAgregarCarrera.add(jComboBoxInstitucion);
        jComboBoxInstitucion.setBounds(230, 130, 240, 30);

        lblFolio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        lblFolio.setText("Folio");
        pnlAgregarCarrera.add(lblFolio);
        lblFolio.setBounds(170, 210, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Reunion.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        pnlAgregarCarrera.add(jLabel2);
        jLabel2.setBounds(130, 40, 60, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo_titulos.png"))); // NOI18N
        pnlAgregarCarrera.add(jLabel1);
        jLabel1.setBounds(100, 40, 430, 70);

        Carrera2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Carrera2.setText("Carrera");
        pnlAgregarCarrera.add(Carrera2);
        Carrera2.setBounds(150, 170, 110, 30);

        year1.setDateFormatString("dd/MM/yyyy");
        year1.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                year1HierarchyChanged(evt);
            }
        });
        year1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                year1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        year1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                year1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                year1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                year1KeyTyped(evt);
            }
        });
        pnlAgregarCarrera.add(year1);
        year1.setBounds(230, 310, 240, 20);

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
        pnlAgregarCarrera.add(jComboBoxCarrera);
        jComboBoxCarrera.setBounds(230, 170, 240, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/g.jpg"))); // NOI18N
        pnlAgregarCarrera.add(fondo);
        fondo.setBounds(-10, -6, 610, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFolioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldFolioActionPerformed
    {//GEN-HEADEREND:event_jTextFieldFolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFolioActionPerformed

    private void jTextFieldFolioKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldFolioKeyReleased
    {//GEN-HEADEREND:event_jTextFieldFolioKeyReleased
        habilitarB();
    }//GEN-LAST:event_jTextFieldFolioKeyReleased

    private void jTextFieldFolioKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldFolioKeyTyped
    {//GEN-HEADEREND:event_jTextFieldFolioKeyTyped

        if (jTextFieldFolio.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        }
    }//GEN-LAST:event_jTextFieldFolioKeyTyped


    private void jTextFieldMotivoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldMotivoActionPerformed
    {//GEN-HEADEREND:event_jTextFieldMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMotivoActionPerformed

    private void jTextFieldMotivoKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldMotivoKeyReleased
    {//GEN-HEADEREND:event_jTextFieldMotivoKeyReleased
        habilitarB();
    }//GEN-LAST:event_jTextFieldMotivoKeyReleased

    private void jTextFieldMotivoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldMotivoKeyTyped
    {//GEN-HEADEREND:event_jTextFieldMotivoKeyTyped
        if (jTextFieldMotivo.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        year1.setEnabled(true);
    }//GEN-LAST:event_jTextFieldMotivoKeyTyped

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarActionPerformed
    {//GEN-HEADEREND:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aceptarActionPerformed
    {//GEN-HEADEREND:event_aceptarActionPerformed

        if (year1.getCalendar() != null) {

            String dia = Integer.toString(year1.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(year1.getCalendar().get(Calendar.MONTH) + 1);
            String year = Integer.toString(year1.getCalendar().get(Calendar.YEAR));
            String fecha = (dia + "/" + mes + "/" + year);
            // year.setText(fecha);
            String motivoR = jTextFieldMotivo.getText().toUpperCase().trim();
            long folR = Long.parseLong(jTextFieldFolio.getText().trim());

            Reunion aux = new Reunion(folR, motivoR, fecha);
            Nodo aux2 = new Nodo(aux, jTextFieldFolio.getText());

            String etq[] = new String[3];
            etq = new String[3];
            etq[0] = jComboBoxInstitucion.getSelectedItem().toString();
            etq[1] = jComboBoxCarrera.getSelectedItem().toString();
            etq[2] = jTextFieldFolio.getText();

            Nodo aux3 = Multilistas.busca(VentanaPrincipal.r, jComboBoxInstitucion.getSelectedItem().toString());
            if (aux3 != null) {
                Nodo aux4 = Multilistas.busca(aux3.getAbj(), jComboBoxCarrera.getSelectedItem().toString());
                if (aux4 != null) {
                    Nodo aux5 = Multilistas.busca(aux4.getAbj(), jTextFieldFolio.getText().trim());
                    if (aux5 == null) {
                        VentanaPrincipal.r = Multilistas.insertar(VentanaPrincipal.r, aux2, 0, etq);
                        
                        System.out.println("Reunion Agregada\n");
                        System.out.println(Multilistas.desp(VentanaPrincipal.r, 0));
                        
                        JOptionPane.showMessageDialog(null, "La reunion fue agregada");
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "La reunion ya existe");
                        this.dispose();
                    }

                }
            }
        } else {

            JOptionPane.showMessageDialog(null, "Seleciona una fecha");

        }


    }//GEN-LAST:event_aceptarActionPerformed

    private void jComboBoxInstitucionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxInstitucionActionPerformed
    {//GEN-HEADEREND:event_jComboBoxInstitucionActionPerformed
    }//GEN-LAST:event_jComboBoxInstitucionActionPerformed

    private void jComboBoxCarreraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxCarreraActionPerformed
    {//GEN-HEADEREND:event_jComboBoxCarreraActionPerformed
                
        
    }//GEN-LAST:event_jComboBoxCarreraActionPerformed

    private void jComboBoxInstitucionItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxInstitucionItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxInstitucionItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            jComboBoxCarrera.removeAllItems();
            carrera = false;
            
            Carrera aux;
            String Nombreaux = jComboBoxInstitucion.getSelectedItem().toString();
            Nodo auxbusca = Multilistas.busca(VentanaPrincipal.r, Nombreaux);
            if (auxbusca != null&&auxbusca.getAbj()!=null) {
                auxbusca = auxbusca.getAbj();

                while (auxbusca != null) {
                    aux = (Carrera) auxbusca.getObj();
                    String auxS = aux.getNombre();
                    jComboBoxCarrera.addItem(auxS);
                    auxbusca = auxbusca.getSig();
                }
                carrera = true;
                
            }
            habilitarB();
        }
    }//GEN-LAST:event_jComboBoxInstitucionItemStateChanged

    private void jComboBoxCarreraItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxCarreraItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxCarreraItemStateChanged
        
        habilitarB();
    }//GEN-LAST:event_jComboBoxCarreraItemStateChanged

    private void jComboBoxInstitucionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxInstitucionKeyPressed
    }//GEN-LAST:event_jComboBoxInstitucionKeyPressed

    private void jTextFieldFolioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFolioKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (!jTextFieldFolio.getText().trim().equals("")||jTextFieldFolio.getText().trim().equals("")) {
                jTextFieldMotivo.setEnabled(true);
                jTextFieldMotivo.requestFocus();

            } 
        }
    }//GEN-LAST:event_jTextFieldFolioKeyPressed

    private void jTextFieldMotivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMotivoKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (!jTextFieldMotivo.getText().trim().equals("")||jTextFieldMotivo.getText().trim().equals("")) {
                year1.setEnabled(true);
                year1.requestFocus();

            }
        }
    }//GEN-LAST:event_jTextFieldMotivoKeyPressed

    private void year1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_year1KeyTyped


    }//GEN-LAST:event_year1KeyTyped

    private void year1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_year1KeyReleased

    }//GEN-LAST:event_year1KeyReleased

    private void year1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_year1KeyPressed

    }//GEN-LAST:event_year1KeyPressed

    private void year1HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_year1HierarchyChanged

    }//GEN-LAST:event_year1HierarchyChanged

    private void year1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_year1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_year1AncestorAdded

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarReunion dialog = null;
                try {
                    dialog = new RegistrarReunion(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(RegistrarReunion.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel Carrera2;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox jComboBoxCarrera;
    private javax.swing.JComboBox jComboBoxInstitucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldFolio;
    private javax.swing.JTextField jTextFieldMotivo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JPanel pnlAgregarCarrera;
    private javax.swing.JLabel titulo;
    private com.toedter.calendar.JDateChooser year1;
    // End of variables declaration//GEN-END:variables
}
