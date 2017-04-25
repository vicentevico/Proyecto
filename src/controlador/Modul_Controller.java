/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaces.ModulDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import modelo.Modul;
import modelo.UnitatFormativa;

/**
 *
 * @author Vicente
 */
public class Modul_Controller implements ModulDAO{
    EntityManager em;
    
    @Override
    public Modul buscarPerNom(String nombre) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Modul.CONSULTA,Modul.class);
        query.setParameter("nombre", nombre);
        Modul m = (Modul) query.getSingleResult();

        System.out.println("close");
        em.close();

        return m;
    }

    @Override
    public void afegir(Modul t) {
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
    public void eliminar(Modul t) {
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
    public void modificar(Modul t) {
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
    
    public void cerrarConexion(){
        em.close();
    }
    
}
