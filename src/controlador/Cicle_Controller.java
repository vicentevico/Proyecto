/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaces.CicleDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import modelo.Cicle;

/**
 *
 * @author ALUMNEDAM
 */
public class Cicle_Controller implements CicleDAO{
    EntityManager em;

    @Override
    public List<Cicle> buscarCiclesPerNomModul(String nomModul) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Cicle.CONSULTA_MODUL,Cicle.class);
        query.setParameter("moduls", nomModul);
        List<Cicle> lista = (List<Cicle>) query.getResultList();

        System.out.println("close");
        em.close();

        return lista;
    }
    
    public Cicle buscar(Long id) {
        // Recupera el entity manager
        em = new EM_Controller().getEntityManager();

        Cicle p = (Cicle) em.find(Cicle.class, id);

        System.out.println("close");

        return p;
    }

    @Override
    public void afegir(Cicle t) {
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
    public void eliminar(Cicle t) {
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
    public void modificar(Cicle t) {
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
