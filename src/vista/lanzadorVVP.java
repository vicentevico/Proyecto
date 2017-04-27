/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Alumne_Controller;
import controlador.Cicle_Controller;
import controlador.Curs_Controller;
import controlador.Familia_Controller;
import controlador.Matricula_Controller;
import controlador.Modul_Controller;
import controlador.UnitatFormativa_Controller;
import java.util.ArrayList;
import java.util.List;
import modelo.Alumne;
import modelo.Cicle;
import modelo.Curs;
import modelo.Familia;
import modelo.Import;
import modelo.Matricula;
import modelo.Modul;
import modelo.UnitatFormativa;
import utilidades.EnumCurso;
import utilidades.EnumDescompte;
import utilidades.EnumModalidad;

/**
 *
 * @author Vicente
 */
public class lanzadorVVP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SELECT * FROM AV_UNITATS_FORMATIVES;
        //SELECT * FROM AV_ALUMNES;
        //SELECT * FROM AV_CURSOS;
        //SELECT * FROM AV_MODULS;
        //SELECT * FROM AV_CICLES;
        //SELECT * FROM AV_FAMILIES;
        //
        //
        //DROP TABLE AV_UNITATS_FORMATIVES;
        //DROP TABLE AV_ALUMNES;
        //DROP TABLE AV_CURSOS;
        //DROP TABLE AV_MODULS;
        //DROP TABLE AV_CICLES;
        //DROP TABLE AV_FAMILIES;

        
        
        Alumne_Controller ac = new Alumne_Controller();
        Familia_Controller fc = new Familia_Controller();
        Cicle_Controller cicleC = new Cicle_Controller();
        Curs_Controller cursC = new Curs_Controller();
        Modul_Controller mc = new Modul_Controller();
        UnitatFormativa_Controller ufc = new UnitatFormativa_Controller();
        Matricula_Controller matriculaC = new Matricula_Controller();
        

//        Alumne alumne = new Alumne("53765476A", "Cacahuete", "Salado", "CacahueteSalado@concascara.com", 658745214, null);
//        ac.afegir(alumne);
//        ac.cerrarConexion();
//        
//        Familia familia = new Familia(1L, "Familia prueba");
//        fc.afegir(familia);
//        fc.cerrarConexion();
//
//        Cicle cicle = new Cicle(1L, "cicle prueba", "Superior", fc.Buscar(1L));
//        cicleC.afegir(cicle);
//        cicleC.cerrarConexion();
//        
//        Curs curs = new Curs(1L, EnumCurso.PRIMERO, cicleC.buscar(1L));
//        cursC.afegir(curs);
//        cursC.cerrarConexion();
//        
//        Modul modul = new Modul(1L, "modul prueba", cicleC.buscar(1L));
//        mc.afegir(modul);
//        mc.cerrarConexion();
//        
//        UnitatFormativa uf = new UnitatFormativa(1L, "unitat proba", 99, cursC.buscarPerNom(EnumCurso.PRIMERO), mc.buscarPerNom("modul prueba"), null);
//        ufc.afegir(uf);
//        ufc.cerrarConexion();

        Import importe = new Import(1L, "400€");
        Matricula matricula = new Matricula(5L, ac.buscarPerNom("Cacahuete"), "25/04/2017", EnumModalidad.UF_SUELTAS, EnumDescompte.TODO, importe);
        matriculaC.afegir(matricula);
        matriculaC.cerrarConexion();
//        
        
//        Alumne alModificar = ac.buscarPerNom("Cacahuete");
//        alModificar.setMatriculaAlumne(matriculaC.buscarPerAlumne(alModificar));
//        ac.modificar(alModificar);
//        ac.cerrarConexion();
//        
//        UnitatFormativa ufModificar = ufc.buscarPerNom("unitat proba");
//        ufModificar.setIdMatricula(matriculaC.buscarPerAlumne(alModificar));
//        ufc.modificar(ufModificar);
//        ufc.cerrarConexion();





//########################### Busquedas ###############################//

//        //Obtenemos el alumno por nombre y lo mostramos por pantalla
//        Alumne al = ac.buscarPerNom("Cacahuete");
//        System.out.println(al.toString());
//        ac.cerrarConexion();
//        
//        //Obtenemos la familia por id y la mostramos por pantalla
//        Familia fa = fc.Buscar(1L);
//        System.out.println(fa.toString());
//        System.out.println(fa.getCicles().toString());
//        fc.cerrarConexion();
//
//        //Obtenemos el ciclo por id y lo mostramos por pantalla
//        Cicle cic = cicleC.buscar(1L);
//        System.out.println(cic.toString());
//        System.out.println(cic.getCursos().toString());
//        cicleC.cerrarConexion();
//
//        //Obtenemos el curso por id y lo mostramos por pantalla
//        Curs cur = cursC.buscarPerNom(EnumCurso.PRIMERO);
//        System.out.println(cur.toString());
        
        
            
            
            
        
    }
    
}
