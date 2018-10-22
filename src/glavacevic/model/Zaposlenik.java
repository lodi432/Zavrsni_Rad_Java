/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import java.io.Serializable;
import javax.persistence.Entity;
import static javax.swing.text.StyleConstants.Size;



/**
 *
 * @author domagoj
 */
@Entity

public class Zaposlenik extends Osoba implements Serializable{
    
     private int id;

    private String naziv;
     private String opis;
     private String godine;
     private String dpath;

    public String getDpath() {
        return dpath;
    }

    public void setDpath(String dpath) {
        this.dpath = dpath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getGodine() {
        return godine;
    }

    public void setGodine(String godine) {
        this.godine = godine;
    }

    public String getOstalo() {
        return dpath;
    }

    public void setOstalo(String ostalo) {
        this.dpath = ostalo;
    }
    
//       @Override
//    public String toString() {
//        return getNaziv();
//    }  


     public String getPrezimeIme(){
        return getPrezime() + " " + getIme();
    }
    
}