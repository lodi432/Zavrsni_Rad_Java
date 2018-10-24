/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import glavacevic.controller.ObradaKupac;
import glavacevic.controller.ObradaProjekt;
import glavacevic.model.Narudzba;
import glavacevic.model.Projekt;
import glavacevic.model.VoziloD;
import glavacevic.model.Orders;

import glavacevic.pomocno.HibernateUtil;
import java.awt.Component;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import jcMousePanel.jcMousePanel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MacaZekoMiš
 */


public class PanelData extends jcMousePanel {
private jcMousePanel OHM ;
   final private DecimalFormat df;
    
    /**
     * Creates new form PanelData
     */
   
  
       private ObradaProjekt o;
 private Projekt projekt;
  private ObradaKupac k;
      private glavacevic.model.Orders orders;
      public PanelData() {
      this.setModo(6);
      this.setVisibleLogo(false);
      initComponents();
      o = new ObradaProjekt();
      reloadButton.setFocusPainted(false);
      exportButton.setFocusPainted(false);
      ImportButton.setFocusPainted(false);
        ImportButton.setVisible(false);
    
          NumberFormat nf = NumberFormat.getNumberInstance(new Locale("hr", "HR"));
        df = (DecimalFormat) nf;
        df.applyPattern("###,##0.00");
      
        DefaultTableModel m = (DefaultTableModel)tblSadrzaj1.getModel();
           List<Projekt> lista = HibernateUtil.getSession().createQuery(
                "from Projekt ").list();
         Object niz[]=new Object[5];
        for (Projekt s : lista) {
           niz[0]= s.getSifra();
           niz[1]= s.getNaziv();
           niz[2]= s.getTrajanje();
           niz[3]= s.getCijena();
//         niz[4]= s.getUpisnina();
           m.addRow(niz);          
           
           m.setValueAt(s, m.getRowCount()-1, 1);
           
        }
         tblSadrzaj1.setAutoCreateRowSorter(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSadrzaj1 = new javax.swing.JTable();
        reloadButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        ImportButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tablica");

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblSadrzaj1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Šifra", "Naziv", "Trajanje", "Cijena"
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

        reloadButton.setBackground(new java.awt.Color(0, 153, 255));
        reloadButton.setForeground(new java.awt.Color(255, 255, 255));
        reloadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh-2-24.png"))); // NOI18N
        reloadButton.setText("Baza");
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });

        exportButton.setBackground(new java.awt.Color(0, 153, 255));
        exportButton.setForeground(new java.awt.Color(255, 255, 255));
        exportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Export_27px_1.png"))); // NOI18N
        exportButton.setText("Spremi");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        ImportButton.setBackground(new java.awt.Color(0, 153, 255));
        ImportButton.setForeground(new java.awt.Color(255, 255, 255));
        ImportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Import_27px.png"))); // NOI18N
        ImportButton.setText("Učitaj tablicu");
        ImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Car_24px.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Sell_26px.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_More_16px.png"))); // NOI18N
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reloadButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ImportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(exportButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportButton)
                    .addComponent(ImportButton))
                .addGap(21, 21, 21)
                .addComponent(reloadButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
  
    
      popuniTablicu2();
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
       popuniTablicu2();
    }//GEN-LAST:event_formAncestorAdded

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed

        String filePath = "C:\\Users\\MacaZekoMiš\\Desktop\\export.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < tblSadrzaj1.getRowCount(); i++){//redovi
                for(int j = 0; j<tblSadrzaj1.getColumnCount(); j++){//stupci
                    bw.write(tblSadrzaj1.getValueAt(i, j).toString()+"//");

                }
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(PanelData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_exportButtonActionPerformed

    private void ImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportButtonActionPerformed
       
        String filePath = "C:\\Users\\MacaZekoMiš\\Desktop\\export.txt";
       File file = new File(filePath);
try {
     FileReader fr = new FileReader(file);
     BufferedReader br = new BufferedReader(fr);
     DefaultTableModel model = (DefaultTableModel)tblSadrzaj1.getModel();
     
model.setRowCount(0);
     Object[] lines = br.lines().toArray();
     for (int i = 0;i < lines.length; i++){
         String[] row = lines[i].toString().split("//");
         model.addRow(row);
     }
}catch (Exception ex) {
            Logger.getLogger(PanelData.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_ImportButtonActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
      
        popuniTablicu3();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
       
        popuniTablicu4();
         
    }//GEN-LAST:event_jLabel3MousePressed

  
  void popuniTablicu2(){
//     
         o=new ObradaProjekt();
             DefaultTableModel m = (DefaultTableModel)tblSadrzaj1.getModel();
           List<Projekt> lista = HibernateUtil.getSession().createQuery(
                "from Projekt").list();
         m.setRowCount(0);
         Object niz[]=new Object[5];
        
        for (Projekt s : lista) {
           niz[0]= s.getSifra();
           niz[1]= s.getNaziv();
           niz[2]= s.getTrajanje();
           niz[3]= s.getCijena();
        
           m.addRow(niz);
           m.setValueAt(s, m.getRowCount()-1, 1);

        }
         tblSadrzaj1.getColumnModel().getColumn(2).setHeaderValue("Trajanje");
         tblSadrzaj1.getTableHeader().repaint();
    }
  
  void popuniTablicu3(){
        DefaultTableModel m = (DefaultTableModel)tblSadrzaj1.getModel();
           List<VoziloD> lista = HibernateUtil.getSession().createQuery(
                "from VoziloD").list();
           m.setRowCount(0);
           Object niz[]=new Object[4];
           for (VoziloD s : lista) {
           niz[0]= s.getSifra();
           niz[1]= s.getNazivdjela();
           niz[2]= s.getProizvodacdobavljac();
           niz[3]= s.getCijena();
           m.addRow(niz);          
           
//           m.setValueAt(s, m.getRowCount()-1, 1);
           
        }
//         tblSadrzaj1.setAutoCreateRowSorter(true);
        tblSadrzaj1.getColumnModel().getColumn(2).setHeaderValue("Dobavljač");
         tblSadrzaj1.getTableHeader().repaint();
  }
  
  void popuniTablicu4(){
            
        DefaultTableModel m = (DefaultTableModel)tblSadrzaj1.getModel();
             List<Narudzba> lista =  HibernateUtil.getSession().createQuery(
                "from Narudzba ").list();
           
          
         m.setRowCount(0);
         Object niz[]=new Object[5];
      
        for (Narudzba s : lista) {
           
           niz[0]= s.getNarudzbaSifra();
           niz[1]= s.getNarudzbaNaziv();
           niz[2]= s.getNarudzbaEmail();
           
//         niz[3]= d.getQuantity();
              
           m.addRow(niz);
           m.setValueAt(s, m.getRowCount()-1, 1);
             
        }
      tblSadrzaj1.getColumnModel().getColumn(2).setHeaderValue("Email");
      tblSadrzaj1.getColumnModel().getColumn(3).setHeaderValue("");
      tblSadrzaj1.getTableHeader().repaint();
  }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImportButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton reloadButton;
    private javax.swing.JTable tblSadrzaj1;
    // End of variables declaration//GEN-END:variables
}
