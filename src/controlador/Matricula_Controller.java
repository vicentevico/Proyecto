/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaces.MatriculaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import modelo.Alumne;
import modelo.Cicle;
import modelo.Curs;
import modelo.Familia;
import modelo.Matricula;
import modelo.UnitatFormativa;
import utilidades.EnumCurso;

/**
 *
 * @author ALUMNEDAM
 */
public class Matricula_Controller implements MatriculaDAO{
    EntityManager em;
    
    @Override
    public void afegir(Matricula t) {
        // Recupera el entity manager
        EM_Controller oem = new EM_Controller();
        em = oem.getEntityManager();

        // El persistim a la base de dades
        //em.getTransaction().begin();
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("persist");
        em.persist(t);

        System.out.println("commit");
        etx.commit();
    }

    @Override
    public void eliminar(Matricula t) {
        // Recupera el entity manager
        EM_Controller oem = new EM_Controller();
        em = oem.getEntityManager();

        // El persistim a la base de dades
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("remove");
        em.remove(em.contains(t) ? t : em.merge(t));

        System.out.println("commit");
        etx.commit();
    }

    @Override
    public void modificar(Matricula t) {
        // Recupera el entity manager
        EM_Controller oem = new EM_Controller();
        em = oem.getEntityManager();

        // El persistim a la base de dades
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("merge");
        em.merge(t);

        System.out.println("commit");
        etx.commit();
    }
    
    public void cerrarConexion(){
        em.close();
    }

    @Override
    public Matricula buscarPerAlumne(String nif) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.CONSULTA_MATRICULA,Matricula.class);
        query.setParameter("nif", nif);
        Matricula a = (Matricula) query.getSingleResult();

        return a;
    }

    @Override
    public List buscarAlumnesPerUF(UnitatFormativa uf) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.CONSULTA_ALUMNES_UF,Matricula.class);
        query.setParameter("uf", uf.getId());
        List<Matricula> lista = (List<Matricula>) query.getResultList();

        return lista;
    }

    @Override
    public List buscarAlumnePerCurs(Curs curs) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.CONSULTA_ALUMNES_CURS,Matricula.class);
        query.setParameter("uf", curs.getId());
        List<Matricula> lista = (List<Matricula>) query.getResultList();

        return lista;
    }

    @Override
    public List buscarAlumnePerCicle(Cicle cicle) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.CONSULTA_ALUMNES_CICLE,Matricula.class);
        query.setParameter("uf", cicle.getId());
        List<Matricula> lista = (List<Matricula>) query.getResultList();

        return lista;
    }

    @Override
    public List buscarAlumnePerFamilia(Familia familia) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.CONSULTA_ALUMNES_FAMILIA,Matricula.class);
        query.setParameter("uf", familia.getId());
        List<Matricula> lista = (List<Matricula>) query.getResultList();

        return lista;
    }
    
    public void imprimirLista(List<Matricula> lista) {
        System.out.println("Total de resultats= " + lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+1 + ". " + lista.get(i).getAlumne().getNom());
        }
    }
    
}
