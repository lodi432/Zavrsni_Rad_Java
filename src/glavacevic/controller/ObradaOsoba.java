/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.Osoba;
import glavacevic.pomocno.EdunovaException;
import glavacevic.pomocno.Kontrola;

/**
 *
 * @author MacaZekoMiš
 */
public class ObradaOsoba extends Obrada {
       protected void kontrola(Osoba e) throws EdunovaException{
        
        if (e.getIme().trim().isEmpty()){
            throw new EdunovaException("Ime obavezno");
        }
        
        if (e.getPrezime().trim().isEmpty()){
            throw new EdunovaException("Prezime obavezno");
        }
        
//        if (!e.getOib().isEmpty() && !Kontrola.provjeraOIB(e.getOib())){
//            throw new EdunovaException("OIB neispravan");
//        }
        
        
        
    }
}
