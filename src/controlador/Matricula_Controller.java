/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaces.MatriculaDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import modelo.Alumne;
import modelo.Matricula;

/**
 *
 * @author ALUMNEDAM
 */
public class Matricula_Controller implements MatriculaDAO{
    EntityManager em;
    
    @Override
    public Matricula buscarPerAlumne(Alumne alumne) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.CONSULTA_MATRICULA,Matricula.class);
        query.setParameter("alumne", alumne);
        Matricula a = (Matricula) query.getSingleResult();

        return a;
    }

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
    
}
