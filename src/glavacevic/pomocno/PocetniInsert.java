/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.pomocno;

import glavacevic.model.Artist;
import glavacevic.model.Operater;
import glavacevic.model.Projekt;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.hibernate.Session;
/**
 *
 * @author MacaZekoMiš
 */
public class PocetniInsert {
    public static void izvedi() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajOperatera(session);
        Projekt java = kreirajSmjer(session);
        //Smjer java = session.load(Smjer.class, 2);
       List<Artist> lista1 = kreirajArtiste(session, 50);
        session.getTransaction().commit();
    }
    
    private static void kreirajOperatera(Session session) {
        Operater o = new Operater();
        o.setIme("Admin");
        o.setPrezime("Admin");
        o.setEmail("admin@gmail.com");
        o.setLozinka(Autorizacija.getHash("t"));

        session.save(o);
    }
    
      private static Projekt kreirajSmjer(Session session) {
        Projekt java = new Projekt();
        java.setNaziv("Audio Inzinjerstvo");
        java.setCijena(new BigDecimal(4999));
        session.save(java);
        return java;
    }
      
      
         private static List<Artist> kreirajArtiste(Session session, int broj) {
        Artist p;
        List<Artist> l1 = new ArrayList<>();
        for (int i = 0; i < broj; i++) {
            p = new Artist();
            p.setIme(Pomocno.getRandomString());
            p.setPrezime(Pomocno.getRandomString());
            session.save(p);
            if (i % 7 == 0) {
                l1.add(p);
            }
        }
        return l1;
    }

}
