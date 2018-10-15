/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.pomocno;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author MacaZekoMiš
 */
public class HibernateUtil {
     private static Session session = null;

    protected HibernateUtil() {
        // Mora postojati da bi onemogućilo konstruiranje
    }// daljnje čitanje https://www.journaldev.com/1827/java-design-patterns-example-tutorial
    public static Session getSession() {
        if (session == null) {
            try {
                  
                session = new Configuration().configure().buildSessionFactory().openSession();
            } catch (Throwable ex) {
                System.err.println("Kreiranje Initial SessionFactory neuspjelo: " + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }
        return session;
    }
}
