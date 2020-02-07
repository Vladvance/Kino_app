package dao;

import entities.Zamowienie;
import helper.EntityManagerFactoryHelper;

import javax.persistence.EntityManager;

public class ZamowienieDao {
    public void addZamowienie(Zamowienie zamowienie) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(zamowienie);
        em.getTransaction().commit();
    }

    public void deleteZamowienie(long id) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        Zamowienie zamowienie = em.find(Zamowienie.class, id);
        em.getTransaction().begin();
        em.remove(zamowienie);
        em.getTransaction().commit();

    }
}
