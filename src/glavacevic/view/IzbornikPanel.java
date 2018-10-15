/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import java.awt.AlphaComposite;
import java.io.IOException;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.RepaintManager;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.pushingpixels.trident.Timeline;
import static glavacevic.view.FramePostavke.pnlSadrzaj;



/**
 *
 * @author MacaZekoMiš
 */


public class IzbornikPanel extends jcMousePanel.jcMousePanel {

    /**
     * Creates new form Izbornik
     */    
//   
    
    
    
    
 private float alpha = 0.5f;
private static float transMan =  0.2f;

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
        
    


    public IzbornikPanel()   {
//       IzbornikPanel.this.setModo(2);
//    IzbornikPanel.this.setBackground(new Color(0, 0, 0, 40));
//       IzbornikPanel.this.setIcon(new ImageIcon(getClass().getResource("/images/AdamBeyer.jpg")));
//       IzbornikPanel.this.setVisibleLogo(false);
      
//       IzbornikPanel.this.setTransparencia(transMan);
     
//        IzbornikPanel.this.repaint();
        initComponents();
         setName("Izbornik");
        
 
      
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
        fadeInTimeLine.addPropertyToInterpolate("Opacity", 0.5f, 1.0f);
        fadeInTimeLine.setDuration(400);
        fadeInTimeLine.play();
        System.out.println(this);
}
    
       void razvali2(){
    
        fadeInTimeLine = new Timeline(this);
        fadeInTimeLine.addPropertyToInterpolate("Opacity", 1.0f, 0.5f);
        fadeInTimeLine.setDuration(400);
        fadeInTimeLine.play();
        System.out.println(this);
}
       
       
       void stacemo(){
             fadeInTimeLine = new Timeline(this);
        fadeInTimeLine.addPropertyToInterpolate("Opacity", 0.5f, 1.0f);
        fadeInTimeLine.setDuration(400);
        fadeInTimeLine.play();
        System.out.println(this);
       }
    
    
    
     private boolean withInPanel(JPanel panel) {
        return new Rectangle(panel.getLocationOnScreen(), panel.getSize()).contains(MouseInfo.getPointerInfo().getLocation());
    }
    
    
    
    
    
    
    
    
      
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        h3h3 = new keeptoo.KGradientPanel();

        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        h3h3.setkStartColor(new java.awt.Color(255, 255, 255));
        h3h3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h3h3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout h3h3Layout = new javax.swing.GroupLayout(h3h3);
        h3h3.setLayout(h3h3Layout);
        h3h3Layout.setHorizontalGroup(
            h3h3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        h3h3Layout.setVerticalGroup(
            h3h3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(h3h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(h3h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

 
  
 


    }//GEN-LAST:event_formMouseEntered

     
    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
  
    }//GEN-LAST:event_formMouseExited

    private void h3h3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h3h3MouseEntered
             razvali(h3h3);
    }//GEN-LAST:event_h3h3MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel h3h3;
    // End of variables declaration//GEN-END:variables

}
