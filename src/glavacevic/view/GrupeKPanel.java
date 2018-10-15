/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import com.github.lgooddatepicker.components.CalendarPanel;
import com.github.lgooddatepicker.components.DatePicker;
import glavacevic.controller.ObradaArtist;
import glavacevic.controller.ObradaGrupa;
import glavacevic.controller.ObradaProizvodac;
import glavacevic.controller.ObradaProjekt;
import glavacevic.model.Artist;
import glavacevic.model.Grupa;
import glavacevic.model.Proizvodac;
import glavacevic.model.Projekt;
import glavacevic.pomocno.EdunovaException;
import java.awt.Component;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MacaZekoMiš
 */
public class GrupeKPanel extends javax.swing.JPanel {

       private Grupa entitet;
        private ObradaGrupa obrada;
         private DatePicker datePicker;
         private CalendarPanel calendarPanel;
          private List<Artist> artistiUBazi;
    
    public GrupeKPanel() {
        initComponents();
         tblEntiteti.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          setName("Grupe");
        obrada = new ObradaGrupa();
         definirajDogadajNaTablici();
        ucitajSmjerovePredavacePolaznike();
        ucitaj();
        datePicker = new DatePicker();
        datePicker.setLocale(new Locale("hr"));
        datePicker.setDateToToday();
         calendarPanel = new CalendarPanel(datePicker);
          Dimension d = calendarPanel.getPreferredSize();
        pnlKalendar.setSize(d);
        calendarPanel.setSize(pnlKalendar.getSize());
        pnlKalendar.add(calendarPanel);
          // System.out.println(datePicker.getDate());
       lstPolazniciNaGrupi.setModel(new DefaultListModel<>());
       tblEntiteti.setAutoCreateRowSorter(true);
       
    }
    
    
      private void ucitaj() {
         
        List<Grupa> lista = obrada.getEntiteti(txtUvjet.getText());

        //sortirati po prezimenu
        Collections.sort(lista, new Comparator<Grupa>() {
            public int compare(Grupa o1, Grupa o2) {
                return o1.getNaziv().compareTo(o2.getNaziv());
            }
        });

        
       // tblEntiteti.removeAll();
        
         DefaultTableModel m = (DefaultTableModel) tblEntiteti.getModel();
        
       m.setRowCount(0);
        
        lista.forEach((s) -> {
              Object[] niz = {s.getNaziv(), s.getProjekt().getNaziv()};
            m.addRow(niz);
            m.setValueAt(s, m.getRowCount()-1, 0);
        });
       // lstEntiteti.setModel(m);
        ocistiPolja();
      //  if(m.getSize()>0){
          //  lstEntiteti.setSelectedIndex(0);
       // }
       
       if(oznacenaSifra>0){
           Grupa trenutnaGrupa ;
           for(int i=0;i<tblEntiteti.getModel().getRowCount();i++){
               trenutnaGrupa =(Grupa)tblEntiteti.getModel().getValueAt(i, 0);
               if(oznacenaSifra==trenutnaGrupa.getSifra()){
                   tblEntiteti.setRowSelectionInterval(i, i);
                   break;
               }
           }
                
            }
       

    }
      
           private void ocistiPolja() {
  for (Component c : pnlPodaci.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEntiteti = new javax.swing.JTable();
        pnlPodaci = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbSmjerovi = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbPredavaci = new javax.swing.JComboBox<>();
        pnlKalendar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPolazniciUBazi = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPolazniciNaGrupi = new javax.swing.JList<>();
        txtUvjetPolaznik = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        reloadButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPromjena = new javax.swing.JLabel();
        lblObrisi = new javax.swing.JLabel();
        lblNovi = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(238, 238, 238));
        kGradientPanel1.setkStartColor(new java.awt.Color(238, 238, 238));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Uvjet"));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        tblEntiteti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Naziv Grupe", "Projekt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEntiteti);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnTrazi))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrazi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlPodaci.setBorder(javax.swing.BorderFactory.createTitledBorder("Podaci"));
        pnlPodaci.setForeground(new java.awt.Color(255, 255, 255));
        pnlPodaci.setOpaque(false);

        jLabel3.setText("Naziv nove grupe:");

        jLabel4.setText("Projekt");

        jLabel5.setText("Postavi Managera");

        cmbPredavaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPredavaciActionPerformed(evt);
            }
        });

        pnlKalendar.setPreferredSize(new java.awt.Dimension(350, 180));

        javax.swing.GroupLayout pnlKalendarLayout = new javax.swing.GroupLayout(pnlKalendar);
        pnlKalendar.setLayout(pnlKalendarLayout);
        pnlKalendarLayout.setHorizontalGroup(
            pnlKalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlKalendarLayout.setVerticalGroup(
            pnlKalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        lstPolazniciUBazi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstPolazniciUBazi);

        lstPolazniciNaGrupi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstPolazniciNaGrupi);

        txtUvjetPolaznik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetPolaznikKeyReleased(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Search_24px.png"))); // NOI18N

        reloadButton2.setBackground(new java.awt.Color(0, 255, 255));
        reloadButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh-2-24.png"))); // NOI18N
        reloadButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_User_Group_48px.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-88-24LLL.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-88-24.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        lblPromjena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPromjena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Change_24px.png"))); // NOI18N
        lblPromjena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblPromjenaMousePressed(evt);
            }
        });

        lblObrisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_Bin_24px.png"))); // NOI18N
        lblObrisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblObrisiMousePressed(evt);
            }
        });

        lblNovi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-file-24.png"))); // NOI18N
        lblNovi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNoviMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addComponent(reloadButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNaziv)
                                .addComponent(cmbPredavaci, 0, 100, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPodaciLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cmbSmjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPodaciLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblNovi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pnlKalendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(txtUvjetPolaznik, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUvjetPolaznik, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPodaciLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reloadButton2)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSmjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPodaciLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNovi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPodaciLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPredavaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(pnlKalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == 10) {
            ucitaj();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitaj();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtUvjetPolaznikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetPolaznikKeyReleased

        DefaultListModel<Artist> m2 = new DefaultListModel<>();

        artistiUBazi.forEach((s)->{
            if(s.getPrezimeIme().toLowerCase().contains(txtUvjetPolaznik.getText().toLowerCase())){
                m2.addElement(s);
            }
        });
        lstPolazniciUBazi.setModel(m2);

    }//GEN-LAST:event_txtUvjetPolaznikKeyReleased
    private boolean popuniSvojstva() {
        entitet.setNaziv(txtNaziv.getText());
        entitet.setProjekt((Projekt)cmbSmjerovi.getSelectedItem());
        entitet.setProizvodac((Proizvodac)cmbPredavaci.getSelectedItem());
      
        Date d = Date.from(datePicker.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
        entitet.setDatumPocetka(d);
          List<Artist> artisti = new ArrayList<>();
          DefaultListModel<Artist> m = (DefaultListModel<Artist>)lstPolazniciNaGrupi.getModel();
          for(int i=0;i<m.getSize();i++){
              artisti.add(m.getElementAt(i));
          }
          entitet.setPolaznici(artisti);
        return true;
    }private int oznacenaSifra;

    private void reloadButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButton2ActionPerformed
           ucitajSmjerovePredavacePolaznike();
        ucitaj();
    }//GEN-LAST:event_reloadButton2ActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        if( lstPolazniciUBazi.getSelectedValue()==null){
            return;
        }

        Artist p = lstPolazniciUBazi.getSelectedValue();
        if (!((DefaultListModel<Artist>) lstPolazniciNaGrupi.getModel()).contains(p)){
            ((DefaultListModel<Artist>)lstPolazniciNaGrupi.getModel()).addElement(p);
            lstPolazniciNaGrupi.repaint();
            lstPolazniciNaGrupi.revalidate();
        }
        
         if (entitet == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi projekt");
            return;
        }

        if (!popuniSvojstva()) {
            return;
        }

        try {
            obrada.promjena(entitet);
            oznacenaSifra= entitet.getSifra();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
       if (lstPolazniciNaGrupi.getSelectedValue()==null){
            return;
        }

            DefaultListModel<Artist> m2 = (DefaultListModel<Artist>)lstPolazniciNaGrupi.getModel();

        m2.removeElement(lstPolazniciNaGrupi.getSelectedValue());

        lstPolazniciNaGrupi.repaint();
        lstPolazniciNaGrupi.revalidate();
        
           if (entitet == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi projekt sa liste");
            return;
        }

        if (!popuniSvojstva()) {
            return;
        }

        try {
            obrada.promjena(entitet);
            oznacenaSifra= entitet.getSifra();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_jLabel7MousePressed

    private void cmbPredavaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPredavaciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPredavaciActionPerformed

    private void lblNoviMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoviMousePressed
      
        entitet = new Grupa();

        if (!popuniSvojstva()) {
            return;
        }
        try {
            entitet = obrada.dodaj(entitet);
            oznacenaSifra=entitet.getSifra();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_lblNoviMousePressed

    private void lblObrisiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblObrisiMousePressed
            if (entitet == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi smjer");
            return;
        }

        obrada.obrisi(entitet);
        oznacenaSifra=0;
        ucitaj();
       
    }//GEN-LAST:event_lblObrisiMousePressed

    private void lblPromjenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPromjenaMousePressed
               if (entitet == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi smjer");
            return;
        }

        if (!popuniSvojstva()) {
            return;
        }

        try {
            obrada.promjena(entitet);
            oznacenaSifra= entitet.getSifra();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_lblPromjenaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Proizvodac> cmbPredavaci;
    private javax.swing.JComboBox<Projekt> cmbSmjerovi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblNovi;
    private javax.swing.JLabel lblObrisi;
    private javax.swing.JLabel lblPromjena;
    private javax.swing.JList<Artist> lstPolazniciNaGrupi;
    private javax.swing.JList<Artist> lstPolazniciUBazi;
    private javax.swing.JPanel pnlKalendar;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JButton reloadButton2;
    private javax.swing.JTable tblEntiteti;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtUvjet;
    private javax.swing.JTextField txtUvjetPolaznik;
    // End of variables declaration//GEN-END:variables

 private void definirajDogadajNaTablici() {
       tblEntiteti.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        
           
           
           public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()){
                return;
            }
           
            
            if(tblEntiteti.getSelectedRow()==-1){
                 return;            
            }
           entitet = (Grupa)tblEntiteti.getValueAt(tblEntiteti.getSelectedRow(), 0);
        txtNaziv.setText(entitet.getNaziv());
//        txtCijena.setText(entitet.getProjekt().getCijena().toString() + " kn");
        //ovo radi kada su vrijednost hashcode iste
        cmbSmjerovi.setSelectedItem(entitet.getProjekt());
        cmbPredavaci.setSelectedItem(entitet.getProizvodac());
        
    
        if(entitet.getDatumPocetka()==null){
           datePicker.setDateToToday();
           calendarPanel.setSelectedDate(datePicker.getDate());
        }else{
            LocalDate date = new Date(entitet.getDatumPocetka().getTime()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            calendarPanel.setSelectedDate(date);
            datePicker.setDate(date);
        }
        
        if(entitet.getPolaznici()!=null){
           
        DefaultListModel<Artist> m2 = new DefaultListModel<>();
        entitet.getPolaznici().forEach((s)->{
           // System.out.println( s + " - " + s.hashCode());
            m2.addElement(s);});
        lstPolazniciNaGrupi.setModel(m2);
        }
            
        /*
            ComboBoxModel<Smjer> m = cmbSmjerovi.getModel();
            for(int i=0;i<m.getSize();i++){
                if(m.getElementAt(i).getSifra()==entitet.getSifra()){
                    cmbSmjerovi.setSelectedIndex(i);
                    break;
                }
            }
        */
        
    
        }
    });
    }
 
 
 
 public void ucitajGrupe() {
     ObradaProjekt o = new ObradaProjekt();
        DefaultComboBoxModel<Projekt> m = new DefaultComboBoxModel<>();
        o.getEntiteti().forEach((s)->{
           // System.out.println( s + " - " + s.hashCode());
            m.addElement(s);});
        cmbSmjerovi.setModel(m);
    
}
  public void ucitajSmjerovePredavacePolaznike() {
        
        ObradaProjekt o = new ObradaProjekt();
        DefaultComboBoxModel<Projekt> m = new DefaultComboBoxModel<>();
        o.getEntiteti().forEach((s)->{
           // System.out.println( s + " - " + s.hashCode());
            m.addElement(s);});
        cmbSmjerovi.setModel(m);
        
        ObradaProizvodac op = new ObradaProizvodac();
        DefaultComboBoxModel<Proizvodac> m1 = new DefaultComboBoxModel<>();
        op.getEntiteti().forEach((s)->{
           // System.out.println( s + " - " + s.hashCode());
            m1.addElement(s);});
        cmbPredavaci.setModel(m1);
        
        
        ObradaArtist opo = new ObradaArtist();
        DefaultListModel<Artist> m2 = new DefaultListModel<>();
        artistiUBazi = opo.getEntiteti();
        artistiUBazi.forEach((s)->{
           // System.out.println( s + " - " + s.hashCode());
            m2.addElement(s);});
        lstPolazniciUBazi.setModel(m2);
        
       
        
    }


}

