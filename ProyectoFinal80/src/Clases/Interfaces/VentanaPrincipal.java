package Clases.Interfaces;


import Clases.Archivos;
import Clases.Carrera;
import Clases.FondoSwing;
import Clases.Instituto;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.NodoArbol;
import Clases.PilasD;
import Clases.Reunion;
import Clases.TablasHash;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;

public class VentanaPrincipal extends javax.swing.JFrame {

    CardLayout cardLayout;
    CardLayout cardLayout2;
    public static Nodo r = null;
    Archivos arch = new Archivos();
    static TablasHash AHash = new TablasHash();
    Nodo InstitucionEncontrada = null;
    Nodo CarreraEncontrada = null;
    boolean carrera = false, reunion = false;

    public VentanaPrincipal() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        JButton[] btns
                = {
                    jButtonHome, jButtonSalir, jButtonBuscar, jButtonBusquedaI, jButtonBusquedaC , jButtonBusquedaCA
                };
        for (JButton btn : btns) {
            btn.setBackground(new Color(240, 240, 240));
            btn.setUI(new BasicButtonUI());
            btn.setBorderPainted(false);
            btn.setContentAreaFilled(false);
            btn.setForeground(Color.white);
            btn.addMouseListener(new MouseListener() {

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setContentAreaFilled(true);
                    btn.setBackground(new Color(46, 204, 223));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setContentAreaFilled(false);
                    btn.setBackground(new Color(240, 240, 240));
                }

                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {
                    btn.setBackground(Color.white);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    btn.setBackground(new Color(46, 204, 223));
                }
            });
        }
        pnlLateral_espacio.setVisible(true);
        FondoSwing fondoLateral = new FondoSwing(ImageIO.read(new File("src/Recursos/background_menu_lateral.png")));
        FondoSwing fondoLateralB = new FondoSwing(ImageIO.read(new File("src/Recursos/background_menu_busqueda_lateral.png")));
        FondoSwing fondo = new FondoSwing(ImageIO.read(new File("src/Recursos/background.png")));
        pnlLateral.setBorder(fondoLateral);
        pnlSuperior.setBorder(fondoLateralB);
        pnlHome.setBorder(fondo);
        pnlBusquedaI.setBorder(fondo);
        pnlBusquedaC.setBorder(fondo);

        cardLayout = (CardLayout) (pnlCentral.getLayout());
        cardLayout2 = (CardLayout) (pnlCentralBusqueda.getLayout());

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlLateral = new javax.swing.JPanel();
        pnlLateral_espacio = new javax.swing.JPanel();
        jLabelIconoHome = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jLabelIconoBuscar = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabelIconoSalir = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        pnlCentral = new javax.swing.JLayeredPane();
        pnlHome = new javax.swing.JPanel();
        jLabelHomeTitle = new javax.swing.JLabel();
        jButtonAgregarInstituto = new javax.swing.JButton();
        jLabelInstitutoTitulo = new javax.swing.JLabel();
        jButtonEliminarInstituto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAgregarCarrera = new javax.swing.JButton();
        jButtonEliminarCarrera = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonAgregarReunion = new javax.swing.JButton();
        jButtonEliminarReunion = new javax.swing.JButton();
        jButtonTransferir = new javax.swing.JButton();
        jLabelAgregar = new javax.swing.JLabel();
        jLabelAgregar1 = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        jLabelAgregar3 = new javax.swing.JLabel();
        jLabelEliminar1 = new javax.swing.JLabel();
        jLabelEliminar2 = new javax.swing.JLabel();
        jLabelTransferir = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jLabelFondo1 = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlBuscar = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        jButtonBusquedaC = new javax.swing.JButton();
        jButtonBusquedaI = new javax.swing.JButton();
        pnlCentralBusqueda = new javax.swing.JLayeredPane();
        pnlBusquedaC = new javax.swing.JPanel();
        jButtonBusquedaCA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBusquedaCA = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaInstitutosA = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlBusquedaI = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxBusquedaI = new javax.swing.JComboBox<>();
        jComboBoxBusquedaC = new javax.swing.JComboBox<>();
        jComboBoxBusquedaR = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaBusquedaR = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBusquedaI = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaBusquedaC = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Proyecto Final 90");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(950, 590));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlPrincipal.setLayout(new java.awt.BorderLayout());

        pnlLateral.setPreferredSize(new java.awt.Dimension(160, 0));
        pnlLateral.setRequestFocusEnabled(false);
        pnlLateral.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        pnlLateral_espacio.setOpaque(false);
        pnlLateral_espacio.setPreferredSize(new java.awt.Dimension(150, 100));

        javax.swing.GroupLayout pnlLateral_espacioLayout = new javax.swing.GroupLayout(pnlLateral_espacio);
        pnlLateral_espacio.setLayout(pnlLateral_espacioLayout);
        pnlLateral_espacioLayout.setHorizontalGroup(
            pnlLateral_espacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnlLateral_espacioLayout.setVerticalGroup(
            pnlLateral_espacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlLateral.add(pnlLateral_espacio);

        jLabelIconoHome.setBounds(40, 40, 40, 40);
        ImageIcon ImagenBotonHome = new ImageIcon(getClass().getResource("/Recursos/home.png"));
        Icon FondoBotonHome = new ImageIcon(ImagenBotonHome.getImage().getScaledInstance(jLabelIconoHome.getWidth(),jLabelIconoHome.getHeight(), Image.SCALE_SMOOTH));
        jLabelIconoHome.setIcon(FondoBotonHome);
        jLabelIconoHome.setPreferredSize(new java.awt.Dimension(40, 40));
        pnlLateral.add(jLabelIconoHome);

        jButtonHome.setText("Home");
        jButtonHome.setBorder(null);
        jButtonHome.setPreferredSize(new java.awt.Dimension(80, 30));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        pnlLateral.add(jButtonHome);

        jLabelIconoBuscar.setBounds(40, 40, 40, 40);
        ImageIcon ImagenBotonBuscar = new ImageIcon(getClass().getResource("/Recursos/search.png"));
        Icon FondoBotonBuscar = new ImageIcon(ImagenBotonBuscar.getImage().getScaledInstance(jLabelIconoBuscar.getWidth(),jLabelIconoBuscar.getHeight(), Image.SCALE_SMOOTH));
        jLabelIconoBuscar.setIcon(FondoBotonBuscar);
        jLabelIconoBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        pnlLateral.add(jLabelIconoBuscar);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(80, 30));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        pnlLateral.add(jButtonBuscar);

        jLabelIconoSalir.setBounds(40, 40, 40, 40);
        ImageIcon ImagenBotonSalir = new ImageIcon(getClass().getResource("/Recursos/logout.png"));
        Icon FondoBotonSalir = new ImageIcon(ImagenBotonSalir.getImage().getScaledInstance(jLabelIconoSalir.getWidth(),jLabelIconoSalir.getHeight(), Image.SCALE_SMOOTH));
        jLabelIconoSalir.setIcon(FondoBotonSalir);
        jLabelIconoSalir.setPreferredSize(new java.awt.Dimension(40, 40));
        pnlLateral.add(jLabelIconoSalir);

        jButtonSalir.setText("Salir");
        jButtonSalir.setPreferredSize(new java.awt.Dimension(80, 30));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        pnlLateral.add(jButtonSalir);

        pnlPrincipal.add(pnlLateral, java.awt.BorderLayout.WEST);

        pnlCentral.setLayout(new java.awt.CardLayout());

        pnlHome.setLayout(null);

        jLabelHomeTitle.setFont(jLabelHomeTitle.getFont().deriveFont(jLabelHomeTitle.getFont().getSize()+29f));
        jLabelHomeTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHomeTitle.setText("Home");
        pnlHome.add(jLabelHomeTitle);
        jLabelHomeTitle.setBounds(120, 10, 130, 60);

        jButtonAgregarInstituto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Agregar.png"))); // NOI18N
        jButtonAgregarInstituto.setToolTipText("Agregar Instituto");
        jButtonAgregarInstituto.setBorderPainted(false);
        jButtonAgregarInstituto.setContentAreaFilled(false);
        jButtonAgregarInstituto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarInstitutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAgregarInstitutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAgregarInstitutoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAgregarInstitutoMousePressed(evt);
            }
        });
        jButtonAgregarInstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarInstitutoActionPerformed(evt);
            }
        });
        pnlHome.add(jButtonAgregarInstituto);
        jButtonAgregarInstituto.setBounds(280, 140, 90, 90);

        jLabelInstitutoTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInstitutoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInstitutoTitulo.setText("Institutos");
        pnlHome.add(jLabelInstitutoTitulo);
        jLabelInstitutoTitulo.setBounds(90, 120, 120, 40);

        jButtonEliminarInstituto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Eliminar.png"))); // NOI18N
        jButtonEliminarInstituto.setToolTipText("Eliminar Instituto");
        jButtonEliminarInstituto.setBorderPainted(false);
        jButtonEliminarInstituto.setContentAreaFilled(false);
        jButtonEliminarInstituto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarInstitutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarInstitutoMouseExited(evt);
            }
        });
        jButtonEliminarInstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarInstitutoActionPerformed(evt);
            }
        });
        pnlHome.add(jButtonEliminarInstituto);
        jButtonEliminarInstituto.setBounds(590, 140, 80, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carreras");
        pnlHome.add(jLabel1);
        jLabel1.setBounds(90, 260, 100, 30);

        jButtonAgregarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Agregar.png"))); // NOI18N
        jButtonAgregarCarrera.setToolTipText("Agregar Carrera");
        jButtonAgregarCarrera.setBorderPainted(false);
        jButtonAgregarCarrera.setContentAreaFilled(false);
        jButtonAgregarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarCarreraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAgregarCarreraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAgregarCarreraMouseExited(evt);
            }
        });
        jButtonAgregarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCarreraActionPerformed(evt);
            }
        });
        pnlHome.add(jButtonAgregarCarrera);
        jButtonAgregarCarrera.setBounds(280, 280, 80, 80);

        jButtonEliminarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Eliminar.png"))); // NOI18N
        jButtonEliminarCarrera.setToolTipText("Eliminar Carrera");
        jButtonEliminarCarrera.setBorderPainted(false);
        jButtonEliminarCarrera.setContentAreaFilled(false);
        jButtonEliminarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarCarreraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarCarreraMouseExited(evt);
            }
        });
        jButtonEliminarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCarreraActionPerformed(evt);
            }
        });
        pnlHome.add(jButtonEliminarCarrera);
        jButtonEliminarCarrera.setBounds(590, 280, 80, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reuniones");
        pnlHome.add(jLabel2);
        jLabel2.setBounds(90, 390, 100, 50);

        jButtonAgregarReunion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Agregar.png"))); // NOI18N
        jButtonAgregarReunion.setToolTipText("Agregar Reunion ");
        jButtonAgregarReunion.setBorderPainted(false);
        jButtonAgregarReunion.setContentAreaFilled(false);
        jButtonAgregarReunion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarReunionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAgregarReunionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAgregarReunionMouseExited(evt);
            }
        });
        jButtonAgregarReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarReunionActionPerformed(evt);
            }
        });
        pnlHome.add(jButtonAgregarReunion);
        jButtonAgregarReunion.setBounds(280, 420, 80, 89);

        jButtonEliminarReunion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Eliminar.png"))); // NOI18N
        jButtonEliminarReunion.setToolTipText("Eliminar Reunion");
        jButtonEliminarReunion.setBorderPainted(false);
        jButtonEliminarReunion.setContentAreaFilled(false);
        jButtonEliminarReunion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarReunionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarReunionMouseExited(evt);
            }
        });
        jButtonEliminarReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarReunionActionPerformed(evt);
            }
        });
        pnlHome.add(jButtonEliminarReunion);
        jButtonEliminarReunion.setBounds(590, 420, 90, 90);

        jButtonTransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transferir.png"))); // NOI18N
        jButtonTransferir.setToolTipText("Transferir Carrera");
        jButtonTransferir.setBorderPainted(false);
        jButtonTransferir.setContentAreaFilled(false);
        jButtonTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTransferirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTransferirMouseExited(evt);
            }
        });
        jButtonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferirActionPerformed(evt);
            }
        });
        pnlHome.add(jButtonTransferir);
        jButtonTransferir.setBounds(430, 290, 80, 70);

        jLabelAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregar.setText("Agregar");
        pnlHome.add(jLabelAgregar);
        jLabelAgregar.setBounds(290, 260, 50, 14);

        jLabelAgregar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregar1.setText("Agregar");
        pnlHome.add(jLabelAgregar1);
        jLabelAgregar1.setBounds(290, 400, 50, 14);

        jLabelEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminar.setText("Eliminar");
        pnlHome.add(jLabelEliminar);
        jLabelEliminar.setBounds(610, 400, 50, 14);

        jLabelAgregar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregar3.setText("Agregar");
        pnlHome.add(jLabelAgregar3);
        jLabelAgregar3.setBounds(290, 120, 50, 14);

        jLabelEliminar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminar1.setText("Eliminar");
        pnlHome.add(jLabelEliminar1);
        jLabelEliminar1.setBounds(600, 120, 50, 14);

        jLabelEliminar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEliminar2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminar2.setText("Eliminar");
        pnlHome.add(jLabelEliminar2);
        jLabelEliminar2.setBounds(610, 260, 50, 14);

        jLabelTransferir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTransferir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTransferir.setText("Transferir");
        pnlHome.add(jLabelTransferir);
        jLabelTransferir.setBounds(440, 260, 70, 15);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoObjetos.png"))); // NOI18N
        jLabelFondo.setText("jLabel3");
        jLabelFondo.setPreferredSize(new java.awt.Dimension(650, 150));
        pnlHome.add(jLabelFondo);
        jLabelFondo.setBounds(50, 380, 670, 150);

        jLabelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoObjetos.png"))); // NOI18N
        jLabelFondo1.setText("jLabel3");
        jLabelFondo1.setPreferredSize(new java.awt.Dimension(650, 150));
        pnlHome.add(jLabelFondo1);
        jLabelFondo1.setBounds(50, 110, 680, 140);

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoObjetos.png"))); // NOI18N
        jLabelFondo2.setText("jLabel3");
        jLabelFondo2.setPreferredSize(new java.awt.Dimension(650, 150));
        pnlHome.add(jLabelFondo2);
        jLabelFondo2.setBounds(50, 240, 670, 150);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/hacker.png"))); // NOI18N
        jButton1.setToolTipText("No hagas click aqui");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlHome.add(jButton1);
        jButton1.setBounds(730, 510, 50, 40);

        jLabel6.setIcon(FondoBotonHome);
        pnlHome.add(jLabel6);
        jLabel6.setBounds(40, 10, 60, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Titulos_Menu.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        pnlHome.add(jLabel8);
        jLabel8.setBounds(20, 0, 250, 80);

        pnlCentral.add(pnlHome, "pnlCardHome");

        pnlBuscar.setLayout(null);

        pnlSuperior.setBackground(new java.awt.Color(51, 51, 51));

        jButtonBusquedaC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBusquedaC.setText("Buscar por Carrera");
        jButtonBusquedaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaCActionPerformed(evt);
            }
        });

        jButtonBusquedaI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBusquedaI.setText("Buscar por Instituto");
        jButtonBusquedaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(jButtonBusquedaC, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSuperiorLayout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jButtonBusquedaI, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(433, Short.MAX_VALUE)))
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBusquedaC, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSuperiorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButtonBusquedaI, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnlBuscar.add(pnlSuperior);
        pnlSuperior.setBounds(0, 0, 790, 60);

        pnlCentralBusqueda.setLayout(new java.awt.CardLayout());

        pnlBusquedaC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBusquedaCA.setBounds(40, 40, 40, 40);
        jButtonBusquedaCA.setIcon(FondoBotonBuscar);
        jButtonBusquedaCA.setBorderPainted(false);
        jButtonBusquedaCA.setContentAreaFilled(false);
        jButtonBusquedaCA.setEnabled(false);
        jButtonBusquedaCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaCAActionPerformed(evt);
            }
        });
        pnlBusquedaC.add(jButtonBusquedaCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 40, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Busqueda por Carrera");
        pnlBusquedaC.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 260, 40));

        jTextFieldBusquedaCA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldBusquedaCA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBusquedaCA.setBorder(null);
        jTextFieldBusquedaCA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBusquedaCAMouseClicked(evt);
            }
        });
        jTextFieldBusquedaCA.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextFieldBusquedaCAPropertyChange(evt);
            }
        });
        jTextFieldBusquedaCA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaCAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaCAKeyTyped(evt);
            }
        });
        pnlBusquedaC.add(jTextFieldBusquedaCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 160, 40));

        jTextAreaInstitutosA.setEditable(false);
        jTextAreaInstitutosA.setColumns(20);
        jTextAreaInstitutosA.setRows(5);
        jScrollPane5.setViewportView(jTextAreaInstitutosA);

        pnlBusquedaC.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 700, 293));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Titulos_Menu.png"))); // NOI18N
        pnlBusquedaC.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Titulos_Menu.png"))); // NOI18N
        pnlBusquedaC.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 60));

        pnlCentralBusqueda.add(pnlBusquedaC, "pnlCardBusquedaC");

        pnlBusquedaI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Instituto");
        pnlBusquedaI.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoBuscar.png"))); // NOI18N
        pnlBusquedaI.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carreras");
        pnlBusquedaI.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 130, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoBuscar.png"))); // NOI18N
        pnlBusquedaI.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 230, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reuniones");
        pnlBusquedaI.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 140, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoBuscar.png"))); // NOI18N
        pnlBusquedaI.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 230, 50));

        jComboBoxBusquedaI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un instituto..." }));
        jComboBoxBusquedaI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxBusquedaIItemStateChanged(evt);
            }
        });
        pnlBusquedaI.add(jComboBoxBusquedaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 200, 30));

        jComboBoxBusquedaC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxBusquedaCItemStateChanged(evt);
            }
        });
        pnlBusquedaI.add(jComboBoxBusquedaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 200, 30));

        jComboBoxBusquedaR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxBusquedaRItemStateChanged(evt);
            }
        });
        pnlBusquedaI.add(jComboBoxBusquedaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 200, 30));

        jTextAreaBusquedaR.setEditable(false);
        jTextAreaBusquedaR.setColumns(20);
        jTextAreaBusquedaR.setRows(5);
        jTextAreaBusquedaR.setPreferredSize(new java.awt.Dimension(100, 100));
        jScrollPane3.setViewportView(jTextAreaBusquedaR);

        pnlBusquedaI.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 200, 250));

        jTextAreaBusquedaI.setEditable(false);
        jTextAreaBusquedaI.setColumns(20);
        jTextAreaBusquedaI.setRows(5);
        jTextAreaBusquedaI.setPreferredSize(new java.awt.Dimension(100, 100));
        jScrollPane1.setViewportView(jTextAreaBusquedaI);

        pnlBusquedaI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 200, 250));

        jTextAreaBusquedaC.setEditable(false);
        jTextAreaBusquedaC.setColumns(20);
        jTextAreaBusquedaC.setRows(5);
        jTextAreaBusquedaC.setPreferredSize(new java.awt.Dimension(100, 100));
        jScrollPane2.setViewportView(jTextAreaBusquedaC);

        pnlBusquedaI.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 200, 250));

        pnlCentralBusqueda.add(pnlBusquedaI, "pnlCardBusquedaI");

        pnlBuscar.add(pnlCentralBusqueda);
        pnlCentralBusqueda.setBounds(0, 60, 800, 530);

        pnlCentral.add(pnlBuscar, "pnlCardBuscar");

        pnlPrincipal.add(pnlCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonHomeActionPerformed
    {//GEN-HEADEREND:event_jButtonHomeActionPerformed
        cardLayout.show(pnlCentral, "pnlCardHome");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonEliminarInstitutoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonEliminarInstitutoActionPerformed
    {//GEN-HEADEREND:event_jButtonEliminarInstitutoActionPerformed
        try {
            new EliminarInstituto(this, true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarInstitutoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBuscarActionPerformed
    {//GEN-HEADEREND:event_jButtonBuscarActionPerformed
        jComboBoxBusquedaI.removeAllItems();
        Instituto aux;
        Nodo raiz = VentanaPrincipal.r;

        while (raiz != null) {
            aux = (Instituto) raiz.getObj();
            String auxS = aux.getNombre();
            jComboBoxBusquedaI.addItem(auxS);
            raiz = raiz.getSig();
        }

        cardLayout.show(pnlCentral, "pnlCardBuscar");


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSalirActionPerformed
    {//GEN-HEADEREND:event_jButtonSalirActionPerformed
        formWindowClosing(null);


    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAgregarInstitutoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonAgregarInstitutoActionPerformed
    {//GEN-HEADEREND:event_jButtonAgregarInstitutoActionPerformed
        try {
            new RegistrarInstituto(this, true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonAgregarInstitutoActionPerformed

    private void jButtonAgregarInstitutoMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarInstitutoMouseEntered
    {//GEN-HEADEREND:event_jButtonAgregarInstitutoMouseEntered

        jButtonAgregarInstituto.setIcon(new ImageIcon(getClass().getResource("/Recursos/AgregarSelected.png")));

    }//GEN-LAST:event_jButtonAgregarInstitutoMouseEntered

    private void jButtonAgregarInstitutoMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarInstitutoMouseExited
    {//GEN-HEADEREND:event_jButtonAgregarInstitutoMouseExited
        jButtonAgregarInstituto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Agregar.png")));
    }//GEN-LAST:event_jButtonAgregarInstitutoMouseExited

    private void jButtonAgregarInstitutoMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarInstitutoMousePressed
    {//GEN-HEADEREND:event_jButtonAgregarInstitutoMousePressed

    }//GEN-LAST:event_jButtonAgregarInstitutoMousePressed

    private void jButtonAgregarCarreraMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarCarreraMouseClicked
    {//GEN-HEADEREND:event_jButtonAgregarCarreraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarCarreraMouseClicked

    private void jButtonAgregarInstitutoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarInstitutoMouseClicked
    {//GEN-HEADEREND:event_jButtonAgregarInstitutoMouseClicked
        jButtonAgregarInstituto.setIcon(new ImageIcon(getClass().getResource("/Recursos/AgregarClick.png")));
    }//GEN-LAST:event_jButtonAgregarInstitutoMouseClicked

    private void jButtonAgregarCarreraMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarCarreraMouseEntered
    {//GEN-HEADEREND:event_jButtonAgregarCarreraMouseEntered
        jButtonAgregarCarrera.setIcon(new ImageIcon(getClass().getResource("/Recursos/AgregarSelected.png")));
    }//GEN-LAST:event_jButtonAgregarCarreraMouseEntered

    private void jButtonAgregarCarreraMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarCarreraMouseExited
    {//GEN-HEADEREND:event_jButtonAgregarCarreraMouseExited
        jButtonAgregarCarrera.setIcon(new ImageIcon(getClass().getResource("/Recursos/Agregar.png")));
    }//GEN-LAST:event_jButtonAgregarCarreraMouseExited

    private void jButtonAgregarCarreraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonAgregarCarreraActionPerformed
    {//GEN-HEADEREND:event_jButtonAgregarCarreraActionPerformed
        jButtonAgregarCarrera.setIcon(new ImageIcon(getClass().getResource("/Recursos/AgregarClick.png")));
        try {
            new RegistrarCarrera(this, true).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonAgregarCarreraActionPerformed

    private void jButtonAgregarReunionMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarReunionMouseEntered
    {//GEN-HEADEREND:event_jButtonAgregarReunionMouseEntered
        jButtonAgregarReunion.setIcon(new ImageIcon(getClass().getResource("/Recursos/AgregarSelected.png")));
    }//GEN-LAST:event_jButtonAgregarReunionMouseEntered

    private void jButtonAgregarReunionMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarReunionMouseExited
    {//GEN-HEADEREND:event_jButtonAgregarReunionMouseExited
        jButtonAgregarReunion.setIcon(new ImageIcon(getClass().getResource("/Recursos/Agregar.png")));
    }//GEN-LAST:event_jButtonAgregarReunionMouseExited

    private void jButtonAgregarReunionMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonAgregarReunionMouseClicked
    {//GEN-HEADEREND:event_jButtonAgregarReunionMouseClicked
        jButtonAgregarReunion.setIcon(new ImageIcon(getClass().getResource("/Recursos/AgregarClick.png")));
    }//GEN-LAST:event_jButtonAgregarReunionMouseClicked

    private void jButtonTransferirMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonTransferirMouseEntered
    {//GEN-HEADEREND:event_jButtonTransferirMouseEntered
        jButtonTransferir.setIcon(new ImageIcon(getClass().getResource("/Recursos/TransferirSelected.png")));
    }//GEN-LAST:event_jButtonTransferirMouseEntered

    private void jButtonTransferirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonTransferirActionPerformed
    {//GEN-HEADEREND:event_jButtonTransferirActionPerformed
        jButtonTransferir.setIcon(new ImageIcon(getClass().getResource("/Recursos/TransferirClick.png")));
        try {
            new TransferirCarrera(this, true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonTransferirActionPerformed

    private void jButtonTransferirMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonTransferirMouseExited
    {//GEN-HEADEREND:event_jButtonTransferirMouseExited
        jButtonTransferir.setIcon(new ImageIcon(getClass().getResource("/Recursos/Transferir.png")));
    }//GEN-LAST:event_jButtonTransferirMouseExited

    private void jButtonEliminarInstitutoMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonEliminarInstitutoMouseEntered
    {//GEN-HEADEREND:event_jButtonEliminarInstitutoMouseEntered
        jButtonEliminarInstituto.setIcon(new ImageIcon(getClass().getResource("/Recursos/EliminarSelected.png")));
    }//GEN-LAST:event_jButtonEliminarInstitutoMouseEntered

    private void jButtonEliminarInstitutoMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonEliminarInstitutoMouseExited
    {//GEN-HEADEREND:event_jButtonEliminarInstitutoMouseExited
        jButtonEliminarInstituto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Eliminar.png")));
    }//GEN-LAST:event_jButtonEliminarInstitutoMouseExited

    private void jButtonEliminarCarreraMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonEliminarCarreraMouseEntered
    {//GEN-HEADEREND:event_jButtonEliminarCarreraMouseEntered
        jButtonEliminarCarrera.setIcon(new ImageIcon(getClass().getResource("/Recursos/EliminarSelected.png")));
    }//GEN-LAST:event_jButtonEliminarCarreraMouseEntered

    private void jButtonEliminarCarreraMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonEliminarCarreraMouseExited
    {//GEN-HEADEREND:event_jButtonEliminarCarreraMouseExited
        jButtonEliminarCarrera.setIcon(new ImageIcon(getClass().getResource("/Recursos/Eliminar.png")));
    }//GEN-LAST:event_jButtonEliminarCarreraMouseExited

    private void jButtonEliminarReunionMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonEliminarReunionMouseEntered
    {//GEN-HEADEREND:event_jButtonEliminarReunionMouseEntered
        jButtonEliminarReunion.setIcon(new ImageIcon(getClass().getResource("/Recursos/EliminarSelected.png")));
    }//GEN-LAST:event_jButtonEliminarReunionMouseEntered

    private void jButtonEliminarReunionMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonEliminarReunionMouseExited
    {//GEN-HEADEREND:event_jButtonEliminarReunionMouseExited
        jButtonEliminarReunion.setIcon(new ImageIcon(getClass().getResource("/Recursos/Eliminar.png")));
    }//GEN-LAST:event_jButtonEliminarReunionMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        ImageIcon Advertencia = new ImageIcon(getClass().getResource("/Recursos/AdvertenciaCerrar.png"));
        Icon Advertencia1 = new ImageIcon(Advertencia.getImage());
        int opc;
        opc = JOptionPane.showConfirmDialog(null, "¿Salir del Programa?", "¿Estas Seguro?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, Advertencia1);
        if (opc == 0) {
            
            arch.GuardarEnArchivo(r, "Multilista.txt");
            arch.GuardarEnArchivo(AHash.getAHash(), "TablaHash.txt");
            System.out.println("Raiz guardada");
            System.out.println("Tabla hash guardada");
            this.dispose();

        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonAgregarReunionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonAgregarReunionActionPerformed
    {//GEN-HEADEREND:event_jButtonAgregarReunionActionPerformed
        try {
            new RegistrarReunion(this, true).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAgregarReunionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        Nodo aux = (Nodo) arch.LeerArchivo("Multilista.txt");
        r = aux;

        AHash.CargarTablaHash();
        
        System.out.println("");
        if (r != null) {
            System.out.println("Multilista cargada de archivo: ");
            System.out.println(Multilistas.desp(r, 0));
        }

    }//GEN-LAST:event_formWindowOpened

    private void jButtonEliminarCarreraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonEliminarCarreraActionPerformed
    {//GEN-HEADEREND:event_jButtonEliminarCarreraActionPerformed
        try {
            new EliminarCarrera(this, true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarCarreraActionPerformed

    private void jButtonEliminarReunionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonEliminarReunionActionPerformed
    {//GEN-HEADEREND:event_jButtonEliminarReunionActionPerformed
        try {
            new EliminarReunion(this, true);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarReunionActionPerformed

    private void jButtonBusquedaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaIActionPerformed
        cardLayout2.show(pnlCentralBusqueda, "pnlCardBusquedaI");
    }//GEN-LAST:event_jButtonBusquedaIActionPerformed

    private void jButtonBusquedaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaCActionPerformed
        cardLayout2.show(pnlCentralBusqueda, "pnlCardBusquedaC");
    }//GEN-LAST:event_jButtonBusquedaCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Creditos(this, true).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldBusquedaCAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaCAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusquedaCAMouseClicked

    private void jTextFieldBusquedaCAPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaCAPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusquedaCAPropertyChange

    private void jTextFieldBusquedaCAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaCAKeyReleased

        if (jTextFieldBusquedaCA.getText().isEmpty() && jTextFieldBusquedaCA.getText().trim().equals("")) {
            jButtonBusquedaCA.setEnabled(false);
        } else {
            jButtonBusquedaCA.setEnabled(true);
        }

    }//GEN-LAST:event_jTextFieldBusquedaCAKeyReleased

    private void jButtonBusquedaCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaCAActionPerformed
        String carr = "";
        try {
            Nodo Aux1 = AHash.Buscar( jTextFieldBusquedaCA.getText().toUpperCase().trim());
            PilasD ls = new PilasD();
            ls.setTope(Aux1);
            NodoArbol[] arr = new NodoArbol[2];
            System.out.println("");
            System.out.println("Desplegando lista de carreras encontradas: ");

            Boolean PilaLLena = true;
            do {

                Nodo aux = ls.elimina();
                if (aux != null) {
                    System.out.println("Carrera encontrada: " + aux.getEtq());
                    System.out.println("Instituto de la carrera: " + aux.getArriba().getEtq());
                    System.out.println("");
                    Instituto instituto = (Instituto) aux.getArriba().getObj();
                    carr+= "Instituto: "+ instituto.getNombre()+ "\n";
                   
                    carr += "Direccion: " + instituto.getDireccion()+ "\n";
                    carr += "Clave: " + instituto.getClave()+ "\n";
                    carr += "Telefono: "+ instituto.getTelefono()+ "\n\n";
                } else {
                    PilaLLena = false;
                }

            } while (PilaLLena);
            if (!"".equals(carr)) {

                jTextAreaInstitutosA.setText("Institutos que ofrecen la carrera\n\n" + carr);
            } else {
                jTextAreaInstitutosA.setText("No se encontro ningun instituto que ofrezca la carrera");
            }

        } catch (Exception ex) {
            System.out.println("Exepcion encontrada: " + ex.toString());
        }

    }//GEN-LAST:event_jButtonBusquedaCAActionPerformed

    private void jComboBoxBusquedaIItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxBusquedaIItemStateChanged
        InstitucionEncontrada = null;
        CarreraEncontrada = null;

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jComboBoxBusquedaC.removeAllItems();
            jComboBoxBusquedaR.removeAllItems();

            carrera = false;
            Carrera aux;
            String Nombreaux = jComboBoxBusquedaI.getSelectedItem().toString();
            Nodo auxbusca = Multilistas.busca(VentanaPrincipal.r, Nombreaux);

            if (auxbusca != null && auxbusca.getAbj() != null) {
                InstitucionEncontrada = auxbusca;
                auxbusca = auxbusca.getAbj();

                while (auxbusca != null) {
                    aux = (Carrera) auxbusca.getObj();
                    String auxS = aux.getNombre();
                    jComboBoxBusquedaC.addItem(auxS);
                    auxbusca = auxbusca.getSig();
                }
                carrera = true;

            }

            Nodo aux1 = Multilistas.busca(r, jComboBoxBusquedaI.getSelectedItem().toString());
            Instituto auxI;
            auxI = (Instituto) aux1.getObj();
            String auxinfo;
            auxinfo = "Nombre: " + auxI.getNombre() + "\n";
            auxinfo += "Clave: " + auxI.getClave() + "\n";
            auxinfo += "Telefono: " + auxI.getTelefono() + "\n";
            auxinfo += "Direccion: " + auxI.getDireccion() + "\n\n";
            jTextAreaBusquedaI.setText(auxinfo);
            if (aux1.getAbj() != null) {
                Nodo aux2 = Multilistas.busca(aux1.getAbj(), jComboBoxBusquedaC.getSelectedItem().toString());
                Carrera auxC;
                auxC = (Carrera) aux2.getObj();
                String auxinfoC;
                auxinfoC = "Nombre: " + auxC.getNombre() + "\n";
                auxinfoC += "Jefe: " + auxC.getJefe() + "\n";
                auxinfoC += "Matricula: " + auxC.getMatricula() + "\n";
                jTextAreaBusquedaC.setText(auxinfoC);

                if (aux2.getAbj() != null) {
                    Nodo aux3 = Multilistas.busca(aux2.getAbj(), jComboBoxBusquedaR.getSelectedItem().toString());
                    Reunion auxR;
                    auxR = (Reunion) aux3.getObj();
                    String auxinfoR;
                    auxinfoR = "Fecha: " + auxR.getFecha() + "\n";
                    auxinfoR += "Folio: " + auxR.getFolio() + "\n";
                    auxinfoR += "Motivo: " + auxR.getMotivo() + "\n";
                    jTextAreaBusquedaR.setText(auxinfoR);
                } else {
                    jTextAreaBusquedaR.setText("No hay reuniones");
                }
            } else {
                jTextAreaBusquedaC.setText("No hay carreras");
                jTextAreaBusquedaR.setText("No hay reuniones");
            }

        }


    }//GEN-LAST:event_jComboBoxBusquedaIItemStateChanged

    private void jComboBoxBusquedaCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxBusquedaCItemStateChanged
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        CarreraEncontrada = null;
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jComboBoxBusquedaR.removeAllItems();

            reunion = false;
            Reunion aux;
            String Nombreaux = jComboBoxBusquedaC.getSelectedItem().toString();
            Nodo auxbusca2 = Multilistas.busca(InstitucionEncontrada.getAbj(), Nombreaux);

            if (auxbusca2 != null && auxbusca2.getAbj() != null) {
                CarreraEncontrada = auxbusca2;
                auxbusca2 = auxbusca2.getAbj();

                while (auxbusca2 != null) {
                    aux = (Reunion) auxbusca2.getObj();
                    String auxS = String.valueOf(aux.getFolio());
                    modelo.addElement(auxS);

                    auxbusca2 = auxbusca2.getSig();
                }
                jComboBoxBusquedaR.setModel(modelo);
                reunion = true;

            }
            if (InstitucionEncontrada != null && InstitucionEncontrada.getAbj() != null) {
                Nodo aux2 = Multilistas.busca(InstitucionEncontrada.getAbj(), jComboBoxBusquedaC.getSelectedItem().toString());
                Carrera auxC;
                auxC = (Carrera) aux2.getObj();
                String auxinfoC;
                auxinfoC = "Nombre: " + auxC.getNombre() + "\n";
                auxinfoC += "Jefe: " + auxC.getJefe() + "\n";
                auxinfoC += "Matricula: " + auxC.getMatricula() + "\n";
                jTextAreaBusquedaC.setText(auxinfoC);

                if (aux2.getAbj() != null) {
                    Nodo aux3 = Multilistas.busca(aux2.getAbj(), jComboBoxBusquedaR.getSelectedItem().toString());
                    Reunion auxR;
                    auxR = (Reunion) aux3.getObj();
                    String auxinfoR;
                    auxinfoR = "Fecha: " + auxR.getFecha() + "\n";
                    auxinfoR += "Folio: " + auxR.getFolio() + "\n";
                    auxinfoR += "Motivo: " + auxR.getMotivo() + "\n";
                    jTextAreaBusquedaR.setText(auxinfoR);
                } else {
                    jTextAreaBusquedaR.setText("No hay reuniones");
                }
            } else {
                jTextAreaBusquedaC.setText("No hay carreras");
            }
        }


    }//GEN-LAST:event_jComboBoxBusquedaCItemStateChanged

    private void jComboBoxBusquedaRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxBusquedaRItemStateChanged
        if (CarreraEncontrada != null && CarreraEncontrada.getAbj() != null) {
            System.out.println("Carrera Enconttrada: " + CarreraEncontrada.getEtq());
            System.out.println("Carrera Enconttrada Abajo: " + CarreraEncontrada.getAbj().getEtq());
            Nodo aux3 = Multilistas.busca(CarreraEncontrada.getAbj(), jComboBoxBusquedaR.getSelectedItem().toString());
            Reunion auxR;
            auxR = (Reunion) aux3.getObj();
            String auxinfoR;
            auxinfoR = "Fecha: " + auxR.getFecha() + "\n";
            auxinfoR += "Folio: " + auxR.getFolio() + "\n";
            auxinfoR += "Motivo: " + auxR.getMotivo() + "\n";
            jTextAreaBusquedaR.setText(auxinfoR);
        } else {
            jTextAreaBusquedaR.setText("No hay Reuniones");
        }

    }//GEN-LAST:event_jComboBoxBusquedaRItemStateChanged

    private void jTextFieldBusquedaCAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaCAKeyTyped
    
       
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
    }//GEN-LAST:event_jTextFieldBusquedaCAKeyTyped


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaPrincipal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarCarrera;
    private javax.swing.JButton jButtonAgregarInstituto;
    private javax.swing.JButton jButtonAgregarReunion;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBusquedaC;
    private javax.swing.JButton jButtonBusquedaCA;
    private javax.swing.JButton jButtonBusquedaI;
    private javax.swing.JButton jButtonEliminarCarrera;
    private javax.swing.JButton jButtonEliminarInstituto;
    private javax.swing.JButton jButtonEliminarReunion;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTransferir;
    private javax.swing.JComboBox<String> jComboBoxBusquedaC;
    private javax.swing.JComboBox<String> jComboBoxBusquedaI;
    private javax.swing.JComboBox<String> jComboBoxBusquedaR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelAgregar1;
    private javax.swing.JLabel jLabelAgregar3;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEliminar1;
    private javax.swing.JLabel jLabelEliminar2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondo1;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelHomeTitle;
    private javax.swing.JLabel jLabelIconoBuscar;
    private javax.swing.JLabel jLabelIconoHome;
    private javax.swing.JLabel jLabelIconoSalir;
    private javax.swing.JLabel jLabelInstitutoTitulo;
    private javax.swing.JLabel jLabelTransferir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaBusquedaC;
    private javax.swing.JTextArea jTextAreaBusquedaI;
    private javax.swing.JTextArea jTextAreaBusquedaR;
    private javax.swing.JTextArea jTextAreaInstitutosA;
    private javax.swing.JTextField jTextFieldBusquedaCA;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlBusquedaC;
    private javax.swing.JPanel pnlBusquedaI;
    private javax.swing.JLayeredPane pnlCentral;
    private javax.swing.JLayeredPane pnlCentralBusqueda;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlLateral_espacio;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSuperior;
    // End of variables declaration//GEN-END:variables
}
