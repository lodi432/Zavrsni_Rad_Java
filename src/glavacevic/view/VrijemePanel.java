/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.HashMap;
import com.google.gson.*;
import com.google.gson.reflect.*;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.sql.Array;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author MacaZekoMiš
 */
public class VrijemePanel extends javax.swing.JPanel {

    /**
     * Creates new form VrijemeApi
     */
    public VrijemePanel() throws MalformedURLException, IOException  {
        initComponents();
        setName("VrijemeApi");
        String API_KEY = "856ad9a3f2c21e1cf4b43691dbce6b13";
        String LOCATION = "Osijek,Hr";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + LOCATION +
                           "&APPID=856ad9a3f2c21e1cf4b43691dbce6b13" + "&units=metric";
             try{
            StringBuilder result = new StringBuilder();
            URL url = new URL (urlString);
            URLConnection conn = url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            String line;
            
            while ((line= rd.readLine()) != null){
                result.append(line);
            }
                System.out.println(result);
            
            Map<String, Object> respMap = jsonToMap(result.toString());
            Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
            Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
//            Map<String, Object> weatherMap = jsonToMap(respMap.get("weather").toString());

//           Map<String, Object> weatherMap = jsonToMap(respMap.get("weather").toString());
           System.out.println("Temperatura je : " + mainMap.get("temp"));
           System.out.println("Pritisak je : " + mainMap.get("pressure"));
           System.out.println("Vjetar je : " + windMap.get("speed")); 
//           System.out.println("Opis vremena je : " + weatherMap.get("description"));

          temp.setText(mainMap.get("temp").toString());
          pritisak_label.setText(mainMap.get("pressure").toString());
          vlaga_label.setText(mainMap.get("humidity").toString());
          vjetar_label.setText(windMap.get("speed").toString());
            
//         URL urlIMG = new URL("http://openweathermap.org/img/w/") +iconCode + ".png";
//         image = ImageIO.read(urlIMG);
           
//             MYI.setIcon(new ImageIcon(image));
        }
        catch(IOException e){
            System.out.println("wtf"+e.getMessage());
        }

    }
    
       public static Map<String, Object>jsonToMap(String str){
        Map<String, Object>map = new Gson().fromJson(
        str, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
    return map;
  }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        vjetar_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        temp1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pritisak_label = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        vlaga_label = new javax.swing.JLabel();
        vlaga_label1 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Wind_Turbine_24px.png"))); // NOI18N

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 0, 102));

        vjetar_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vjetar_label.setForeground(new java.awt.Color(255, 255, 255));
        vjetar_label.setText("2.6");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Partly_Cloudy_Day_24px.png"))); // NOI18N

        temp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        temp.setForeground(new java.awt.Color(255, 255, 255));
        temp.setText("11.0");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Osijek, HR");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Temp");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Wind_Turbine_24px.png"))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Brzina vjetra");

        temp1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        temp1.setForeground(new java.awt.Color(255, 255, 255));
        temp1.setText("°");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pritisak");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Atmospheric_Pressure_24px.png"))); // NOI18N

        pritisak_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pritisak_label.setForeground(new java.awt.Color(255, 255, 255));
        pritisak_label.setText("1011");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Vlaga");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Humidity_24px_1.png"))); // NOI18N

        vlaga_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vlaga_label.setForeground(new java.awt.Color(255, 255, 255));
        vlaga_label.setText("80");

        vlaga_label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vlaga_label1.setForeground(new java.awt.Color(255, 255, 255));
        vlaga_label1.setText("%");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(vjetar_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pritisak_label, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(vlaga_label, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vlaga_label1)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(temp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temp1)
                                .addGap(43, 43, 43))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pritisak_label)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(temp1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(vjetar_label))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vlaga_label)
                        .addComponent(vlaga_label1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel pritisak_label;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel temp1;
    private javax.swing.JLabel vjetar_label;
    private javax.swing.JLabel vlaga_label;
    private javax.swing.JLabel vlaga_label1;
    // End of variables declaration//GEN-END:variables
}
