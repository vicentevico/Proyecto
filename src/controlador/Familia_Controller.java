/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaces.FamiliaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import modelo.Familia;

/**
 *
 * @author ALUMNEDAM
 */
public class Familia_Controller implements FamiliaDAO{
    EntityManager em;

    @Override
    public List<Familia> buscarFamiliaPerNomCicle(String nomCicle) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Familia.CONSULTA_FAMILA,Familia.class);
        query.setParameter("cicles", nomCicle);
        List<Familia> lista = (List<Familia>) query.getResultList();

        System.out.println("close");
        em.close();

        return lista;
    }
    
    public Familia Buscar(Long id) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        
        Familia f = (Familia) em.find(Familia.class, id);

        System.out.println("close");
        em.close();

        return f;
    }

    @Override
    public void afegir(Familia t) {
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

        System.out.println("close");
        em.close();
    }

    @Override
    public void eliminar(Familia t) {
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
    public void modificar(Familia t) {
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
