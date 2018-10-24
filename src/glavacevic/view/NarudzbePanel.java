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
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
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
        pnlPodaci.setVisible(false);
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
        pnlPodaci = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCijena = new javax.swing.JLabel();
        txtCijena = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSifra = new javax.swing.JTextField();
        btnDodajNovi = new javax.swing.JButton();

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
        tblSadrzaj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSadrzaj1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSadrzaj1);

        btnIspisiUgovor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Microsoft_Word_24px_3.png"))); // NOI18N
        btnIspisiUgovor.setText("Ispiši");
        btnIspisiUgovor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIspisiUgovorActionPerformed(evt);
            }
        });

        jLabel1.setText("Naziv");

        jLabel2.setText("Trajanje");

        lblCijena.setText("Cijena");

        jLabel4.setText("Sifra");

        btnDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNoviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNaziv)
                    .addComponent(txtEmail)
                    .addComponent(txtCijena)
                    .addComponent(txtSifra)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblCijena)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(btnDodajNovi))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCijena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDodajNovi))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIspisiUgovor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIspisiUgovor)))
                .addContainerGap(38, Short.MAX_VALUE))
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
     

        File file = null;
        WordExtractor extractor = null;
        try {

            file = new File("PredlozakPlacanja.doc");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument doc = new HWPFDocument(fis);

            try {
                Range range = doc.getRange();
                for (int i = 0; i < range.numParagraphs(); i++) {
                    Paragraph paragraph = range.getParagraph(i);
                    if (paragraph.text().contains("<<IMEPREZIME>>")) {
                        paragraph.replaceText("<<IMEPREZIME>>", txtNaziv.getText());

                    }
                    if (paragraph.text().contains("<<OIB>>")) {
                        paragraph.replaceText("<<OIB>>", txtNaziv.getText());

                    }
                    if (paragraph.text().contains("<<EMAIL>>")) {
                        paragraph.replaceText("<<EMAIL>>", txtEmail.getText());

                    }  if (paragraph.text().contains("<<SIFRA>>")) {
                        paragraph.replaceText("<<SIFRA>>", txtSifra.getText());

                    }
                    
                    else{
                        //išla poruka da predložak nije dobar
                    }
                }
                
                
                JFileChooser spremiKao = new JFileChooser();
                 spremiKao.setSelectedFile(new File(System.getProperty("user.home") + File.separator + txtNaziv.getText()+"Ugovor.doc"));
        spremiKao.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Word dokument", "doc");

        spremiKao.setFileFilter(filter);
      
                if(spremiKao.showSaveDialog(getParent())==JFileChooser.APPROVE_OPTION){
                     FileOutputStream out = new FileOutputStream(spremiKao.getSelectedFile());
                doc.write(out);
                out.close();
                
                 Desktop d = Desktop.getDesktop();
                    d.open(spremiKao.getSelectedFile());
                
                }
                
               
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            
            

        } catch (Exception exep) {
            exep.printStackTrace();
        }
    }//GEN-LAST:event_btnIspisiUgovorActionPerformed

    private void btnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNoviActionPerformed

       
    }//GEN-LAST:event_btnDodajNoviActionPerformed

    private void tblSadrzaj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSadrzaj1MouseClicked
      DefaultTableModel m = (DefaultTableModel)tblSadrzaj1.getModel();
         int selectedRowIndex = tblSadrzaj1.getSelectedRow();
           ocistiPolja();
          txtNaziv.setText(m.getValueAt(selectedRowIndex, 1).toString());
          txtEmail.setText(m.getValueAt(selectedRowIndex, 2).toString());
        txtSifra.setText(m.getValueAt(selectedRowIndex, 0).toString());
//        txtUpisnina.setText(m.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_tblSadrzaj1MouseClicked
  private void ocistiPolja() {

        for (Component c : pnlPodaci.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovi;
    private javax.swing.JButton btnIspisiUgovor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCijena;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JTable tblSadrzaj1;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtSifra;
    // End of variables declaration//GEN-END:variables
}
