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

    @Override
    public default void afegir(UnitatFormativa t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default void eliminar(UnitatFormativa t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default void modificar(UnitatFormativa t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
