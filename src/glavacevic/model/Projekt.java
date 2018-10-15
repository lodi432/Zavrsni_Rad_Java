/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Entity;

/**
 *
 * @author MacaZekoMiš
 */

@Entity
public class Projekt extends Entitet implements Serializable {
   
    private String naziv;
    private String direktorij;
    private int trajanje;
    private BigDecimal cijena;

    public String getDirektorij() {
        return direktorij;
    }

    public void setDirektorij(String direktorij) {
        this.direktorij = direktorij;
    }
    
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    
    @Override
    public String toString() {
        return getNaziv();
    }
    
}
