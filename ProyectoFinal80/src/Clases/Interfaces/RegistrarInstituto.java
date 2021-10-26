package Clases.Interfaces;

import Clases.FondoSwing;
import Clases.Instituto;
import Clases.Interfaces.VentanaPrincipal;
import Clases.Multilistas;
import Clases.Nodo;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistrarInstituto extends javax.swing.JDialog {

    public RegistrarInstituto(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        FondoSwing fondo = new FondoSwing(ImageIO.read(new File("src/Recursos/background.png")));
        pnlInstitucion.setBorder(fondo);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInstitucion = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        clave = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        dir = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        Clave = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Dir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Institución");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        pnlInstitucion.setMaximumSize(new java.awt.Dimension(600, 400));
        pnlInstitucion.setMinimumSize(new java.awt.Dimension(600, 400));
        pnlInstitucion.setLayout(null);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        pnlInstitucion.add(name);
        name.setBounds(220, 120, 230, 30);

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
        pnlInstitucion.add(clave);
        clave.setBounds(220, 220, 230, 30);

        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });
        pnlInstitucion.add(tel);
        tel.setBounds(220, 270, 230, 30);

        dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirActionPerformed(evt);
            }
        });
        dir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dirKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dirKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dirKeyTyped(evt);
            }
        });
        pnlInstitucion.add(dir);
        dir.setBounds(220, 170, 230, 30);

        titulo.setBackground(new java.awt.Color(153, 153, 153));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Registro De Institución");
        pnlInstitucion.add(titulo);
        titulo.setBounds(180, 50, 280, 40);

        Clave.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Clave.setText("Clave");
        pnlInstitucion.add(Clave);
        Clave.setBounds(140, 220, 60, 30);

        Name.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Name.setText("Nombre");
        pnlInstitucion.add(Name);
        Name.setBounds(120, 120, 80, 30);

        Tel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Tel.setText("Teléfono");
        pnlInstitucion.add(Tel);
        Tel.setBounds(110, 270, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Institucion.png"))); // NOI18N
        pnlInstitucion.add(jLabel2);
        jLabel2.setBounds(100, 40, 60, 60);

        Dir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Dir.setText("Dirección");
        pnlInstitucion.add(Dir);
        Dir.setBounds(110, 170, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo_titulos.png"))); // NOI18N
        pnlInstitucion.add(jLabel1);
        jLabel1.setBounds(80, 30, 410, 80);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        pnlInstitucion.add(cancelar);
        cancelar.setBounds(170, 330, 90, 23);

        aceptar.setText("Aceptar");
        aceptar.setEnabled(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        pnlInstitucion.add(aceptar);
        aceptar.setBounds(320, 330, 90, 23);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/g.jpg"))); // NOI18N
        pnlInstitucion.add(fondo);
        fondo.setBounds(-10, -40, 610, 440);

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
        if (!name.getText().isEmpty() && !dir.getText().isEmpty() && !clave.getText().isEmpty() && !tel.getText().isEmpty()) {
            aceptar.setEnabled(true);
        } else {
            aceptar.setEnabled(false);
        }
    }
    private void nameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nameActionPerformed
    {//GEN-HEADEREND:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nameKeyReleased
    {//GEN-HEADEREND:event_nameKeyReleased
        habilitarB();
    }//GEN-LAST:event_nameKeyReleased

    private void nameKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nameKeyTyped
    {//GEN-HEADEREND:event_nameKeyTyped
            
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
    }//GEN-LAST:event_nameKeyTyped

    private void claveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_claveActionPerformed
    {//GEN-HEADEREND:event_claveActionPerformed

    }//GEN-LAST:event_claveActionPerformed

    private void claveKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_claveKeyReleased
    {//GEN-HEADEREND:event_claveKeyReleased
        habilitarB();
    }//GEN-LAST:event_claveKeyReleased

    private void claveKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_claveKeyTyped
    {//GEN-HEADEREND:event_claveKeyTyped
       if(clave.getText().length() >= 10){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
       }
       char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        } else if ((int) evt.getKeyChar() >32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        }


    }//GEN-LAST:event_claveKeyTyped

    private void telActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_telActionPerformed
    {//GEN-HEADEREND:event_telActionPerformed

    }//GEN-LAST:event_telActionPerformed

    private void telKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_telKeyReleased
    {//GEN-HEADEREND:event_telKeyReleased
        habilitarB();
    }//GEN-LAST:event_telKeyReleased

    private void telKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_telKeyTyped
    {//GEN-HEADEREND:event_telKeyTyped

        if(tel.getText().length() >= 10)
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
       }
        char validar = evt.getKeyChar();
       
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        }

    }//GEN-LAST:event_telKeyTyped

    private void dirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dirActionPerformed
    {//GEN-HEADEREND:event_dirActionPerformed

    }//GEN-LAST:event_dirActionPerformed

    private void dirKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_dirKeyReleased
    {//GEN-HEADEREND:event_dirKeyReleased
        habilitarB();
    }//GEN-LAST:event_dirKeyReleased

    private void dirKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_dirKeyTyped
    {//GEN-HEADEREND:event_dirKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo letras");
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <=45
                ||(int) evt.getKeyChar() >= 47 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo letras");
        }
    }//GEN-LAST:event_dirKeyTyped

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarActionPerformed
    {//GEN-HEADEREND:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aceptarActionPerformed
    {//GEN-HEADEREND:event_aceptarActionPerformed

        String nameI = name.getText().toUpperCase().trim();
        String dirI = dir.getText().trim().toUpperCase();
        long claveI = Long.parseLong(clave.getText().trim());
        long telI = Long.parseLong(tel.getText().trim());

        Instituto aux = new Instituto(nameI, claveI, dirI, telI);

        Nodo aux2 = new Nodo(aux, nameI);
        String etq[] = new String[1];
        etq[0] = nameI;
        Nodo aux3 = Multilistas.busca(VentanaPrincipal.r, nameI);

        if (aux3 == null) {
            VentanaPrincipal.r = Multilistas.insertar(VentanaPrincipal.r, aux2, 0, etq);
            System.out.println("Insituto Registrado\n");
            System.out.println(Multilistas.desp(VentanaPrincipal.r, 0));
            JOptionPane.showMessageDialog(this, "Instituto registrado correctamente");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Ya se encuentra registrado el instituto");
            this.dispose();

        }

    }//GEN-LAST:event_aceptarActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (!name.getText().trim().equals("")||name.getText().trim().equals("")) {
                dir.setEnabled(true);
                dir.requestFocus();
            }
        }
    }//GEN-LAST:event_nameKeyPressed

    private void dirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dirKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (!dir.getText().trim().equals("")||dir.getText().trim().equals("")) {
                clave.setEnabled(true);
                clave.requestFocus();
            }
        }
    }//GEN-LAST:event_dirKeyPressed

    private void claveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (!clave.getText().trim().equals("")||clave.getText().trim().equals("")) {
                tel.setEnabled(true);
                tel.requestFocus();
            } 
        }

    }//GEN-LAST:event_claveKeyPressed

    private void telKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyPressed

    }//GEN-LAST:event_telKeyPressed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarInstituto dialog = null;
                try {
                    dialog = new RegistrarInstituto(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(RegistrarInstituto.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel Clave;
    private javax.swing.JLabel Dir;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Tel;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField dir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField name;
    private javax.swing.JPanel pnlInstitucion;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
