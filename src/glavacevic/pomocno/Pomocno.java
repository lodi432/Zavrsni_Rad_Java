/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.pomocno;

import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Pomocno {
    
     public static String getRandomString(){
        String easy = RandomString.digits + "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwx";
        int znakova = new Random().nextInt(20)+1;
RandomString tickets = new RandomString(znakova, new SecureRandom(), easy);
return tickets.nextString();
    }
    
}
