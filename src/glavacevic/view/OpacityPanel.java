/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import java.awt.AlphaComposite;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.RepaintManager;
import org.pushingpixels.trident.Timeline;

/**
 *
 * @author MacaZekoMiš
 */
public class OpacityPanel extends javax.swing.JPanel {
 

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
        


    public OpacityPanel() {
//      JSlider slider = new JSlider(0, 100, 50);
        initComponents();
        setOpaque(false);

        setName("Polaznici");
         setOpacity(0.2f);
       
    }
    
     
    
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
 void razvali(){
    
        fadeInTimeLine = new Timeline(this);
        fadeInTimeLine.addPropertyToInterpolate("Opacity", 0.5f, 1.0f);
        fadeInTimeLine.setDuration(250);
        fadeInTimeLine.play();
        System.out.println(this);
}
 
 
 
    void razvali2(){
    
        fadeInTimeLine = new Timeline(this);
        fadeInTimeLine.addPropertyToInterpolate("Opacity", 1.0f, 0.5f);
        fadeInTimeLine.setDuration(250);
        fadeInTimeLine.play();
        System.out.println(this);
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        barMen = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseExited(evt);
            }
        });

        barMen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/alarm-clock-2-24.png"))); // NOI18N
        barMen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                barMenMouseReleased(evt);
            }
        });

        slider.setValue(25);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });
        slider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sliderMouseEntered(evt);
            }
        });
        slider.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sliderPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(barMen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barMen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/artworks100x100.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
       
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
     
    }//GEN-LAST:event_formMouseExited

    private void kGradientPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseEntered
            razvali();
    }//GEN-LAST:event_kGradientPanel1MouseEntered

    private void kGradientPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseExited
         razvali2();
    }//GEN-LAST:event_kGradientPanel1MouseExited

    private void barMenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMenMouseReleased
        //        razvali();
    }//GEN-LAST:event_barMenMouseReleased

    private void sliderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sliderPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_sliderPropertyChange

    private void sliderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMouseEntered
        //        slider.setBackground(Color.yellow);
    }//GEN-LAST:event_sliderMouseEntered

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
//                setOpacity(slider.getValue() / 100.0f);
    }//GEN-LAST:event_sliderStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barMen;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
}
