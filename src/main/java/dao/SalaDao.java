package dao;

import entities.Sala;
import entities.SalaPK;
import helper.EntityManagerFactoryHelper;

import javax.persistence.EntityManager;

public class SalaDao {

    public void addSala(Sala sala) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(sala.getKinoByKinoNazwa());
        em.persist(sala);
        em.getTransaction().commit();
    }

    public void deleteSala(long nrSali, String kinoNazwa) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        SalaPK salaPK = new SalaPK();
        salaPK.setNrSali(nrSali);
        salaPK.setKinoNazwa(kinoNazwa);
        Sala sala = em.find(Sala.class, salaPK);
        em.getTransaction().begin();
        em.remove(sala);
        em.getTransaction().commit();

    }

}
