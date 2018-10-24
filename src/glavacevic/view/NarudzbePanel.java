/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

//import glavacevic.controller.ObradaKupac;
import com.github.lgooddatepicker.components.CalendarPanel;
import com.github.lgooddatepicker.components.DatePicker;
import glavacevic.controller.ObradaKupac;
import glavacevic.controller.ObradaLoger;
import glavacevic.model.LoggerMe;
import glavacevic.model.Narudzba;
import glavacevic.model.Orders;
//import glavacevic.model.OrdersItems;
import glavacevic.model.NarudzbaStavke;
import glavacevic.model.Products;
import glavacevic.pomocno.EdunovaException;
//import glavacevic.model.Orders;
import glavacevic.pomocno.HibernateUtil;
import java.awt.Dimension;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MacaZekoMiš
 */
public class NarudzbePanel extends javax.swing.JPanel {
   
    
        private LoggerMe LoggerMe;
         private ObradaLoger o;
    public NarudzbePanel() {
//
        initComponents();
          popuniTablicu();
        o = new ObradaLoger();
   
        
    
      
    }

         void popuniTablicu(){
        NarudzbaStavke d = new NarudzbaStavke();
             DefaultTableModel m = (DefaultTableModel)tblSadrzaj1.getModel();
            
           List<Narudzba> lista =  HibernateUtil.getSession().createQuery(
                "from Narudzba ").list();
           
          
         m.setRowCount(0);
         Object niz[]=new Object[5];
      
        for (Narudzba s : lista) {
           
           niz[0]= s.getNarudzbaSifra();
           niz[1]= s.getNarudzbaNaziv();
           niz[2]= s.getNarudzbaEmail();              
           m.addRow(niz);
           m.setValueAt(s, m.getRowCount()-1, 1);

        }
        
             

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblSadrzaj1 = new javax.swing.JTable();
        btnIspisiUgovor = new javax.swing.JButton();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane3.setOpaque(false);

        tblSadrzaj1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Šifra", "Kupac", "Email", "Datum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSadrzaj1.setGridColor(new java.awt.Color(255, 255, 255));
        tblSadrzaj1.setRowHeight(23);
        jScrollPane3.setViewportView(tblSadrzaj1);

        btnIspisiUgovor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/word-2-24.png"))); // NOI18N
        btnIspisiUgovor.setText("Ispiši");
        btnIspisiUgovor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIspisiUgovorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIspisiUgovor)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnIspisiUgovor)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
      
                 LoggerMe = new LoggerMe();
            try {
//                LoggerMe.setUtilTime(LocalTime.now());
            o.dodaj(LoggerMe);
           
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
             popuniTablicu();
    }//GEN-LAST:event_formAncestorAdded

    private void btnIspisiUgovorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIspisiUgovorActionPerformed
      
    }//GEN-LAST:event_btnIspisiUgovorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIspisiUgovor;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblSadrzaj1;
    // End of variables declaration//GEN-END:variables
}
