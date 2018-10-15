/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author MacaZekoMiš
 */

@Entity
public class Proizvod implements java.io.Serializable {
      private Integer proizvodId;
     private String proizvodNaziv;
     private String proizvodSlika;
     private String proizvodOpis;
     private BigDecimal proizvodCijena;

     
      public Proizvod() {
    }
      
        public Proizvod(String proizvodNaziv, BigDecimal proizvodCijena) {
        this.proizvodNaziv = proizvodNaziv;
        this.proizvodCijena = proizvodCijena;
    }
        
           public Proizvod(String proizvodNaziv, String proizvodSlika, String proizvodOpis, BigDecimal proizvodCijena) {
       this.proizvodNaziv = proizvodNaziv;
       this.proizvodSlika = proizvodSlika;
       this.proizvodOpis = proizvodOpis;
       this.proizvodCijena = proizvodCijena;
    }
           
                @Id @GeneratedValue(strategy=IDENTITY)

    @Column(name="product_id", unique=true, nullable=false)
    public Integer getProizvodId() {
        return this.proizvodId;
    }

    public void setProizvodId(Integer proizvodId) {
        this.proizvodId = proizvodId;
    }

    public String getProizvodNaziv() {
        return proizvodNaziv;
    }

    public void setProizvodNaziv(String proizvodNaziv) {
        this.proizvodNaziv = proizvodNaziv;
    }
   
    @Column(name="product_image")
    public String getProizvodSlika() {
        return this.proizvodSlika;
    }

    public void setProizvodSlika(String proizvodSlika) {
        this.proizvodSlika = proizvodSlika;
    }

    public String getProizvodOpis() {
        return proizvodOpis;
    }

    public void setProizvodOpis(String proizvodOpis) {
        this.proizvodOpis = proizvodOpis;
    }
    
    @Column(name="product_price", nullable=false, precision=10)
    public BigDecimal getProizvodCijena() {
       return this.proizvodCijena;
    }

    public void setProizvodCijena(BigDecimal proizvodCijena) {
        this.proizvodCijena = proizvodCijena;
    }
    
     @Override
    public String toString() {
        return getProizvodNaziv();
    }
}
