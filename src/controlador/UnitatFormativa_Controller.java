/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaces.UnitatFormativaDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import modelo.UnitatFormativa;

/**
 *
 * @author Vicente
 */
public class UnitatFormativa_Controller implements UnitatFormativaDAO{
    EntityManager em;
    
    @Override
    public void afegir(UnitatFormativa t) {
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
    }

    @Override
    public void eliminar(UnitatFormativa t) {
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
    public void modificar(UnitatFormativa t) {
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

    @Override
    public UnitatFormativa buscarPerNom(String nomUnitatFormativa) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(UnitatFormativa.CONSULTA,UnitatFormativa.class);
        query.setParameter("nomUnitatFormativa", nomUnitatFormativa);
        UnitatFormativa uf = (UnitatFormativa) query.getSingleResult();

        return uf;
    }
    
    public void cerrarConexion(){
        em.close();
    }
    
}
