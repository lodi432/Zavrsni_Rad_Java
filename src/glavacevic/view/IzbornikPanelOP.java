/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.pushingpixels.trident.Timeline;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.RepaintManager;
import javax.swing.SwingUtilities;
import org.pushingpixels.trident.ease.Spline;
/**
 *
 * @author Profesor
 */
public class IzbornikPanelOP extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form IzbornikPanel
     */
//        private JPanel opak;
//
//      private Timeline fadeInTimeLine, fadeOutTimeLine;
//	public final static float DEFAULT_OPACITY = 0.50f;
//            float opacity = 1.0f;

        
    //extends javax.swing.JPanel
    static {
        RepaintManager.setCurrentManager(new RepaintManager() {
            @Override
            public void addDirtyRegion(
                    JComponent c, int x, int y, int w, int h) {
                Component cc = c;
                while (cc != null) {
                    if (cc instanceof OpacityPanel) {
                        OpacityPanel p = (OpacityPanel) cc;
                        super.addDirtyRegion(
                                p, 0, 0, p.getWidth(), p.getHeight());
                    }
                    cc = cc.getParent();
                }
                super.addDirtyRegion(c, x, y, w, h);
            }
        });
    }
    private float opacity = 1.0f;
    private float opacity2 = 1.0f;
    private BufferedImage image;
        
    
    
    
    public IzbornikPanelOP() {
        
//        this.setModo(2);
        initComponents();
        setName("Izbornik");
        
        setOpacity(0.85f);
        mousep.setOpaque(false);
       
        
       
//        opak.setOpaque(false);      
//                setOpacity(opacity);
//        opak = new OpacityPanel();
    }
    
    public Timeline publicTimeLine;
         private Timeline fadeInTimeLine, fadeOutTimeLine;
 
    
    
    public void setOpacity(float opacity) {
        this.opacity = Math.max(0.0f, Math.min(1.0f, opacity));
        repaint();
    }

    private void updateImage() {
        int w = Math.min(1, getWidth());
        int h = Math.min(1, getHeight());
        if (image == null || image.getWidth() != w || image.getHeight() != h) {
            image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        }
        Graphics2D g = image.createGraphics();
        g.setColor(new Color(0, 0, 0, 0));
        g.setComposite(AlphaComposite.SrcOver);
        g.fillRect(0, 0, w, h);
        g.dispose();
    }

    @Override
    protected void paintComponent(Graphics gr) {
        updateImage();
        Graphics2D imageGraphics = image.createGraphics();
        super.paintComponent(imageGraphics);
        imageGraphics.dispose();

        Graphics2D g = (Graphics2D) gr;
        g.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, opacity));
        g.drawImage(image, 0, 0, null);
    }

    
    
    
    public void razvali(keeptoo.KGradientPanel panel){
    
        fadeInTimeLine = new Timeline(this);
        fadeInTimeLine.addPropertyToInterpolate("Opacity", 0.85f, 1.0f);
        fadeInTimeLine.setDuration(400);
        fadeInTimeLine.play();
        System.out.println(this);
}
    
       void razvali2(){
    
        fadeInTimeLine = new Timeline(this);
        fadeInTimeLine.addPropertyToInterpolate("Opacity", 1.0f, 0.85f);
        fadeInTimeLine.setDuration(400);
        fadeInTimeLine.play();
        System.out.println(this);
}
       
       
       void stacemo(){
             fadeInTimeLine = new Timeline(this);
        fadeInTimeLine.addPropertyToInterpolate("Opacity", 0.85f, 1.0f);
        fadeInTimeLine.setDuration(400);
        fadeInTimeLine.play();
        System.out.println(this);
       }
    
    
    
     private boolean withInPanel(JPanel panel) {
        return new Rectangle(panel.getLocationOnScreen(), panel.getSize()).contains(MouseInfo.getPointerInfo().getLocation());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mousep = new jcMousePanel.jcMousePanel();
        lightPanel = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        barMen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mousep.setModo(7);
        mousep.setTransparencia(1.0F);
        mousep.setVisibleLogo(false);

        lightPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lightPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lightPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lightPanelMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-file-24.png"))); // NOI18N
        jLabel1.setText("Dodaj");

        barMen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-list-24.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AdamBeyer.jpg"))); // NOI18N

        javax.swing.GroupLayout lightPanelLayout = new javax.swing.GroupLayout(lightPanel);
        lightPanel.setLayout(lightPanelLayout);
        lightPanelLayout.setHorizontalGroup(
            lightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lightPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lightPanelLayout.createSequentialGroup()
                        .addComponent(barMen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        lightPanelLayout.setVerticalGroup(
            lightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lightPanelLayout.createSequentialGroup()
                .addGroup(lightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lightPanelLayout.createSequentialGroup()
                        .addComponent(barMen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lightPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mousepLayout = new javax.swing.GroupLayout(mousep);
        mousep.setLayout(mousepLayout);
        mousepLayout.setHorizontalGroup(
            mousepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mousepLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(lightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        mousepLayout.setVerticalGroup(
            mousepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mousepLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(mousep, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 580, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wtnja.gif"))); // NOI18N
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 540, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void lightPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lightPanelMouseEntered
             razvali(lightPanel);
//             this.setOpacity(0.2f);
                
    }//GEN-LAST:event_lightPanelMouseEntered

    private void lightPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lightPanelMouseExited
  
      razvali2();
    }//GEN-LAST:event_lightPanelMouseExited

    private void lightPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lightPanelMousePressed
         stacemo();
        
    }//GEN-LAST:event_lightPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barMen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private keeptoo.KGradientPanel lightPanel;
    private jcMousePanel.jcMousePanel mousep;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
