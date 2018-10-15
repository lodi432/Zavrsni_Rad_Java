/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.LoggerMe;
import glavacevic.pomocno.EdunovaException;
import glavacevic.pomocno.Kontrola;
import java.util.List;

/**
 *
 * @author MacaZekoMiš
 */
public class ObradaLoger extends Obrada implements ObradaInterface<LoggerMe> {
      public List<LoggerMe> getEntiteti(){
        return session.createQuery(" from LoggerMe").list();
    }
     
        public List<LoggerMe> getEntiteti(String uvjet){
        return session.createQuery(" from LoggerMe e where "
                + " e.vrijemeOtvaranja like :uvjet")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
        
         @Override
    public LoggerMe dodaj(LoggerMe e) throws EdunovaException {
     
        spremi(e);
        return e;
    }

    @Override
    public LoggerMe promjena(LoggerMe e) throws EdunovaException {
        spremi(e);
        return e;
    }
}
