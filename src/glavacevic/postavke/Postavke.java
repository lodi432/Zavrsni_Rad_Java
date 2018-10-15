/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.postavke;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author MacaZekoMiš
 */
public class Postavke {

    public static Properties postavke = new Properties();

    public void SpremiPostavku(String TajRed) {
        try {
            postavke.setProperty("ID", TajRed);
            postavke.store(new FileOutputStream("config.properties"), null);

        } catch (IOException e) {

        }
    }
    
    public String UcitajPostavke(){
        String line ="";
        try {
            postavke.load(new FileInputStream("config.properties"));
            line = postavke.getProperty("ID");
        } catch (Exception e) {
        }
        return line;

}
    
}
