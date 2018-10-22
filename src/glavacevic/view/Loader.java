/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import glavacevic.model.Operater;
import glavacevic.pomocno.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
/**
 *
 * @author MacaZekoMiš
 */
public class Loader extends javax.swing.JFrame {

    /**
     * Creates new form Loader
     */
    public Loader() {
        initComponents();
         new SpojiSeNaBazu().start();
    }
    
    
     private class SpojiSeNaBazu extends Thread {

        public void run() {
            Session s = HibernateUtil.getSession();
           
            List<Operater> lista = s.createQuery("From Operater").list();
            Operater o = lista.isEmpty() ? null : lista.get(0);
            
                if (o!=null && o.getSifra() > 0) {
                    new LoginForma().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(getRootPane(), "Ne postoji operater, "
                            + "zovite proizvođača programa");
                }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loader_backinout.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
