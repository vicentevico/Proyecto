/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import modelo.Alumne;

/**
 *
 * @author Vicente
 */
public interface AlumneDAO extends GenericaDAO<Alumne>{
    
    Alumne buscarPerNom(String nom);
    
}
