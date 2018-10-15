/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

//import com.profesorfalken.jsensors.JSensors;
//import com.profesorfalken.jsensors.model.components.Components;
//import com.profesorfalken.jsensors.model.components.Cpu;
//import com.profesorfalken.jsensors.model.sensors.Temperature;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.NetFlags;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.NetInterfaceStat;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.SigarNotImplementedException;
import org.hyperic.sigar.Swap;
import org.hyperic.sigar.Who;
import org.pushingpixels.trident.Timeline;





/**
 *
 * @author MacaZekoMiš
 */
public class sysFrame extends javax.swing.JFrame {

    /**
     * Creates new form sysFrame
     */
    
    final static String newline = "\n";
 private float opacity = 1.0f;
    private float opacity2 = 1.0f;
    private BufferedImage image;
    public sysFrame() {
        initComponents();
        getCpuTotal();
        lb_ip.setVisible(false);
        blackHolePnl.setVisible(false);
        platform.setText(getPlatformName().toString());
        testGetOSInfo();
        lb_ip.setText(getDefaultIpAddress());
        testWho();
        change_Lbl.setVisible(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setText("");
        setOpacity(0.1f);
        slider.setVisible(false);
  
   
      
    }
    
    
    	 private Timeline fadeInTimeLine, fadeOutTimeLine;
   
//  public void setOpacity(float opacity) {
//        this.opacity = Math.max(0.0f, Math.min(1.0f, opacity));
//        repaint();
//    }
 
    
    
    public void getCpuTotal() {
        Sigar sigar = new Sigar();
        CpuInfo[] infos;
        try {
            infos = sigar.getCpuInfoList();
            for (int i = 0; i < infos.length; i++) {// 不管是单块CPU还是多CPU都适用
                CpuInfo info = infos[i];
//				System.out.println("Mhz:" + info.getMhz());// CPU的总量MHz
                mhz_InfoL.setText("Mhz: " + info.getMhz());
//				System.out.println("Vendor：" + info.getVendor());// 获得CPU的卖主，如：Intel
                vendor_InfoL.setText("Proizvođač: " + info.getVendor());
//				System.out.println("Model：" + info.getModel());// 获得CPU的类别，如：Celeron
                cpu_InfoL_3.setText("Model: " + info.getModel());
//				System.out.println("Cache Size：" + info.getCacheSize());// 缓冲存储器数量
                System.out.println("**************");
                 System.out.println("**************");
            }
            
        } catch (SigarException e) {
            e.printStackTrace();
        }
    }

    public String getPlatformName() {
        String hostname = "";
        try {
            hostname = InetAddress.getLocalHost().getHostName();
        } catch (Exception exc) {
            Sigar sigar = new Sigar();
            try {
                hostname = sigar.getNetInfo().getHostName();
            } catch (SigarException e) {
                hostname = "localhost.unknown";
            } finally {
                sigar.close();
            }
        }
        return hostname;
    }

    public void testGetOSInfo() {
        OperatingSystem OS = OperatingSystem.getInstance();
        // 操作系统内核类型如： 386、486、586等x86
//		System.out.println("OS.getArch() = " + OS.getArch());
        os_Info1_4.setText("Arhitektura: " + OS.getArch());
//		System.out.println("OS.getCpuEndian() = " + OS.getCpuEndian());//
//		System.out.println("OS.getDataModel() = " + OS.getDataModel());//
        // 系统描述
//		System.out.println("OS.getDescription() = " + OS.getDescription());
//		System.out.println("OS.getMachine() = " + OS.getMachine());//
        // 操作系统类型
//		System.out.println("OS.getName() = " + OS.getName());
//		System.out.println("OS.getPatchLevel() = " + OS.getPatchLevel());//
        // 操作系统的卖主
//		System.out.println("OS.getVendor() = " + OS.getVendor());

        os_Info2_2.setText("Proizvođač: " + OS.getVendor());
        // 卖主名称
//		System.out.println("OS.getVendorCodeName() = " + OS.getVendorCodeName());
        // 操作系统名称
//		System.out.println("OS.getVendorName() = " + OS.getVendorName());
        // 操作系统卖主类型
//		System.out.println("OS.getVendorVersion() = " + OS.getVendorVersion());
        // 操作系统的版本号
//		System.out.println("OS.getVersion() = " + OS.getVersion());
        os_Info3.setText("Verzija: " + OS.getVersion());
    }

    public void testWho() {
        try {
            Sigar sigar = new Sigar();
            Who[] who = sigar.getWhoList();
            if (who != null && who.length > 0) {
                for (int i = 0; i < who.length; i++) {
                    System.out.println("\n~~~~~~~~~" + String.valueOf(i) + "~~~~~~~~~");
                    Who _who = who[i];
//					System.out.println("获取设备getDevice() = " + _who.getDevice());
//					System.out.println("获得主机getHost() = " + _who.getHost());
//					System.out.println("获取的时间getTime() = " + _who.getTime());
                    // 当前系统进程表中的用户名
//					System.out.println("获取用户getUser() = " + _who.getUser());
                    if (i == 3) {
                        platformU_label.setText(_who.getUser().toString());
                        platfore_console.setText(_who.getUser().toString() + " : ");

                    }

                }
            }
        } catch (SigarException e) {
            e.printStackTrace();
        }
    }

    public String getDefaultIpAddress() {
        String address = null;
        try {
            address = InetAddress.getLocalHost().getHostAddress();
            // 没有出现异常而正常当取到的IP时，如果取到的不是网卡循回地址时就返回
            // 否则再通过Sigar工具包中的方法来获取
            if (!NetFlags.LOOPBACK_ADDRESS.equals(address)) {
                return address;
            }
        } catch (UnknownHostException e) {
            // hostname not in DNS or /etc/hosts
        }
        Sigar sigar = new Sigar();
        try {
            address = sigar.getNetInterfaceConfig().getAddress();
        } catch (SigarException e) {
            address = NetFlags.LOOPBACK_ADDRESS;
        } finally {
            sigar.close();
        }
        return address;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        cpu_InfoL_3 = new javax.swing.JLabel();
        mhz_InfoL = new javax.swing.JLabel();
        vendor_InfoL = new javax.swing.JLabel();
        platform = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        os_Info1_4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        os_Info2_2 = new javax.swing.JLabel();
        os_Info3 = new javax.swing.JLabel();
        platformU_label = new javax.swing.JLabel();
        blackHolePnl = new keeptoo.KGradientPanel();
        lb_ip = new javax.swing.JLabel();
        platfore_console = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        change_Lbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_More_16px_1.png"))); // NOI18N
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        cpu_InfoL_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpu_InfoL_3.setForeground(new java.awt.Color(255, 255, 255));
        cpu_InfoL_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cpu_InfoL_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cpu_InfoL_3MousePressed(evt);
            }
        });
        kGradientPanel1.add(cpu_InfoL_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 178, 180, 32));

        mhz_InfoL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mhz_InfoL.setForeground(new java.awt.Color(255, 255, 255));
        mhz_InfoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(mhz_InfoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 216, 180, 32));

        vendor_InfoL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vendor_InfoL.setForeground(new java.awt.Color(255, 255, 255));
        vendor_InfoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(vendor_InfoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 32));

        platform.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        platform.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(platform, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 33, 130, 30));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 74, 238, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("CPU Info");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, -1, -1));

        os_Info1_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        os_Info1_4.setForeground(new java.awt.Color(255, 255, 255));
        os_Info1_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        os_Info1_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                os_Info1_4MousePressed(evt);
            }
        });
        kGradientPanel1.add(os_Info1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 178, 180, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("OS info");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        os_Info2_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        os_Info2_2.setForeground(new java.awt.Color(255, 255, 255));
        os_Info2_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        os_Info2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                os_Info2_2MousePressed(evt);
            }
        });
        kGradientPanel1.add(os_Info2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 140, 180, 32));

        os_Info3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        os_Info3.setForeground(new java.awt.Color(255, 255, 255));
        os_Info3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        os_Info3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                os_Info3MousePressed(evt);
            }
        });
        kGradientPanel1.add(os_Info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 216, 180, 32));

        platformU_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        platformU_label.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(platformU_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 33, 80, 30));

        blackHolePnl.setkEndColor(new java.awt.Color(0, 0, 0));
        blackHolePnl.setkStartColor(new java.awt.Color(0, 0, 0));
        blackHolePnl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                blackHolePnlPropertyChange(evt);
            }
        });

        lb_ip.setForeground(new java.awt.Color(51, 255, 0));
        lb_ip.setText("jLabel4");

        platfore_console.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        platfore_console.setForeground(new java.awt.Color(0, 204, 255));
        platfore_console.setText(" :");

        textField1.setBackground(new java.awt.Color(0, 0, 0));
        textField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textField1.setForeground(new java.awt.Color(0, 204, 254));
        textField1.setText("Enter command");
        textField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textField1FocusGained(evt);
            }
        });
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        textField1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField1TextValueChanged(evt);
            }
        });
        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textField1KeyReleased(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 204, 204));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout blackHolePnlLayout = new javax.swing.GroupLayout(blackHolePnl);
        blackHolePnl.setLayout(blackHolePnlLayout);
        blackHolePnlLayout.setHorizontalGroup(
            blackHolePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blackHolePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blackHolePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_ip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addGroup(blackHolePnlLayout.createSequentialGroup()
                        .addComponent(platfore_console, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        blackHolePnlLayout.setVerticalGroup(
            blackHolePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blackHolePnlLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(blackHolePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(platfore_console, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_ip)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel1.add(blackHolePnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 259, 399, 160));

        change_Lbl.setForeground(new java.awt.Color(255, 255, 255));
        change_Lbl.setText("jLabel4");
        change_Lbl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                change_LblPropertyChange(evt);
            }
        });
        kGradientPanel1.add(change_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 13, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("System");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

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
        kGradientPanel1.add(slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 390, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-213-24.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cpu_InfoL_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpu_InfoL_3MousePressed


    }//GEN-LAST:event_cpu_InfoL_3MousePressed

    private void os_Info1_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_os_Info1_4MousePressed


    }//GEN-LAST:event_os_Info1_4MousePressed

    private void os_Info2_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_os_Info2_2MousePressed


    }//GEN-LAST:event_os_Info2_2MousePressed

    private void os_Info3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_os_Info3MousePressed

    }//GEN-LAST:event_os_Info3MousePressed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed


    }//GEN-LAST:event_textField1ActionPerformed

    private void textField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField1FocusGained
        textField1.setText("");
    }//GEN-LAST:event_textField1FocusGained

    private void textField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyPressed


    }//GEN-LAST:event_textField1KeyPressed

    private void textField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyReleased
        String text = textField1.getText();
//        System.out.println(textField1.getText());
        System.out.println("uneseno je:" + text);

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            System.out.println("textjeee:" + text);
            change_Lbl.setText(textField1.getText());

        }

    }//GEN-LAST:event_textField1KeyReleased

    private void textField1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField1TextValueChanged

    }//GEN-LAST:event_textField1TextValueChanged

    private void blackHolePnlPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_blackHolePnlPropertyChange

    }//GEN-LAST:event_blackHolePnlPropertyChange

    private void change_LblPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_change_LblPropertyChange

        System.out.println("hhov famovzni text je:" + change_Lbl.getText());
        if (change_Lbl.getText().equalsIgnoreCase("IP")) {
            jTextArea1.setText("---------------------------------------------------------------------------------------");
            lb_ip.setVisible(true);
        } else {
            lb_ip.setVisible(false);
//            lb_ip.setText("\""+change_Lbl.getText()+"\" "+" nije prepoznata kao unutarnja naredba. Ukucaj HELP za sve naredbe.");
            jTextArea1.setText("\"" + change_Lbl.getText() + "\" " + " nije prepoznata kao unutarnja naredba. Ukucaj HELP za sve naredbe.");

        }

        if (change_Lbl.getText().equalsIgnoreCase("help")) {
            lb_ip.setVisible(false);
            jTextArea1.setText("IP  --- Prikaži IP adresu" + newline + "Help --- Prikaži sve naredbe");
        }
    }//GEN-LAST:event_change_LblPropertyChange

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
                        setOpacity(slider.getValue() / 100.0f);
    }//GEN-LAST:event_sliderStateChanged

    private void sliderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMouseEntered
        //        slider.setBackground(Color.yellow);
    }//GEN-LAST:event_sliderMouseEntered

    private void sliderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sliderPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_sliderPropertyChange

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         fadeInTimeLine = new Timeline(this);
        fadeInTimeLine.addPropertyToInterpolate("Opacity", 0.1f, 1.0f);
        fadeInTimeLine.setDuration(400);
        fadeInTimeLine.play();
        System.out.println(this);

    }//GEN-LAST:event_formComponentShown

    public void makni(){
           this.setVisible(false); 
    }
    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
  
            fadeOutTimeLine = new Timeline(this);
        fadeOutTimeLine.addPropertyToInterpolate("Opacity", 1.0f, 0.0f);
        fadeOutTimeLine.setDuration(400);
        fadeOutTimeLine.play();
        System.out.println(this);
        new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
             makni();
            }
        }, 
        2000 
);
//        if(opacity= = 0.0){
//             this.setVisible(false); 
//        }
       
    }//GEN-LAST:event_jLabel5MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sysFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel blackHolePnl;
    private javax.swing.JLabel change_Lbl;
    private javax.swing.JLabel cpu_InfoL_3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lb_ip;
    private javax.swing.JLabel mhz_InfoL;
    private javax.swing.JLabel os_Info1_4;
    private javax.swing.JLabel os_Info2_2;
    private javax.swing.JLabel os_Info3;
    private javax.swing.JLabel platfore_console;
    private javax.swing.JLabel platform;
    private javax.swing.JLabel platformU_label;
    private javax.swing.JSlider slider;
    private java.awt.TextField textField1;
    private javax.swing.JLabel vendor_InfoL;
    // End of variables declaration//GEN-END:variables
}
