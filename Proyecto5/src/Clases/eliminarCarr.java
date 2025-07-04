package Clases;

import arbolbin.TablasHash;
import cjb.ci.CtrlInterfaz;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import listas.GuardaArchivos;
import listas.Multilistas;
import static listas.Multilistas.busca;
import listas.Nodo;

/**
 *
 * @author Daniel Castrejon
 */
public class eliminarCarr extends javax.swing.JFrame
{

    String label[] = new String[2];

    /**
     * Creates new form VtnEliminacionCar
     */
    public eliminarCarr()
    {
        initComponents();
        actualizarUI();
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/tecnm.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        insLabel = new javax.swing.JLabel();
        insComboBox = new javax.swing.JComboBox<>();
        elimLabel = new javax.swing.JLabel();
        carElimComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        elimButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/textura-madera-en-negro_2560x1600_xtrafondos.com.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tecnologico Nacional de Mexico");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO_TECNM_BLANCO (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        insLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        insLabel.setForeground(new java.awt.Color(255, 255, 255));
        insLabel.setText("Institucion:");
        getContentPane().add(insLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        insComboBox.setBackground(new java.awt.Color(153, 153, 153));
        insComboBox.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        insComboBox.setForeground(new java.awt.Color(255, 255, 255));
        insComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        insComboBox.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                insComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(insComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 260, 30));

        elimLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        elimLabel.setForeground(new java.awt.Color(255, 255, 255));
        elimLabel.setText("Carrera:");
        getContentPane().add(elimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 100, -1));

        carElimComboBox.setBackground(new java.awt.Color(153, 153, 153));
        carElimComboBox.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        carElimComboBox.setForeground(new java.awt.Color(255, 255, 255));
        carElimComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        carElimComboBox.setEnabled(false);
        carElimComboBox.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                carElimComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(carElimComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 260, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        elimButton.setBackground(new java.awt.Color(153, 153, 153));
        elimButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        elimButton.setForeground(new java.awt.Color(255, 255, 255));
        elimButton.setText("Eliminar");
        elimButton.setEnabled(false);
        elimButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                elimButtonActionPerformed(evt);
            }
        });
        getContentPane().add(elimButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eliminar Carrera");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Menu Principal");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/textura-madera-en-negro_2560x1600_xtrafondos.com.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void elimButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_elimButtonActionPerformed
    {//GEN-HEADEREND:event_elimButtonActionPerformed
        try
        {
            if (carElimComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || carElimComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "Opcion Invalida");
            } else
            {
                String etiqueta1[] = new String[2];
                etiqueta1[0] = insComboBox.getSelectedItem().toString();
                etiqueta1[1] = carElimComboBox.getSelectedItem().toString();
                Nodo aux = buscar(Principal.raiz,0,etiqueta1);
                Principal.rHash=TablasHash.elimina(Principal.rHash, aux.getEtiqueta().toLowerCase(), aux);
                Principal.s = Multilistas.elimina(Principal.raiz, 0, etiqueta1);
                Principal.raiz = Principal.s[0];
                if (Principal.s[1] == null)
                {
                    JOptionPane.showMessageDialog(null, "Carrera no encontrada");

                } else
                {
                    JOptionPane.showMessageDialog(null, "Carrera eliminada");
                }
                carElimComboBox.removeAllItems();
                carElimComboBox.addItem("Seleccione");
                UpdateUI(Principal.raiz, UpdateLabel(insComboBox.getSelectedItem().toString()), 0);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_elimButtonActionPerformed

    private void insComboBoxItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_insComboBoxItemStateChanged
    {//GEN-HEADEREND:event_insComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            if (insComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || insComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "Opcion Invalida");
                carElimComboBox.removeAllItems();
                carElimComboBox.addItem("Seleccione");
                carElimComboBox.setEnabled(false);
            } else
            {
                CtrlInterfaz.cambia(carElimComboBox);
                Nodo aux = Multilistas.busca(Principal.raiz, insComboBox.getSelectedItem().toString());
                carElimComboBox.removeAllItems();
                carElimComboBox.addItem("Seleccione");
                UpdateUI(aux, UpdateLabel(aux.getEtiqueta()), 0);
            }
        }
    }//GEN-LAST:event_insComboBoxItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void carElimComboBoxItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_carElimComboBoxItemStateChanged
    {//GEN-HEADEREND:event_carElimComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            if (carElimComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || carElimComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                elimButton.setEnabled(false);
            } else
            {
                CtrlInterfaz.cambia(elimButton);
            }
        }
    }//GEN-LAST:event_carElimComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
    JOptionPane.showMessageDialog(this, "Los cambios no Guardados se perderan", "ATENCION", JOptionPane.WARNING_MESSAGE);    
    MC v = new MC();
        v.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Los cambios no Guardados se perderan", "ATENCION", JOptionPane.WARNING_MESSAGE);
        Principal pri=new Principal();
        pri.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    public String desp0(Nodo raiz, int nivel)
    {
        String s = "";
        if (raiz != null)
        {
            s = raiz.getEtiqueta();
            insComboBox.addItem(s);
            desp0(raiz.getSig(), 0);
        }
        return s;
    }

    public void actualizarUI()
    {
        GuardaArchivos.guardar(Principal.raiz, "Multilista.dat");
        desp0(Principal.raiz, 0);

    }

    public void UpdateUI(Nodo raiz, String[] etiqueta, int nivel)
    {
        if (nivel == etiqueta.length - 1)
        {
            Nodo aux = raiz;
            String s = "";
            while (aux != null)
            {
                s = aux.getEtiqueta();
                carElimComboBox.addItem(s);
                aux = aux.getSig();
            }
        } else
        {
            Nodo aux = busca(raiz, etiqueta[nivel]);
            if (aux == null)
            {
                JOptionPane.showMessageDialog(this, "No hay carrera en la institucion seleccionada");

            }
            UpdateUI(aux.getAbj(), etiqueta, nivel + 1);
        }
    }

    public String[] UpdateLabel(String etq)
    {
        label[0] = etq;
        label[1] = "";
        return label;
    }

    public static Nodo buscar(Nodo raiz, int nivel, String[] etiqueta)
    {
        if (nivel == etiqueta.length - 1)
        {
            Nodo aux1 = busca(raiz, etiqueta[nivel]);
            if (aux1 != null)
            {
                System.out.println(aux1.getEtiqueta());
            }
            return aux1;
        } else
        {
            Nodo aux = busca(raiz, etiqueta[nivel]);
            if (aux == null)
            {
                System.out.println("No encontre el dato: " + etiqueta[nivel] + " del nivel " + nivel);
                return raiz;
            } else
            {

                return buscar(aux.getAbj(), nivel + 1, etiqueta);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(eliminarCarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(eliminarCarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(eliminarCarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(eliminarCarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new eliminarCarr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> carElimComboBox;
    private javax.swing.JButton elimButton;
    private javax.swing.JLabel elimLabel;
    private javax.swing.JComboBox<String> insComboBox;
    private javax.swing.JLabel insLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
class FondoPanelg extends JPanel
    {

        private Image imagen;

        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondog.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPanelp extends JPanel
    {

        private Image imagen;

        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondop.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
        //color tecnm azul [30,49,106]
        //  new FondoPanelp()
    }
}
