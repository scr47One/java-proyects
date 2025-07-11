/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import cjb.ci.CtrlInterfaz;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
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
public class EliminarReu extends javax.swing.JFrame
{

    String label[] = new String[2];
    String label1[] = new String[3];

    /**
     * Creates new form VtnEliminaR
     */
    public EliminarReu()
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechaElimLabel1 = new javax.swing.JLabel();
        insComboBox = new javax.swing.JComboBox<>();
        fechaElimLabel2 = new javax.swing.JLabel();
        carComboBox = new javax.swing.JComboBox<>();
        fechaElimLabel = new javax.swing.JLabel();
        reuElimComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO_TECNM_BLANCO (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eliminar Reunion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        fechaElimLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fechaElimLabel1.setForeground(new java.awt.Color(255, 255, 255));
        fechaElimLabel1.setText("Institucion:");
        getContentPane().add(fechaElimLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

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
        getContentPane().add(insComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 170, 30));

        fechaElimLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fechaElimLabel2.setForeground(new java.awt.Color(255, 255, 255));
        fechaElimLabel2.setText("Carrera:");
        getContentPane().add(fechaElimLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        carComboBox.setBackground(new java.awt.Color(153, 153, 153));
        carComboBox.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        carComboBox.setForeground(new java.awt.Color(255, 255, 255));
        carComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        carComboBox.setEnabled(false);
        carComboBox.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                carComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(carComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 170, 30));

        fechaElimLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fechaElimLabel.setForeground(new java.awt.Color(255, 255, 255));
        fechaElimLabel.setText("Folio:");
        getContentPane().add(fechaElimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        reuElimComboBox.setBackground(new java.awt.Color(153, 153, 153));
        reuElimComboBox.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        reuElimComboBox.setForeground(new java.awt.Color(255, 255, 255));
        reuElimComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        reuElimComboBox.setEnabled(false);
        reuElimComboBox.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                reuElimComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(reuElimComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 170, 30));

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 110, 40));

        EliminarButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        EliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        EliminarButton.setText("Eliminar");
        EliminarButton.setEnabled(false);
        EliminarButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EliminarButtonActionPerformed(evt);
            }
        });
        EliminarButton.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                EliminarButtonKeyPressed(evt);
            }
        });
        getContentPane().add(EliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 140, 40));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Menu Principal");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 210, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/textura-madera-en-negro_2560x1600_xtrafondos.com.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EliminarButtonActionPerformed
    {//GEN-HEADEREND:event_EliminarButtonActionPerformed
        try
        {
            if (reuElimComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || reuElimComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "Opcion Invalida");
            } else
            {
                String etiqueta1[] = new String[3];
                etiqueta1[0] = insComboBox.getSelectedItem().toString();
                etiqueta1[1] = carComboBox.getSelectedItem().toString();
                etiqueta1[2] = reuElimComboBox.getSelectedItem().toString();
                Principal.s = Multilistas.elimina(Principal.raiz, 0, etiqueta1);
                Principal.raiz = Principal.s[0];
                reuElimComboBox.removeAllItems();
                reuElimComboBox.addItem("Seleccione");
                UpdateUI(Principal.raiz, etiqueta1, 0, reuElimComboBox);
                if (Principal.s[1] == null)
                {
                    JOptionPane.showMessageDialog(null, "Reunion no encontrada");

                } else
                {
                    JOptionPane.showMessageDialog(null, "Reunion eliminada");
                }

                reuElimComboBox.removeAllItems();
                reuElimComboBox.addItem("Seleccione");
                UpdateUI(Principal.raiz, etiqueta1, 0, reuElimComboBox);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, " Error !!!\n" + " Intente de nuevo");
        }
    }//GEN-LAST:event_EliminarButtonActionPerformed

    private void EliminarButtonKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_EliminarButtonKeyPressed
    {//GEN-HEADEREND:event_EliminarButtonKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            EliminarButtonActionPerformed(null);
        }
    }//GEN-LAST:event_EliminarButtonKeyPressed

    private void insComboBoxItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_insComboBoxItemStateChanged
    {//GEN-HEADEREND:event_insComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            if (insComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || insComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                CtrlInterfaz.habilita(false, carComboBox);
            } else
            {
                CtrlInterfaz.cambia(carComboBox);
                Nodo aux = Multilistas.busca(Principal.raiz, insComboBox.getSelectedItem().toString());
                carComboBox.removeAllItems();
                carComboBox.addItem("Seleccione");
                UpdateUI(aux, UpdateLabel(aux.getEtiqueta()), 0, carComboBox);
            }
        }
    }//GEN-LAST:event_insComboBoxItemStateChanged

    private void carComboBoxItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_carComboBoxItemStateChanged
    {//GEN-HEADEREND:event_carComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            if (carComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || carComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                CtrlInterfaz.habilita(false, reuElimComboBox);
            } else
            {
                CtrlInterfaz.cambia(reuElimComboBox);
                Nodo aux = Multilistas.busca(Principal.raiz, insComboBox.getSelectedItem().toString());
                reuElimComboBox.removeAllItems();
                reuElimComboBox.addItem("Seleccione");
                UpdateUI(Principal.raiz, UpdateLabel(aux.getEtiqueta(), carComboBox.getSelectedItem().toString()), 0, reuElimComboBox);
            }
        }
    }//GEN-LAST:event_carComboBoxItemStateChanged

    private void reuElimComboBoxItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_reuElimComboBoxItemStateChanged
    {//GEN-HEADEREND:event_reuElimComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            if (reuElimComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || reuElimComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                CtrlInterfaz.habilita(false, EliminarButton);
            } else
            {
                CtrlInterfaz.cambia(EliminarButton);
            }
        }
    }//GEN-LAST:event_reuElimComboBoxItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "Los cambios no Guardados se perderan", "ATENCION", JOptionPane.WARNING_MESSAGE);
        MR v = new MR();
        v.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Los cambios no Guardados se perderan", "ATENCION", JOptionPane.WARNING_MESSAGE);
        Principal pri=new Principal();
        pri.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    public void UpdateUI(Nodo raiz, String[] etiqueta, int nivel, JComboBox comboBox)
    {
        if (nivel == etiqueta.length - 1)
        {
            Nodo aux = raiz;
            String s = "";
            while (aux != null)
            {
                s = aux.getEtiqueta();
                comboBox.addItem(s);
                aux = aux.getSig();
            }
        } else
        {
            Nodo aux = busca(raiz, etiqueta[nivel]);
            if (aux == null)
            {
                System.out.println("NO HAY REUNIONES");
            } else
            {
                UpdateUI(aux.getAbj(), etiqueta, nivel + 1, comboBox);
            }
        }
        GuardaArchivos.guardar(raiz, "Multilista.dat");
    }

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

    public String[] UpdateLabel(String etq)
    {
        label[0] = etq;
        label[1] = "";
        return label;
    }

    public String[] UpdateLabel(String etq, String etq1)
    {
        label1[0] = etq;
        label1[1] = etq1;
        label1[2] = "";
        return label1;
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
            java.util.logging.Logger.getLogger(EliminarReu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EliminarReu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EliminarReu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EliminarReu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new EliminarReu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarButton;
    private javax.swing.JComboBox<String> carComboBox;
    private javax.swing.JLabel fechaElimLabel;
    private javax.swing.JLabel fechaElimLabel1;
    private javax.swing.JLabel fechaElimLabel2;
    private javax.swing.JComboBox<String> insComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> reuElimComboBox;
    // End of variables declaration//GEN-END:variables

}

