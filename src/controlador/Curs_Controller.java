/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaces.CursDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import modelo.Curs;
import utilidades.EnumCurso;

/**
 *
 * @author Vicente
 */
public class Curs_Controller implements CursDAO{
    EntityManager em; 
    
    @Override
    public void afegir(Curs t) {
        // Recupera el entity manager
        EM_Controller oem = new EM_Controller();
        em = oem.getEntityManager();

        // El persistim a la base de dades
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("persist");
        em.persist(t);

        System.out.println("commit");
        etx.commit();

        System.out.println("close");
        em.close();
    }

    @Override
    public void eliminar(Curs t) {
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

        System.out.println("close");
        em.close();
    }

    @Override
    public void modificar(Curs t) {
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

        System.out.println("close");
        em.close();
    }
    
    @Override
    public Curs buscarPerNom(EnumCurso nombreCurso) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Curs.CONSULTA,Curs.class);
        query.setParameter("nombreCurso", nombreCurso);
        Curs c = (Curs) query.getSingleResult();

        System.out.println("close");
        em.close();

        return c;
    }
    
    public void cerrarConexion(){
        em.close();
    }
}
