/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vargasveronica.portfolio.Interface;

import com.vargasveronica.portfolio.Entity.Persona;
import java.util.List;

/**
 *
 * @author varga
 */
public interface IPersonaService {
    public List<Persona> getPersona();
    public void savePersona(Persona persona);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
    
}
