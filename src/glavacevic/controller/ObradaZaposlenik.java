/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.Zaposlenik;
import glavacevic.pomocno.EdunovaException;
import java.util.List;

/**
 *
 * @author MacaZekoMiš
 */
public class ObradaZaposlenik extends ObradaOsoba implements ObradaInterface<Zaposlenik> {
    
    
    
     public List<Zaposlenik> getEntiteti(){
        return session.createQuery(" from Zaposlenik").list();
    }
     
      public List<Zaposlenik> getEntiteti(String uvjet){
        return session.createQuery(" from Zaposlenik e where "
                + " concat(e.ime, ' ', e.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
    
    @Override
    public Zaposlenik dodaj(Zaposlenik e) throws EdunovaException {
        kontrola(e);
        spremi(e);
        return e;
    }

    @Override
    public Zaposlenik promjena(Zaposlenik e) throws EdunovaException {
        kontrola(e);
        spremi(e);
        return e;
    }
    
    
    
    
    private void kontrola(Zaposlenik e) throws EdunovaException{
        
       super.kontrola(e);
       //dodatne kontrole od polaznika
        
        
        
    }
    
}
