package Clases;

import arbolbin.ArbolBinario;

import java.awt.*;
import javax.swing.*;
import listas.GuardaArchivos;
import listas.*;
import listas.Multilistas;
import static listas.Multilistas.busca;

/**
 * EQUIPO 4
 *
 * @author Daniel Alberto Hernandez Castrejon
 * @author Humberto Gonzalez Garduño
 * @author Oscar Lopez Fonseca
 */
public class Principal extends javax.swing.JFrame
{

    public static Nodo raiz = (Nodo) GuardaArchivos.carga("Multilista.dat");
    public static String tec = "";
    public static Nodo[] s = null;
    public static ArbolBinario rHash[] = (ArbolBinario[]) GuardaArchivos.carga("TablaArbol.dat");

    /**
     * Creates new form VentanaP
     */
    public Principal()
    {
        initComponents();
        validarTabla();
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

        jLabel1 = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        FOndo = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_tec.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TECNOLOGICO NACIONAL DE MEXICO");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO_TECNM_BLANCO (1).png"))); // NOI18N
        getContentPane().add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Text.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("Bienvenidos");
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Instituciones");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 210, 60));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reuniones");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 210, 60));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Carreras");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 210, 60));

        FOndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/textura-madera-en-negro_2560x1600_xtrafondos.com.jpg"))); // NOI18N
        FOndo.setText("jLabel2");
        getContentPane().add(FOndo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        GuardaArchivos.guardar(raiz, "Multilista.dat");
        GuardaArchivos.guardar(rHash, "TablaArbol.dat");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
    MI ins=new MI();
    ins.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MC red=new MC();
            red.setVisible(true);
            this.dispose();
           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MR reu=new MR();
           reu.setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void validarTabla()
    {
        int index = 0;
        if (rHash == null)
        {
            rHash = new ArbolBinario[27];
        } else
        {
            for (int i = 0; i < 27; i++)
            {
                if (rHash[i] != null)
                {
                    index += 1;
                }
            }
            if (index == 0)
            {
                rHash = new ArbolBinario[27];
            }
        }
    }

    public static Nodo buscar(Nodo raiz, int nivel, String[] etiqueta)
    {
        if (nivel == etiqueta.length - 1)
        {
            Nodo aux1 = busca(raiz, etiqueta[nivel]);
            if (aux1 != null)
            {
               
            }
            return aux1;
        } else
        {
            return raiz;
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
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FOndo;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
