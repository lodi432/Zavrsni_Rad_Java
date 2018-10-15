/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.Artist;
import glavacevic.pomocno.EdunovaException;
import java.util.List;

/**
 *
 * @author MacaZekoMiš
 */
public class ObradaArtist extends ObradaOsoba implements ObradaInterface<Artist> {
    
    
    
     public List<Artist> getEntiteti(){
        return session.createQuery(" from Artist").list();
    }
     
      public List<Artist> getEntiteti(String uvjet){
        return session.createQuery(" from Artist e where "
                + " concat(e.ime, ' ', e.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
    
    @Override
    public Artist dodaj(Artist e) throws EdunovaException {
        kontrola(e);
        spremi(e);
        return e;
    }

    @Override
    public Artist promjena(Artist e) throws EdunovaException {
        kontrola(e);
        spremi(e);
        return e;
    }
    
    
    
    
    private void kontrola(Artist e) throws EdunovaException{
        
       super.kontrola(e);
       //dodatne kontrole od polaznika
        
        
        
    }
    
}
