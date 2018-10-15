/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.Grupa;
import glavacevic.pomocno.EdunovaException;
import glavacevic.pomocno.Kontrola;
import java.util.List;

/**
 *
 * @author MacaZekoMiš
 */
public class ObradaGrupa extends Obrada implements ObradaInterface<Grupa>{

    
     public List<Grupa> getEntiteti(){
        return session.createQuery(" from Grupa").list();
    }
     
        public List<Grupa> getEntiteti(String uvjet){
        return session.createQuery(" from Grupa e where "
                + " e.naziv like :uvjet")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
    @Override
    public Grupa dodaj(Grupa e) throws EdunovaException {
        Kontrola.stringNijePrazan(e.getNaziv(), "Naziv grupe obavezno");
        spremi(e);
        return e;
    }

    @Override
    public Grupa promjena(Grupa e) throws EdunovaException {
        spremi(e);
        return e;
    }
    
}
