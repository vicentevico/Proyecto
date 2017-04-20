/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import modelo.Modul;

/**
 *
 * @author Vicente
 */
public interface ModulDAO extends GenericaDAO<Modul>{

    /**
     * Metodo que pasando el nombre de un modulo, devuelve un objeto
     * Modulo
     * @param nombre nombre del modulo a buscar
     * @return objeto Modulo
     */
    Modul buscarPerNom(String nombre);
}