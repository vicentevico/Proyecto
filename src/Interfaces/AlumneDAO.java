/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;
import modelo.Alumne;

/**
 *
 * @author Vicente
 */
public interface AlumneDAO extends GenericaDAO<Alumne>{
    
    /**
     * Retorna un objecte Alumne si el seu nom es igual al String
     * passat per parametre 
     * @param nom
     * @return 
     */
    Alumne buscarPerNom(String nom);
    
    /**
     * Retorna un objecte Alumne si el seu cognom es igual al String
     * passat per parametre 
     * @param cognom
     * @return 
     */
    Alumne buscarPerCognom(String cognom);
    
    /**
     * Retorna tots els alumnes a la bd
     * @return 
     */
    List<Alumne> buscarTots();
    
}
