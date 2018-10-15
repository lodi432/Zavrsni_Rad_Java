/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.Entitet;
import glavacevic.model.VoziloD;
import glavacevic.pomocno.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author MacaZekoMiš
 */
public abstract class Obrada {
    
    
    protected Session session;
    
    
    public  Obrada(){
        session=HibernateUtil.getSession();
    }
    
     
   
    
    protected void spremi(Entitet e){
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }
   
    public void obrisi(Entitet e){

        session.beginTransaction();
        session.delete(e);
        session.getTransaction().commit();

       
    }

   
    
    
}

