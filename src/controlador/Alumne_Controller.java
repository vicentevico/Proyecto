/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaces.AlumneDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import modelo.Alumne;

/**
 *
 * @author ALUMNEDAM
 */
public class Alumne_Controller implements AlumneDAO{

    @Override
    public Alumne buscarPerNom(String nom) {
        // Recupera el entity manager
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Alumne.CONSULTA_NOM,Alumne.class);
        query.setParameter("nom", nom);
        Alumne a = (Alumne) query.getSingleResult();

        System.out.println("close");
        em.close();

        return a;
    }

    @Override
    public Alumne buscarPerCognom(String cognom) {
        // Recupera el entity manager
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Alumne.CONSULTA_COGNOM,Alumne.class);
        query.setParameter("nom", cognom);
        Alumne a = (Alumne) query.getSingleResult();

        System.out.println("close");
        em.close();

        return a;
    }

    @Override
    public List<Alumne> buscarTots() {
        // Recupera el entity manager
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Consulta");
        //List<Client> lista = (List<Client>) em.createQuery("FROM Client").getResultList();
        Query a = em.createQuery("FROM Alumne");
        List<Alumne> lista = (List<Alumne>) a.getResultList();
        

        System.out.println("close");
        em.close();
        
        return lista;
    }

    @Override
    public void afegir(Alumne t) {
        // Recupera el entity manager
        EM_Controller oem = new EM_Controller();
        EntityManager em = oem.getEntityManager();

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
    public void eliminar(Alumne t) {
        // Recupera el entity manager
        EM_Controller oem = new EM_Controller();
        EntityManager em = oem.getEntityManager();

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
    public void modificar(Alumne t) {
        // Recupera el entity manager
        EM_Controller oem = new EM_Controller();
        EntityManager em = oem.getEntityManager();

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
    
}
