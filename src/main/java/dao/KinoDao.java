package dao;

import entities.Kino;
import helper.EntityManagerFactoryHelper;

import javax.persistence.EntityManager;

public class KinoDao {

    public void addKino(Kino kino) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(kino);
        em.getTransaction().commit();
    }

    public void deleteKino(String nazwa) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        Kino kino = em.find(Kino.class, nazwa);
        em.getTransaction().begin();
        em.remove(kino);
        em.getTransaction().commit();

    }
}
