package Clases.Interfaces;

import Clases.Carrera;
import Clases.FondoSwing;
import Clases.Instituto;
import Clases.Interfaces.VentanaPrincipal;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.NodoArbol;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class RegistrarCarrera extends javax.swing.JDialog {

    public RegistrarCarrera(java.awt.Frame parent, boolean modal) throws IOException {
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
            if (raiz != null) {

            }
        }

        FondoSwing fondo = new FondoSwing(ImageIO.read(new File("src/Recursos/background.png")));
        pnlAgregarCarrera.setBorder(fondo);
    }

    public void habilitarB() {
        if (!carrera.getText().isEmpty() && !jefe.getText().isEmpty() && !clave.getText().isEmpty() && !jComboBoxInstitucion.getSelectedItem().toString().equals("Selecciona una institucion...")) {
            aceptar.setEnabled(true);
        } else {
            aceptar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAgregarCarrera = new javax.swing.JPanel();
        carrera = new javax.swing.JTextField();
        clave = new javax.swing.JTextField();
        jefe = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        Clave = new javax.swing.JLabel();
        Carrera = new javax.swing.JLabel();
        Jefe = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        jComboBoxInstitucion = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Carrera1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Carrera");
        setMinimumSize(new java.awt.Dimension(600, 440));
        setResizable(false);

        pnlAgregarCarrera.setLayout(null);

        carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraActionPerformed(evt);
            }
        });
        carrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                carreraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carreraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carreraKeyTyped(evt);
            }
        });
        pnlAgregarCarrera.add(carrera);
        carrera.setBounds(240, 180, 230, 30);

        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });
        clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                claveKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                claveKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                claveKeyTyped(evt);
            }
        });
        pnlAgregarCarrera.add(clave);
        clave.setBounds(240, 260, 230, 30);

        jefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jefeActionPerformed(evt);
            }
        });
        jefe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jefeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jefeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jefeKeyTyped(evt);
            }
        });
        pnlAgregarCarrera.add(jefe);
        jefe.setBounds(240, 220, 230, 30);

        titulo.setBackground(new java.awt.Color(153, 153, 153));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Registro De Carrera ");
        pnlAgregarCarrera.add(titulo);
        titulo.setBounds(200, 60, 300, 40);

        Clave.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Clave.setText("Clave");
        pnlAgregarCarrera.add(Clave);
        Clave.setBounds(160, 260, 50, 30);

        Carrera.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Carrera.setText("Institución");
        pnlAgregarCarrera.add(Carrera);
        Carrera.setBounds(120, 140, 110, 30);

        Jefe.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Jefe.setText("Jefe");
        pnlAgregarCarrera.add(Jefe);
        Jefe.setBounds(170, 220, 40, 30);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        pnlAgregarCarrera.add(cancelar);
        cancelar.setBounds(210, 340, 90, 23);

        aceptar.setText("Aceptar");
        aceptar.setEnabled(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        pnlAgregarCarrera.add(aceptar);
        aceptar.setBounds(340, 340, 90, 23);

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
        pnlAgregarCarrera.add(jComboBoxInstitucion);
        jComboBoxInstitucion.setBounds(240, 140, 230, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carrera.png"))); // NOI18N
        pnlAgregarCarrera.add(jLabel2);
        jLabel2.setBounds(120, 50, 60, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo_titulos.png"))); // NOI18N
        pnlAgregarCarrera.add(jLabel1);
        jLabel1.setBounds(100, 40, 400, 80);

        Carrera1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Carrera1.setText(" Carrera");
        pnlAgregarCarrera.add(Carrera1);
        Carrera1.setBounds(140, 180, 80, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/g.jpg"))); // NOI18N
        pnlAgregarCarrera.add(fondo);
        fondo.setBounds(0, 0, 600, 440);

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

    private void carreraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_carreraActionPerformed
    {//GEN-HEADEREND:event_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carreraActionPerformed

    private void carreraKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_carreraKeyReleased
    {//GEN-HEADEREND:event_carreraKeyReleased
        habilitarB();
    }//GEN-LAST:event_carreraKeyReleased

    private void carreraKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_carreraKeyTyped
    {//GEN-HEADEREND:event_carreraKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo letras");
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo letras");
        }
    }//GEN-LAST:event_carreraKeyTyped

    private void claveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_claveActionPerformed
    {//GEN-HEADEREND:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed

    private void claveKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_claveKeyReleased
    {//GEN-HEADEREND:event_claveKeyReleased
        habilitarB();
    }//GEN-LAST:event_claveKeyReleased

    private void claveKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_claveKeyTyped
    {//GEN-HEADEREND:event_claveKeyTyped

        if (clave.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar) || validar == '-') {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        } else if ((int) evt.getKeyChar() >= 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        }
    }//GEN-LAST:event_claveKeyTyped

    private void jefeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jefeActionPerformed
    {//GEN-HEADEREND:event_jefeActionPerformed

    }//GEN-LAST:event_jefeActionPerformed

    private void jefeKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jefeKeyReleased
    {//GEN-HEADEREND:event_jefeKeyReleased
        habilitarB();
    }//GEN-LAST:event_jefeKeyReleased

    private void jefeKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jefeKeyTyped
    {//GEN-HEADEREND:event_jefeKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo letras");
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo letras");
        }
    }//GEN-LAST:event_jefeKeyTyped

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarActionPerformed
    {//GEN-HEADEREND:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aceptarActionPerformed
    {//GEN-HEADEREND:event_aceptarActionPerformed
        Nodo aux3 = Multilistas.busca(VentanaPrincipal.r, jComboBoxInstitucion.getSelectedItem().toString());

        if (aux3 != null) {
            //almacenamiento de datos

            Nodo aux4 = Multilistas.busca(aux3.getAbj(), carrera.getText().toUpperCase().trim());

            if (aux4 == null) {
                String NombreInstitucion = jComboBoxInstitucion.getSelectedItem().toString();
                String NombreCarrera = carrera.getText().toUpperCase().trim();
                String JefeCarrera = jefe.getText().toUpperCase().trim();
                long ClaveCarrera = Long.parseLong(clave.getText().trim());
                //creacion de nodo lista
                Carrera aux = new Carrera(ClaveCarrera, NombreCarrera, JefeCarrera);
                Nodo aux2 = new Nodo(aux, NombreCarrera);
                aux2.setArriba(aux3);

                String etq[] = new String[2];

                //localizacion en multilista
                etq = new String[2];
                etq[0] = NombreInstitucion;
                etq[1] = NombreCarrera;

                //insercion en multilista
                VentanaPrincipal.r = Multilistas.insertar(VentanaPrincipal.r, aux2, 0, etq);

                //insercion en el arbol y tabla hash
                VentanaPrincipal.AHash.Insertar(NombreCarrera, aux2);

                //despliegue de multilista
                System.out.println(Multilistas.desp(VentanaPrincipal.r, 0));

                JOptionPane.showMessageDialog(null, "La carrera fue agregada");
                
                System.out.println(Multilistas.desplegarC(aux3.getAbj(), 0));
                
           this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "La carrera ya existe");
                

            }
        }
      
    }//GEN-LAST:event_aceptarActionPerformed
    private void jComboBoxInstitucionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxInstitucionActionPerformed
    {//GEN-HEADEREND:event_jComboBoxInstitucionActionPerformed

    }//GEN-LAST:event_jComboBoxInstitucionActionPerformed

    private void jComboBoxInstitucionItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxInstitucionItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxInstitucionItemStateChanged
        carrera.setEnabled(true);
        habilitarB();
    }//GEN-LAST:event_jComboBoxInstitucionItemStateChanged

    private void carreraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carreraKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (!carrera.getText().trim().equals("") || carrera.getText().trim().equals("")) {
                jefe.setEnabled(true);
                jefe.requestFocus();
            }
        }
    }//GEN-LAST:event_carreraKeyPressed
    private void jefeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jefeKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (!jefe.getText().trim().equals("") || jefe.getText().trim().equals("")) {
                clave.setEnabled(true);
                clave.requestFocus();
            }
        
        }
    }//GEN-LAST:event_jefeKeyPressed


    private void claveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveKeyPressed

    }//GEN-LAST:event_claveKeyPressed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarCarrera dialog = null;
                try {
                    dialog = new RegistrarCarrera(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(RegistrarCarrera.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel Carrera1;
    private javax.swing.JLabel Clave;
    private javax.swing.JLabel Jefe;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField carrera;
    private javax.swing.JTextField clave;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox jComboBoxInstitucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jefe;
    private javax.swing.JPanel pnlAgregarCarrera;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
