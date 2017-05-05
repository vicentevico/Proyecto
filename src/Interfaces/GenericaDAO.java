/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Vicente
 */
public interface GenericaDAO<T> {
    
    /**
     * Añade un objeto T a la base de datos
     * @param t 
     */
    void afegir(T t);
    
    /**
     * Elimina el objeto T de la base de datos
     * @param t 
     */
    void eliminar(T t);
    
    /**
     * Modifica un objeto T en la base de datos
     * @param t 
     */
    void modificar(T t);
    
}
