/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import modelo.UnitatFormativa;

/**
 *
 * @author Vicente
 */
public interface UnitatFormativaDAO extends GenericaDAO<UnitatFormativa>{

    /**
     * Metodo que pasando el nombre de una unidad formativa nos devuelve
     * un objeto UnitatFormativa
     * @param nombre nombre de la unidad formativa
     * @return objeto UnitatFormativa
     */
    UnitatFormativa buscarPerNom(String nombre);
    
}
