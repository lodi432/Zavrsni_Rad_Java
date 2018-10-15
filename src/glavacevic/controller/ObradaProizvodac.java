/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.Proizvodac;
import glavacevic.pomocno.EdunovaException;
import java.util.List;
/**
 *
 * @author MacaZekoMiš
 */
public class ObradaProizvodac extends ObradaOsoba implements ObradaInterface<Proizvodac>{
    public List<Proizvodac> getEntiteti(){
        return session.createQuery(" from Proizvodac").list();
    }
    
    
      public List<Proizvodac> getEntiteti(String uvjet){
        return session.createQuery(" from Proizvodac e where "
                + " concat(e.ime, ' ', e.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
      
      @Override
    public Proizvodac dodaj(Proizvodac e) throws EdunovaException {
        kontrola(e);
       spremi(e);
        return e;
    }
    
     @Override
    public Proizvodac promjena(Proizvodac e) throws EdunovaException {
        kontrola(e);
         spremi(e);
        return e;
    }
     private void kontrola(Proizvodac e) throws EdunovaException{
        
       super.kontrola(e);
       //dodatne kontrole od predavača
        
        
        
    }
}
