/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Excepciones.NullAlumneException;
import Excepciones.NullCicleException;
import controlador.Alumne_Controller;
import controlador.Cicle_Controller;
import controlador.Curs_Controller;
import controlador.Familia_Controller;
import controlador.Matricula_Controller;
import controlador.Modul_Controller;
import controlador.UnitatFormativa_Controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
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
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
//        SELECT * FROM AV_UNITATS_FORMATIVES;
//        SELECT * FROM AV_ALUMNES;
//        SELECT * FROM AV_CURSOS;
//        SELECT * FROM AV_MODULS;
//        SELECT * FROM AV_CICLES;
//        SELECT * FROM AV_FAMILIES;
//        
//        
//        DROP TABLE AV_UNITATS_FORMATIVES;
//        DROP TABLE AV_CURSOS;
//        DROP TABLE AV_MODULS;
//        DROP TABLE AV_CICLES;
//        DROP TABLE AV_FAMILIES;
//        DROP TABLE AV_ALUMNES;

        
        
        Alumne_Controller ac = new Alumne_Controller();
        Familia_Controller fc = new Familia_Controller();
        Cicle_Controller cicleC = new Cicle_Controller();
        Curs_Controller cursC = new Curs_Controller();
        Modul_Controller mc = new Modul_Controller();
        UnitatFormativa_Controller ufc = new UnitatFormativa_Controller();
        Matricula_Controller matriculaC = new Matricula_Controller();
        
            //Comentado porque JOJE ha dicho que lo quite ya que peta
//            LogManager.getLogManager().readConfiguration(new FileInputStream("./log.properties"));

//################ Creacion de objetos ##################
//        Alumne alumne = new Alumne("53765376A", "Cacahuete", "Salado", "CacahueteSalado@concascara.com", 658745214, null);
//        ac.afegir(alumne);
//        ac.cerrarConexion();
//        
//        Familia familia = new Familia(2L, "Familia prueba");
//        fc.afegir(familia);
//        fc.cerrarConexion();
//
//        Cicle cicle = new Cicle(2L, "cicle prueba", "Superior", fc.Buscar(2L));
//        cicleC.afegir(cicle);
//        cicleC.cerrarConexion();
//        
//        Curs curs = new Curs(3L, EnumCurso.SEGUNDO, cicleC.buscar(2L));
//        cursC.afegir(curs);
//        cursC.cerrarConexion();
//        
//        Modul modul = new Modul(2L, "modul prueba", cicleC.buscar(2L));
//        mc.afegir(modul);
//        mc.cerrarConexion();
//        
//        UnitatFormativa uf = new UnitatFormativa(2L, "unitat proba", 99, cursC.buscarPerNom(EnumCurso.PRIMERO), mc.buscarPerNom("modul prueba"));
//        ufc.afegir(uf);
//        ufc.cerrarConexion();
//
//        Import importe = new Import(2L, "400€");
//        ArrayList<UnitatFormativa> listaUF = new ArrayList<UnitatFormativa>();
//        listaUF.add(ufc.buscarPerNom("unitat proba"));
//        Matricula matricula = new Matricula(3L, ac.buscarPerNom("Cacahuete"), "25/04/2017", EnumModalidad.UF_SUELTAS, EnumDescompte.TODO, importe);
//        matriculaC.afegir(matricula);
//        matriculaC.cerrarConexion();
//        ac.cerrarConexion();

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

        //
        matriculaC.imprimirLista(matriculaC.buscarAlumnesPerUF(ufc.buscarPerNom("unitat proba")));
        matriculaC.cerrarConexion();

//#################### Excepciones   ########################
//        try {
//            Alumne alu = new Alumne("33", "VA", "ca2", "asd@ads.com", 935602452, null);
//            Cicle ciclo = new Cicle(11L, "Prueba exception", "", null);
//        } catch (NullAlumneException naex){
//            Logger.getLogger("Alumne Exception").log(Level.SEVERE, naex.getMessage(), naex);
//        } catch (NullCicleException ncex) {
//            Logger.getLogger(lanzadorVVP.class.getName()).log(Level.SEVERE, ncex.getMessage(), ncex);
//        }finally{
//            Logger.getLogger(lanzadorVVP.class.getName()).log(Level.WARNING, "objetos a crear no validos");
//        }
    }
}
