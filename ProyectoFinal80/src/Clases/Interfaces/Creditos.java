
package Clases.Interfaces;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Creditos extends javax.swing.JDialog
{

    public Creditos(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        
        
        
        initComponents();
        setLocationRelativeTo(null);
                

        
        new Thread(){
        public void run(){
        int x=30;
        int y = getHeight();
        Random  rnd= new Random();
            while (true)
            {
                y--;
                if (y<-220)
                {
                    y=getHeight();
                    
                }
                txtCreditos.setLocation(x+120, (y));
                txtCreditos.setForeground(new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
                
                txtCreditos2.setLocation(x,(y+35));
                txtCreditos2.setForeground(new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
                
                txtCreditos3.setLocation(x+170,(y+35));
                txtCreditos3.setForeground(new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
                
                txtCreditos4.setLocation(x,(y+75));
                txtCreditos4.setForeground(new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
                
                txtCreditos5.setLocation(x,(y+105));
                txtCreditos5.setForeground(new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
                
                txtCreditos6.setLocation(x,(y+140));
                txtCreditos6.setForeground(new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
                
                try{
                sleep(10);
                }catch(Exception e){
                
                } 
                
            }
        }
        }.start();
                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCreditos = new javax.swing.JLabel();
        txtCreditos3 = new javax.swing.JLabel();
        txtCreditos4 = new javax.swing.JLabel();
        txtCreditos5 = new javax.swing.JLabel();
        txtCreditos2 = new javax.swing.JLabel();
        txtCreditos6 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCreditos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCreditos.setText("Creditos");
        jPanel1.add(txtCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        txtCreditos3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCreditos3.setText("Equipo 3");
        jPanel1.add(txtCreditos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        txtCreditos4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCreditos4.setText("Gomez Pompa Cristian Alberto");
        jPanel1.add(txtCreditos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtCreditos5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCreditos5.setText("Galindo Martínez Laura");
        jPanel1.add(txtCreditos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtCreditos2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCreditos2.setText("Elaborado por:");
        jPanel1.add(txtCreditos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        txtCreditos6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCreditos6.setText("García Navarrete Lluvia Maritza");
        txtCreditos6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                txtCreditos6ComponentHidden(evt);
            }
        });
        jPanel1.add(txtCreditos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoCristianMlg.gif"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCreditos6ComponentHidden(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_txtCreditos6ComponentHidden
    {//GEN-HEADEREND:event_txtCreditos6ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditos6ComponentHidden

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Creditos dialog = new Creditos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCreditos;
    private javax.swing.JLabel txtCreditos2;
    private javax.swing.JLabel txtCreditos3;
    private javax.swing.JLabel txtCreditos4;
    private javax.swing.JLabel txtCreditos5;
    private javax.swing.JLabel txtCreditos6;
    // End of variables declaration//GEN-END:variables
}
