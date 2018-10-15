/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.model.Projekt;
import glavacevic.pomocno.EdunovaException;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author MacaZekoMiš
 */
public class ObradaProjekt extends Obrada implements ObradaInterface<Projekt> {

    
    
       public List<Projekt> getEntiteti(){
        return session.createQuery(" from Projekt e order by e.naziv").list();
    }
       
        public List<Projekt> getEntiteti(String uvjet){
        return session.createQuery(" from Projekt e where e.naziv like :uvjet "
                + " order by e.naziv")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
       
       
         public Projekt dodaj(Projekt s) throws EdunovaException{
       
        kontrola(s);
        
        BigInteger postojeci  = (BigInteger)session.createSQLQuery("select count(sifra) from projekt where naziv=:naziv").
                setString("naziv", s.getNaziv()).uniqueResult();
        if(postojeci.intValue()==1){
            throw new EdunovaException("Projekt s istim nazivom postoji");
        }
        //ovdje dođu sve ostale kontrole
        
        
        spremi(s);
        
        return s;
    }
         
         
          public Projekt promjena(Projekt p) throws EdunovaException{
        
        kontrola(p);
        
        BigInteger postojeci  = (BigInteger)session.createSQLQuery("select count(sifra) from projekt where naziv=:naziv and sifra<>:sifra").
                setString("naziv", p.getNaziv()).setInteger("sifra", p.getSifra()).uniqueResult();
        if(postojeci.intValue()==1){
            throw new EdunovaException("Smjer s istim nazivom postoji");
        }
        
        //ovdje dođu sve ostale kontrole
        
        spremi(p);
        
        return p;
    }
         
         
    private void kontrola(Projekt s) throws EdunovaException{
        kontrolaObaveznoVrijednost(s);
//može i ovako         
//Kontrola.stringNijePrazan(s.getNaziv(), "Naziv Projekta obavezno");
        kontrolaNeViseOd50Znakova(s); 
        kontrolaBrojeviNeMoguBitiUNazivu(s);
        
    }

    private void kontrolaObaveznoVrijednost(Projekt s) throws EdunovaException {
        if(s.getNaziv()==null || s.getNaziv().isEmpty()){
            throw new EdunovaException("Naziv obavezno");
        }
    }

    private void kontrolaBrojeviNeMoguBitiUNazivu(Projekt s) throws EdunovaException{
         try {
            Integer.parseInt(s.getNaziv());
            throw new EdunovaException("Projekt ne smije imati samo brojeve u nazivu");
        } catch (Exception e) {
            
        }
    }

    private void kontrolaNeViseOd50Znakova(Projekt s) throws EdunovaException{
        if(s.getNaziv().length()>50){
            throw new EdunovaException("Naziv ne smije imati više od 50 znakova");
        }
    }
       
       
       
  

    
}
