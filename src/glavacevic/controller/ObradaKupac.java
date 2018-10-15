/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.Orders;
import glavacevic.pomocno.EdunovaException;
import java.util.List;

/**
 *
 * @author MacaZekoMiš
 */
public class ObradaKupac extends Obrada implements ObradaInterface<Orders> {
     
       public List<Orders> getEntiteti(){
        
        
        return session.createQuery(" from Orders e order by e.orderName").list();
        
    
    }
          public List<Orders> getEntiteti(String uvjet){
          

        return session.createQuery(" from Orders e where e.orderName like :uvjet "
                + " order by e.orderName")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
        
    }
       
       
   public Orders dodaj(Orders s) throws EdunovaException{
       
     
        //ovdje dođu sve ostale kontrole
        
     
        
        return s;
    }
   
        public Orders promjena(Orders p) throws EdunovaException{
        
    
        
        //ovdje dođu sve ostale kontrole
      
        
        return p;
    }
}
