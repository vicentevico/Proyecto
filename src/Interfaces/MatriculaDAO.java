/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;
import modelo.Alumne;
import modelo.Curs;
import modelo.Matricula;
import modelo.UnitatFormativa;
import utilidades.EnumCurso;


/**
 *
 * @author ALUMNEDAM
 */
public interface MatriculaDAO extends GenericaDAO<Matricula>{
    
    /**
     * Retorna un objecte Matricula si el seu el nom de l'Alumne que la té, 
     * es igual al String passat per parametre 
     * @param alumne
     * @return 
     */
    Matricula buscarPerAlumne(Alumne alumne);
    
    /**
     * Metodo que pasandole el id de una matricula nos devuelve la matricula
     * @param uf
     * @return 
     */
    List buscarAlumnesPerUF(UnitatFormativa uf);
}
