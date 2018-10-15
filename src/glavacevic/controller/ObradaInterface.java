/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import glavacevic.pomocno.EdunovaException;
import java.util.List;

/**
 *
 * @author MacaZekoMiš
 */
public interface ObradaInterface<T> {
     public List<T> getEntiteti();
     public T dodaj(T e) throws EdunovaException;
     public T promjena(T e) throws EdunovaException;
}
