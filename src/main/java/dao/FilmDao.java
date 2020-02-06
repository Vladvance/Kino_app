package dao;

import entities.Film;
import helper.EntityManagerFactoryHelper;

import javax.persistence.EntityManager;

public class FilmDao {


    public void addFilm(Film film) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(film.getRezyser());
        em.persist(film);
        em.getTransaction().commit();

    }

//    public List<FilmEntity> getAllFilms() {
//        return (List<FilmEntity>)entityManager.createQuery("from FilmEntity order by tytul").getResultList();
//    }

}
