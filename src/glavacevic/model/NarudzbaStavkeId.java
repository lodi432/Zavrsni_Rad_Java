/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author MacaZekoMiš
 */
@Embeddable
public class NarudzbaStavkeId implements java.io.Serializable {

    private int narudzbaId;
    private int proizvodId;

    public NarudzbaStavkeId() {
    }

    public NarudzbaStavkeId(int narudzbaId, int proizvodId) {
        this.narudzbaId = narudzbaId;
        this.proizvodId = proizvodId;
    }

    @Column(name="order_id", nullable=false)
    public int getNarudzbaId() {
        return this.narudzbaId;
    }

    public void setNarudzbaId(int narudzbaId) {
        this.narudzbaId = narudzbaId;
    }

    @Column(name="product_id", nullable=false)
    public int getProizvodId() {
        return this.proizvodId;
    }

    public void setProizvodId(int proizvodId) {
        this.proizvodId = proizvodId;
    }
    
      public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NarudzbaStavkeId) ) return false;
		 NarudzbaStavkeId castOther = ( NarudzbaStavkeId ) other; 
         
		 return (this.getNarudzbaId()==castOther.getNarudzbaId())
 && (this.getProizvodId()==castOther.getProizvodId());
   }
      
        public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getNarudzbaId();
         result = 37 * result + this.getProizvodId();
         return result;
   }   

}
