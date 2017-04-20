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
    
    void afegir(T t);
    
    void eliminar(T t);
    
    void modificar(T t);
    
}
