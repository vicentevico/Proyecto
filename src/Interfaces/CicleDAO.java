/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;
import modelo.Cicle;

/**
 *
 * @author ALUMNEDAM
 */
public interface CicleDAO extends GenericaDAO<Cicle> {

    /**
     * Retorna tots els cicles que contenten un modul especific
     * @param nomModul
     * @return 
     */
    List<Cicle> buscarCiclesPerNomModul(String nomModul);    
}