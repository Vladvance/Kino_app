package dao;

import entities.Rezyser;
import entities.RezyserPK;
import helper.EntityManagerFactoryHelper;

import javax.persistence.EntityManager;

public class RezyserDao {
    public void addRezyser(Rezyser rezyser) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(rezyser);
        em.getTransaction().commit();
    }

    public void deleteRezyser(String imie, String nazwisko) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        RezyserPK rezyserPK = new RezyserPK();
        rezyserPK.setImie(imie);
        rezyserPK.setNazwisko(nazwisko);
        Rezyser rezyser = em.find(Rezyser.class, rezyserPK);
        em.getTransaction().begin();
        em.remove(rezyser);
        em.getTransaction().commit();

    }
}
