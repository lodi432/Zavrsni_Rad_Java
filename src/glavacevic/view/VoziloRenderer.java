/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import glavacevic.model.VoziloD;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Profesor
 */
public class VoziloRenderer extends JLabel implements ListCellRenderer<VoziloD> {
 
    @Override
    public Component getListCellRendererComponent(JList<? extends VoziloD> list, VoziloD VoziloD, int index,
        boolean isSelected, boolean cellHasFocus) {
        
        
        String s = VoziloD.getProizvodacdobavljac()+ "                                                                 ";
        setOpaque(true);
       
        BufferedImage image = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
         char prvoSlovo = VoziloD.getProizvodacdobavljac().toString().charAt(0);
        String what = Character.toString(prvoSlovo);
        
        
        
        g.setColor(Color.WHITE);
//        g.drawString("pero", 10, 20);
       String dioVozila = VoziloD.getNazivdjela();
        g.drawString(dioVozila, 2, 20);
        
//         ImageIcon tab1Icon = new ImageIcon(
//         this.getClass().getResource("/images/" + code +.png"));
        ImageIcon i = new ImageIcon(image);
        setIcon(i);
        setText(s.substring(0,50) + "|" +  VoziloD.getCijena().toString() );
        if(isSelected){
            setBackground(Color.GRAY);
        }else{
            setBackground(list.getBackground());
        }
        
         
        return this;
    }
    
}
