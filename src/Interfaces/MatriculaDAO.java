/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;
import modelo.Cicle;
import modelo.Curs;
import modelo.Familia;
import modelo.Matricula;
import modelo.UnitatFormativa;


/**
 *
 * @author ALUMNEDAM
 */
public interface MatriculaDAO extends GenericaDAO<Matricula>{
    
    /**
     * Retorna un objecte Matricula si el seu el nom de l'Alumne que la té, 
     * es igual al String passat per parametre 
     * @param nif
     * @return 
     */
    Matricula buscarPerAlumne(String nif);
    
    /**
     * Metodo que pasandole el id de una matricula nos devuelve una lista
     * @param uf
     * @return 
     */
    List buscarAlumnesPerUF(UnitatFormativa uf);
    
    /**
     * Devuelve todos los alumnos que se han matriculado en el curso pasado
     * por parametro
     * @param curs
     * @return 
     */
    List buscarAlumnePerCurs(Curs curs);
    
    /**
     * Devuelve todos los alumnos que se han matriculado en el ciclo pasado
     * por parametro
     * @param cicle
     * @return 
     */
    List buscarAlumnePerCicle(Cicle cicle);
    
    /**
     * Devuelve todos los alumnos que se han matriculado en la familia pasada
     * por parametro
     * @param familia
     * @return 
     */
    List buscarAlumnePerFamilia(Familia familia);
}
