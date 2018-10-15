/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author MacaZekoMiš
 */


@Entity

public class VoziloD extends Entitet implements Serializable {
       private BigDecimal cijena;
       private String nazivdjela;
       private String proizvodacdobavljac;
       private String model;
        
       private String tezina;

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public String getNazivdjela() {
        return nazivdjela;
    }

    public void setNazivdjela(String nazivdjela) {
        this.nazivdjela = nazivdjela;
    }

    public String getProizvodacdobavljac() {
        return proizvodacdobavljac;
    }

    public void setProizvodacdobavljac(String proizvodacdobavljac) {
        this.proizvodacdobavljac = proizvodacdobavljac;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTezina() {
        return tezina;
    }

    public void setTezina(String tezina) {
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        return getNazivdjela();
    }
         
}
