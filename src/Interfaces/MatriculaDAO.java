/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import modelo.Matricula;


/**
 *
 * @author ALUMNEDAM
 */
public interface MatriculaDAO extends GenericaDAO<Matricula>{
    
    /**
     * Retorna un objecte Matricula si el seu el nom de l'Alumne que la té, 
     * es igual al String passat per parametre 
     * @param nomAlumne
     * @return 
     */
    Matricula buscarPerAlumne(String nomAlumne);
}