/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import java.util.Date;
import javax.persistence.AttributeConverter;
import javax.persistence.Basic;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author MacaZekoMiš
 */
@Entity 

public class LoggerMe extends Entitet implements Serializable {
    
   
//    @CreationTimestamp
//    @Temporal(TemporalType.DATE)
//    private Date vrijemeOtvaranjaDatum;
 
    @CreationTimestamp
    private Timestamp otvorenoVrijeme;
     
    public Timestamp getOtvorenoVrijeme() {
        return otvorenoVrijeme;
    }

    public void setOtvorenoVrijeme(Timestamp otvorenoVrijeme) {
        this.otvorenoVrijeme = otvorenoVrijeme;
    }
    
    
    
//     private Date created;
//  private Date updated;
//  @PrePersist
//  protected void onCreate() {
//    created = new Date();
//  }
//
//  @PreUpdate
//  protected void onUpdate() {
//    updated = new Date();
//  }

  
//    
//
//    public Date getVrijemeOtvaranjaDatum() {
//        return vrijemeOtvaranjaDatum;
//    }
//
//    public void setVrijemeOtvaranjaDatum(Date vrijemeOtvaranjaDatum) {
//        this.vrijemeOtvaranjaDatum = vrijemeOtvaranjaDatum;
//    }



 
}
