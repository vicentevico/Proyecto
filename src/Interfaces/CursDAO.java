/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import modelo.Curs;

/**
 *
 * @author Vicente
 */
public interface CursDAO extends GenericaDAO<Curs>{

    /**
     * Metodo que pasandole el nombre de un curso lo busca y te devuelve un 
     * objeto curso
     * @param nombreCurso nombre del curso a buscar
     * @return objeto curso
     */
    Curs buscarPerNom(String nombreCurso);
}