/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;
import modelo.Familia;

/**
 *
 * @author ALUMNEDAM
 */
public interface FamiliaDAO extends GenericaDAO<Familia>{

    /**
     * Retorna una llista de les families que tenen el mateix cicle
     * @param nomCicle
     * @return 
     */
    List<Familia> buscarFamiliaPerNomCicle(String nomCicle);
    
}
