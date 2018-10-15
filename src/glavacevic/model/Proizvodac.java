/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author MacaZekoMiš
 */

@Entity

public class Proizvodac extends Osoba implements Serializable {
        private String nazivProizvodaca;
        private String kontaktInfo;

    public String getNazivProizvodaca() {
        return nazivProizvodaca;
    }

    public void setNazivProizvodaca(String nazivProizvodaca) {
        this.nazivProizvodaca = nazivProizvodaca;
    }

    public String getKontaktInfo() {
        return kontaktInfo;
    }

    public void setKontaktInfo(String kontaktInfo) {
        this.kontaktInfo = kontaktInfo;
    }
}
