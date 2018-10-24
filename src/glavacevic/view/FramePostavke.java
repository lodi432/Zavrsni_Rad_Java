/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import glavacevic.postavke.PostaviIzgled;
import glavacevic.postavke.Postavke;
import glavacevic.model.Operater;
import AppPackage.AnimationClass;
import glavacevic.controller.ObradaSistem;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.TimerTask;
import javafx.scene.layout.Border;
import static javafx.scene.paint.Color.color;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import keeptoo.KGradientPanel;
import sun.awt.resources.awt;
import javafx.util.Duration;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import keeptoo.Drag;

/**
 *
 * @author MacaZekoMiš
 */
public class FramePostavke extends javax.swing.JFrame {

    Postavke P;
    private JPanel pnlBash;
    private Operater operater;
    private JPanel pnlPocetna;
    private JPanel pnlProjekti;
    private JPanel pnlPostavke;
    private JPanel pnlPolaznici;
    private JPanel pnlGrupe;
    private JPanel pnlOperateri;
    private JPanel pnlData;
    private JPanel pnlVrijemeApi;
    private JPanel pnlPadajuci;
    private JPanel pnlStatistike;
    private JPanel pnlAnimator;
    private JPanel OP;
    String putanja = System.getProperty("user.dir");
    int xMouseInDesTopBack;
    int yMouseInDeskTopBack;
    int xMouse;
    int yMouse;
    int x2;
    int y2;
    Boolean Prezentacija = true;
     private ObradaSistem obrada;
    final static String newline = "\n";
//Color navigacija2 = Gradient1x.getBackground();

    //goresmo
    public FramePostavke(Operater operater) throws IOException {
        initComponents();
         this.operater = operater;
        setTitle("Edunova APP " + operater.getIme() + " " + operater.getPrezime());
        Mici2.setVisible(false);
        pnlBash = new BashPanel();
        jToggleButton1.setOpaque(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setBorderPainted(false);
        pnlPocetna = new IzbornikPanel();
        pnlProjekti = new ProjektiPanel();
        OP = new IzbornikPanelOP();
        pnlPostavke = new PostavkePanel();
        pnlData = new PanelData();
        pnlVrijemeApi = new VrijemePanel();
         obrada = new ObradaSistem();
        pnlStatistike = new StatistikePanel();
        pnlAnimator = new PocetniPanel();
        pnlSadrzaj.setVisible(false);
        VHATNOT.setVisible(false);
        pocetakRada = new Date();
        definirajTimer();
        definirajTray();
        P = new Postavke();
        PostaviIzgled cf = new PostaviIzgled();
        cf.PostaviIzgled();
        postaviPanel(mouseLogo);
        platform.setText(obrada.getPlatformName());
        repaint();
        revalidate();
        
      
         
    }

    AnimationClass AC = new AnimationClass();
    AnimationClass sat = new AnimationClass();
    private Date pocetakRada;
    static Image image = Toolkit.getDefaultToolkit().getImage("/images/ucitanje.gif");
    static TrayIcon trayIcon = new TrayIcon(image, "RadRed");

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        MotherBoard = new keeptoo.KGradientPanel();
        lblVrijeme = new javax.swing.JLabel();
        skriveni_Panel = new javax.swing.JPanel();
        navigacijski_Panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pnlSadrzaj = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        lbl_pomracina = new javax.swing.JLabel();
        VHATNOT = new keeptoo.KGradientPanel();
        Mici2 = new javax.swing.JPanel();
        lbl_dot = new javax.swing.JLabel();
        okrug = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlSadrzaj2 = new keeptoo.KGradientPanel();
        mouseLogo = new jcMousePanel.jcMousePanel();
        platform = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jPanel11 = new javax.swing.JPanel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlDole = new keeptoo.KGradientPanel();
        pnl_sat = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_sat = new javax.swing.JLabel();
        lbl_sounder = new javax.swing.JLabel();
        sound1 = new javax.swing.JLabel();

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");
        jMenuBar1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        MotherBoard.setBackground(new java.awt.Color(255, 255, 255));
        MotherBoard.setOpaque(false);
        MotherBoard.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MotherBoardMouseDragged(evt);
            }
        });
        MotherBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MotherBoardMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MotherBoardMousePressed(evt);
            }
        });
        MotherBoard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MotherBoardKeyPressed(evt);
            }
        });
        MotherBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVrijeme.setFont(new java.awt.Font("DS-Digital", 1, 14)); // NOI18N
        lblVrijeme.setForeground(new java.awt.Color(255, 255, 255));
        lblVrijeme.setAlignmentX(4.0F);
        MotherBoard.add(lblVrijeme, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 180, 30));

        skriveni_Panel.setOpaque(false);
        skriveni_Panel.setLayout(null);
        MotherBoard.add(skriveni_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 184, 100));

        navigacijski_Panel.setOpaque(false);

        jPanel2.setOpaque(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Grid_24px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel5.setOpaque(false);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-list-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(35, 35, 35))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel6.setOpaque(false);
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings-4-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setOpaque(false);
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Partly_Cloudy_Day_24px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setOpaque(false);
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Combo_Chart_24px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jPanel12.setOpaque(false);
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel12MousePressed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Minimize_Window_24px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        javax.swing.GroupLayout navigacijski_PanelLayout = new javax.swing.GroupLayout(navigacijski_Panel);
        navigacijski_Panel.setLayout(navigacijski_PanelLayout);
        navigacijski_PanelLayout.setHorizontalGroup(
            navigacijski_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigacijski_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navigacijski_PanelLayout.setVerticalGroup(
            navigacijski_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigacijski_PanelLayout.createSequentialGroup()
                .addGroup(navigacijski_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navigacijski_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(navigacijski_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MotherBoard.add(navigacijski_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, 60));

        pnlSadrzaj.setBackground(new java.awt.Color(255, 255, 255));
        pnlSadrzaj.setkEndColor(new java.awt.Color(0, 0, 0));
        pnlSadrzaj.setkStartColor(new java.awt.Color(51, 0, 102));
        pnlSadrzaj.setOpaque(false);
        pnlSadrzaj.setPreferredSize(new java.awt.Dimension(881, 410));
        pnlSadrzaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSadrzajMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSadrzajMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-213-24.png"))); // NOI18N
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbl_pomracina.setBackground(new java.awt.Color(0, 0, 0));
        lbl_pomracina.setOpaque(true);

        javax.swing.GroupLayout pnlSadrzajLayout = new javax.swing.GroupLayout(pnlSadrzaj);
        pnlSadrzaj.setLayout(pnlSadrzajLayout);
        pnlSadrzajLayout.setHorizontalGroup(
            pnlSadrzajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSadrzajLayout.createSequentialGroup()
                .addGap(861, 861, 861)
                .addComponent(jLabel9))
            .addGroup(pnlSadrzajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSadrzajLayout.createSequentialGroup()
                    .addGap(385, 385, 385)
                    .addComponent(lbl_pomracina, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(290, Short.MAX_VALUE)))
        );
        pnlSadrzajLayout.setVerticalGroup(
            pnlSadrzajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSadrzajLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlSadrzajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSadrzajLayout.createSequentialGroup()
                    .addGap(416, 416, 416)
                    .addComponent(lbl_pomracina, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        MotherBoard.add(pnlSadrzaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 106, 34, 37));

        VHATNOT.setBackground(new java.awt.Color(51, 51, 255));
        VHATNOT.setkEndColor(new java.awt.Color(255, 255, 255));
        VHATNOT.setkGradientFocus(10);
        VHATNOT.setkStartColor(new java.awt.Color(255, 255, 255));
        VHATNOT.setMaximumSize(null);
        VHATNOT.setOpaque(false);
        VHATNOT.setLayout(null);
        MotherBoard.add(VHATNOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 81, 131));

        Mici2.setBackground(new java.awt.Color(255, 255, 255));
        Mici2.setOpaque(false);
        Mici2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Mici2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Mici2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Mici2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Mici2MouseReleased(evt);
            }
        });
        Mici2.setLayout(null);

        lbl_dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dot.png"))); // NOI18N
        Mici2.add(lbl_dot);
        lbl_dot.setBounds(2, 10, 11, 10);

        okrug.setBackground(new java.awt.Color(255, 255, 255));
        okrug.setForeground(new java.awt.Color(51, 51, 0));
        okrug.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withoutdot.png"))); // NOI18N
        Mici2.add(okrug);
        okrug.setBounds(2, 0, 30, 30);

        MotherBoard.add(Mici2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, 29, 28));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText(" X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        MotherBoard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 33, 40));

        jPanel7.setOpaque(false);
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-213-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap())
        );

        MotherBoard.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 54, 50, -1));

        pnlSadrzaj2.setBackground(new java.awt.Color(255, 255, 0));
        pnlSadrzaj2.setOpaque(false);

        mouseLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/java-minimalism-wide.jpg"))); // NOI18N
        mouseLogo.setModo(6);
        mouseLogo.setVisibleLogo(false);

        platform.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        platform.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mouseLogoLayout = new javax.swing.GroupLayout(mouseLogo);
        mouseLogo.setLayout(mouseLogoLayout);
        mouseLogoLayout.setHorizontalGroup(
            mouseLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mouseLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(platform, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(668, Short.MAX_VALUE))
        );
        mouseLogoLayout.setVerticalGroup(
            mouseLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mouseLogoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(platform, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSadrzaj2Layout = new javax.swing.GroupLayout(pnlSadrzaj2);
        pnlSadrzaj2.setLayout(pnlSadrzaj2Layout);
        pnlSadrzaj2Layout.setHorizontalGroup(
            pnlSadrzaj2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mouseLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        pnlSadrzaj2Layout.setVerticalGroup(
            pnlSadrzaj2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSadrzaj2Layout.createSequentialGroup()
                .addComponent(mouseLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MotherBoard.add(pnlSadrzaj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 850, 360));

        jToggleButton1.setBackground(new java.awt.Color(0, 102, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Minimize_Window_24px.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton1ItemStateChanged(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        MotherBoard.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 140, -1, 28));

        jPanel9.setOpaque(false);
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Cloud_24px_1.png"))); // NOI18N

        jXLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel1.setText("Inclouder");
        jXLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        MotherBoard.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 310, -1, -1));

        jPanel11.setOpaque(false);
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });

        jXLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel2.setText("Files");
        jXLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Folder_24px.png"))); // NOI18N
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MotherBoard.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, -1, 40));

        pnlDole.setkEndColor(new java.awt.Color(0, 0, 0));
        pnlDole.setkStartColor(new java.awt.Color(0, 255, 255));
        pnlDole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDoleMouseExited(evt);
            }
        });
        pnlDole.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_sat.setBackground(new java.awt.Color(255, 255, 255));
        pnl_sat.setOpaque(false);
        pnl_sat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnl_satMouseReleased(evt);
            }
        });
        pnl_sat.setLayout(null);
        pnlDole.add(pnl_sat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 29, 28));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });
        jPanel3.setLayout(null);

        lbl_sat.setBackground(new java.awt.Color(255, 255, 255));
        lbl_sat.setForeground(new java.awt.Color(51, 51, 0));
        lbl_sat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alarm-clock-2-24.png"))); // NOI18N
        jPanel3.add(lbl_sat);
        lbl_sat.setBounds(10, 10, 30, 24);

        pnlDole.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 40, 40));

        lbl_sounder.setBackground(new java.awt.Color(0, 0, 0));
        lbl_sounder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_sounder.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sounder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sounder.setText("DG APP");
        lbl_sounder.setToolTipText("");
        lbl_sounder.setOpaque(true);
        pnlDole.add(lbl_sounder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        sound1.setBackground(new java.awt.Color(255, 255, 255));
        sound1.setForeground(new java.awt.Color(51, 51, 0));
        sound1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/audio-add-24.png"))); // NOI18N
        pnlDole.add(sound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MotherBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
            .addComponent(pnlDole, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MotherBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDole, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Boolean hidden = false;
    double location = 0;
    String pozicija = "";

    private void Mici2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mici2MouseReleased

        AC.jLabelXRight(2, 8, 10, 1, lbl_dot);

        AC.jLabelXLeft(8, 2, 10, 1, lbl_dot);

        Point gtz = lbl_dot.getLocation();

        System.err.println(lbl_dot.getLocation().getX());
        System.err.println(gtz.getLocation().getX());

        location = gtz.getLocation().getX();

        System.err.println("Double is : " + location);
        if (location == 2) {
            String pozicija = "Dvica";
        }
        if (location == 8) {
            String pozicija = "Osmica";
        }
        if (location == 8 && !Entered) {
            System.err.println("DOBILI SMO OSMICU");
            ImageIcon II = new ImageIcon(getClass().getResource("/images/withoutdot.png"));

            okrug.setIcon(II);
        }
        if (!Entered && location == 2) {
            System.err.println("DOBILI SMO DVA");
            ImageIcon III = new ImageIcon(getClass().getResource("/images/withoutdotU.png"));

            okrug.setIcon(III);

        }
//            pnlSadrzaj.setkTransparentControls(true);
//        VHATNOT.setVisible(false);
//                    
//                    ImageIcon II = new ImageIcon(getClass().getResource("/images/withoutdot.png"));
//                    okrug.setIcon(II);
    }//GEN-LAST:event_Mici2MouseReleased
    Boolean Entered = false;
    private void Mici2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mici2MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/images/withoutdotH.png"));
        okrug.setIcon(II);
        Entered = true;
        System.err.println("Evo nas " + Entered);


    }//GEN-LAST:event_Mici2MouseEntered

    private void Mici2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mici2MouseExited
        if (Entered) {

            System.err.println("DOBILI SMO osmicu kada smo izašli");
            ImageIcon II = new ImageIcon(getClass().getResource("/images/withoutdot.png"));
            okrug.setIcon(II);
        }
        if (location == 2) {
            System.err.println("DOBILI SMO dva kada smo izašli");
            ImageIcon IIII = new ImageIcon(getClass().getResource("/images/withoutdotU.png"));

            okrug.setIcon(IIII);

        }

    }//GEN-LAST:event_Mici2MouseExited
    private void Mici2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mici2MousePressed

        if (location != 2) {

            VHATNOT.setVisible(true);
            VHATNOT.setBackground(new Color(0, 0, 0, 80));
            System.err.println("DVICA ko kuča upaljeno je");

            pnlSadrzaj.setSize(1000, 450);
            this.repaint();
            this.revalidate();
        } else {
            System.err.println("OSMICA UGAŠENO JE ");
            VHATNOT.setVisible(false);
//            pnlSadrzaj.setVisible(false);
        }


    }//GEN-LAST:event_Mici2MousePressed

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        setVisible(false);


    }//GEN-LAST:event_formWindowIconified
    String store = "0,153,255";

//    [0,153,255]
    Color Startcolor = new Color(0, 153, 255);
    Color Endcolor = new Color(51, 51, 255);
    int StartcolorInt = Startcolor.getRGB();
    int EndcolorInt = Endcolor.getRGB();

    public void snow() {
        MotherBoard.setkStartColor(new java.awt.Color(153, 102, 255));
        MotherBoard.setkEndColor(new java.awt.Color(51, 255, 204));
    }

    void sea() {
        MotherBoard.setkStartColor(new java.awt.Color(51, 102, 255));
        MotherBoard.setkEndColor(new java.awt.Color(0, 204, 255));

    }

    void dark() {

        MotherBoard.setkStartColor(new java.awt.Color(0, 0, 0));
        MotherBoard.setkEndColor(new java.awt.Color(0, 18, 51));

    }

    void mainTheme() {
        MotherBoard.setkStartColor(new java.awt.Color(255, 0, 255));
        MotherBoard.setkEndColor(new java.awt.Color(0, 0, 255));
    }
    private void MotherBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotherBoardMouseClicked
        javax.swing.border.Border emptyB = BorderFactory.createEmptyBorder();
        jLabel2.setBorder(emptyB);
    }//GEN-LAST:event_MotherBoardMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        xMouseInDesTopBack = evt.getX();
        yMouseInDeskTopBack = evt.getY();
     }//GEN-LAST:event_formMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);



    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        postaviPanel(pnlData);
      
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        postaviPanel(pnlPostavke);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        postaviPanel(pnlProjekti);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        postaviPanel(pnlVrijemeApi);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void MotherBoardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotherBoardMousePressed
        new Drag(MotherBoard).onPress(evt);
    }//GEN-LAST:event_MotherBoardMousePressed

    private void MotherBoardMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotherBoardMouseDragged
        new Drag(MotherBoard).moveWindow(evt);
    }//GEN-LAST:event_MotherBoardMouseDragged

    private void pnlDoleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDoleMouseExited
        pnlDole.setBorder(javax.swing.BorderFactory.createEmptyBorder());

    }//GEN-LAST:event_pnlDoleMouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        javax.swing.border.Border grayBorder = BorderFactory.createLineBorder(Color.GRAY, 2, true);
        jLabel2.setBorder(grayBorder);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        jLabel2.setLocation((x - x2) - (xMouse), y);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        sat.jLabelYUp(142, 110, 10, 1, lbl_pomracina);
        sat.jLabelYDown(110, 142, 10, 1, lbl_pomracina);

        sat.jLabelYUp(142, 110, 10, 1, lbl_sounder);
        sat.jLabelYDown(110, 142, 10, 1, lbl_sounder);
    }//GEN-LAST:event_jPanel3MouseReleased

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void pnl_satMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_satMouseReleased

        sat.jLabelYUp(520,600, 10, 1, lblVrijeme);
        sat.jLabelYDown(600, 520, 10, 1, lblVrijeme);

    }//GEN-LAST:event_pnl_satMouseReleased

    private void jToggleButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton1ItemStateChanged

        if (jToggleButton1.isSelected()) {
            System.out.println("button is selected");
            pnlSadrzaj2.setVisible(false);
//            menuMPN.setVisible(false);
            jToggleButton1.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Full_Screen_24px.png")));

        } else {
            System.out.println("button is not selected");
            pnlSadrzaj2.setVisible(true);
            jToggleButton1.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Minimize_Window_24px.png")));
        }

    }//GEN-LAST:event_jToggleButton1ItemStateChanged

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        new IncloudersFrame().setVisible(true);
    }//GEN-LAST:event_jPanel9MousePressed

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MousePressed

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        postaviPanel(pnlStatistike);
//        postaviPanel(OP);

    }//GEN-LAST:event_jPanel10MousePressed

    private void pnlSadrzajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSadrzajMouseEntered
     
     
    
    }//GEN-LAST:event_pnlSadrzajMouseEntered

    private void pnlSadrzajMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSadrzajMouseExited
   
  
    }//GEN-LAST:event_pnlSadrzajMouseExited

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
       
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        
            new sysFrame().setVisible(true);

    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
     postaviPanel(mouseLogo);

     
    }//GEN-LAST:event_jPanel2MousePressed

    private void MotherBoardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MotherBoardKeyPressed
      
    }//GEN-LAST:event_MotherBoardKeyPressed

    private void jPanel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MousePressed
       postaviPanel(pnlBash);
    }//GEN-LAST:event_jPanel12MousePressed

    private void postaviPanel(JPanel panel) {
        pnlSadrzaj2.removeAll();
        pnlSadrzaj2.add(panel);
        panel.setSize(pnlSadrzaj2.getSize());
        pnlSadrzaj2.revalidate();
        pnlSadrzaj2.repaint();

    }

    private void definirajTimer() {
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                long diffInSeconds = (new Date().getTime() - pocetakRada.getTime()) / 1000;

                long diff[] = new long[]{0, 0, 0, 0};
                /* sec */
                diff[3] = (diffInSeconds >= 60 ? diffInSeconds % 60 : diffInSeconds);
                /* min */
                diff[2] = (diffInSeconds = (diffInSeconds / 60)) >= 60 ? diffInSeconds % 60 : diffInSeconds;
                /* hours */
                diff[1] = (diffInSeconds = (diffInSeconds / 60)) >= 24 ? diffInSeconds % 24 : diffInSeconds;
                /* days */
                diff[0] = (diffInSeconds = (diffInSeconds / 24));

                lblVrijeme.setText(String.format(
                        "%s%d:%s%d:%s%d",
                        diff[1] < 10 ? "0" : "",
                        diff[1],
                        diff[2] < 10 ? "0" : "",
                        diff[2],
                        diff[3] < 10 ? "0" : "",
                        diff[3]));
            }
        }, 0, 1000);
    }

    private void definirajTray() {

//        setType(Type.UTILITY);
//        setVisible(false);
//       setExtendedState(JFrame.); 
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();

            trayIcon.setImageAutoSize(true);
            trayIcon.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(true);
                    setExtendedState(JFrame.NORMAL);

                    //trayIcon.displayMessage("Edunova", "Odradio akciju", 
                    //       TrayIcon.MessageType.INFO);
                }
            });

            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.err.println("TrayIcon could not be added.");
            }
        }
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mici2;
    public static keeptoo.KGradientPanel MotherBoard;
    private keeptoo.KGradientPanel VHATNOT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private javax.swing.JLabel lblVrijeme;
    private javax.swing.JLabel lbl_dot;
    private javax.swing.JLabel lbl_pomracina;
    private javax.swing.JLabel lbl_sat;
    private javax.swing.JLabel lbl_sounder;
    private jcMousePanel.jcMousePanel mouseLogo;
    private javax.swing.JPanel navigacijski_Panel;
    private javax.swing.JLabel okrug;
    private javax.swing.JLabel platform;
    private keeptoo.KGradientPanel pnlDole;
    public static keeptoo.KGradientPanel pnlSadrzaj;
    private keeptoo.KGradientPanel pnlSadrzaj2;
    private javax.swing.JPanel pnl_sat;
    private javax.swing.JPanel skriveni_Panel;
    private javax.swing.JLabel sound1;
    // End of variables declaration//GEN-END:variables

}
