package dao;

import entities.Klient;
import helper.EntityManagerFactoryHelper;

import javax.persistence.EntityManager;

public class KlientDao {

    public void addKlient(Klient klient) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(klient);
        em.getTransaction().commit();
    }

    public void deleteKlient(long id) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        Klient klient = em.find(Klient.class, id);
        em.getTransaction().begin();
        em.remove(klient);
        em.getTransaction().commit();

    }
}
