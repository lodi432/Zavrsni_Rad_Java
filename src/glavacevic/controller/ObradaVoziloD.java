/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.VoziloD;
import glavacevic.pomocno.EdunovaException;
import java.util.List;

/**
 *
 * @author MacaZekoMiš
 */
public class ObradaVoziloD extends Obrada implements ObradaInterface<VoziloD> {
     public List<VoziloD> getEntiteti(){
        return session.createQuery(" from VoziloD").list();
    }
     
       public List<VoziloD> getEntiteti(String uvjet){
        return session.createQuery(" from VoziloD e where e.nazivdjela like :uvjet "
                + " order by e.nazivdjela")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
       
         @Override
    public VoziloD dodaj(VoziloD e) throws EdunovaException {
       
       spremi(e);
        return e;
    }
    
     @Override
    public VoziloD promjena(VoziloD e) throws EdunovaException {
        
         spremi(e);
        return e;
    }
    
    
       
}
