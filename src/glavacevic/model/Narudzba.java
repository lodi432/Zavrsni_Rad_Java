/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author MacaZekoMiš
 */

@Entity
public class Narudzba implements java.io.Serializable {
    private Integer narudzbaSifra;
     private Date narudzbaDate;
     private String narudzbaNaziv;
     private String narudzbaEmail;
//      @CreationTimestamp
//    private Timestamp otvorenoVrijeme;

       
    public Narudzba() {
    }
    
     
      @Id 
     @GeneratedValue(strategy=IDENTITY)

      
        @Column(name="narudzba_sifra", unique=true)
    public Integer getNarudzbaSifra() {
        return narudzbaSifra;
    }

    public void setNarudzbaSifra(Integer narudzbaSifra) {
        this.narudzbaSifra = narudzbaSifra;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="narudzba_date", nullable=false, length=19)
    public Date getNarudzbaDate() {
        return narudzbaDate;
    }

    public void setNarudzbaDate(Date narudzbaDate) {
        this.narudzbaDate = narudzbaDate;
    }

    @Column(name="narudzba_naziv")
    public String getNarudzbaNaziv() {
        return narudzbaNaziv;
    }

    public void setNarudzbaNaziv(String narudzbaNaziv) {
        this.narudzbaNaziv = narudzbaNaziv;
    }

    @Column(name="narudzba_email")
    public String getNarudzbaEmail() {
        return narudzbaEmail;
    }

    public void setNarudzbaEmail(String narudzbaEmail) {
        this.narudzbaEmail = narudzbaEmail;
    }
     
    
       @Override
    public String toString() {
        return getNarudzbaNaziv();
    }
   
    

}
