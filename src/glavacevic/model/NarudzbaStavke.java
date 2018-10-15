/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author MacaZekoMiš
 */
@Entity
public class NarudzbaStavke {

    private NarudzbaStavkeId id;
    private int kolicina;

    public NarudzbaStavke() {
    }

    public NarudzbaStavke(NarudzbaStavkeId id, int kolicina) {
        this.id = id;
        this.kolicina = kolicina;
    }

    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "narudzbaId", column = @Column(name = "narudzba_id", nullable = false))
        , 
        @AttributeOverride(name = "proizvodId", column = @Column(name = "proizvod_id", nullable = false))})
    public NarudzbaStavkeId getId() {
        return this.id;
    }

    public void setId(NarudzbaStavkeId id) {
        this.id = id;
    }

    @Column(name = "kolicina", nullable = false)
    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

}
