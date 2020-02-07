package dao;

import entities.Promocja;
import helper.EntityManagerFactoryHelper;

import javax.persistence.EntityManager;

public class PromocjaDao {

    public void addPromocja(Promocja promocja) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(promocja);
        em.getTransaction().commit();
    }

    public void deletePromocja(long id) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        Promocja promocja = em.find(Promocja.class, id);
        em.getTransaction().begin();
        em.remove(promocja);
        em.getTransaction().commit();

    }
}
