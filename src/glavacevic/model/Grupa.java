/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author MacaZekoMiš
 */

@Entity 
@Table (name = "grupica")
public class Grupa extends Entitet implements Serializable {
      @Column(name = "ime", length = 50)
    private String naziv;
    @Temporal(TemporalType.DATE)
    private Date datumPocetka;
    
     @ManyToOne()
    @JoinColumn(name="predavac")
    private Proizvodac proizvodac;
     
       @ManyToOne
    private Projekt projekt;
       
        @ManyToMany
    private List<Zaposlenik> artisti;
        
         public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Proizvodac getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(Proizvodac proizvodac) {
        this.proizvodac = proizvodac;
    }

    public Projekt getProjekt() {
        return projekt;
    }

    public void setProjekt(Projekt projekt) {
        this.projekt = projekt;
    }

    public List<Zaposlenik> getPolaznici() {
        return artisti;
    }

    public void setPolaznici(List<Zaposlenik> artisti) {
        this.artisti = artisti;
    }

    @Override
    public String toString() {
        return getNaziv();
    }

//    @Override
//    public String getCSV() {
//        return getNaziv() + "\t" + getDatumPocetka() + "\t" + getProjekt().getNaziv();
//    }
    
}
