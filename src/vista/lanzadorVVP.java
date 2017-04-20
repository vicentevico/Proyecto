/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Curs_Controller;
import modelo.Curs;
import modelo.UnitatFormativa;
import utilidades.EnumCurso;

/**
 *
 * @author Vicente
 */
public class lanzadorVVP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curs_Controller cc = new Curs_Controller();
        
        Curs curso = new Curs();
        curso.setId(Long.MIN_VALUE);
        curso.setNombreCurso(EnumCurso.PRIMERO);
        UnitatFormativa uf = new UnitatFormativa();
        uf.setId(Long.MIN_VALUE);
        
        curso.getListaUnidadesFormativas().add(uf);
        
        cc.afegir(curso);
    }
    
}
