package dao;

import entities.Film;
import helper.EntityManagerFactoryHelper;

import javax.persistence.EntityManager;
import java.util.List;

public class FilmDao {

    public void addFilm(Film film) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(film.getRezyser());
        em.persist(film);
        em.getTransaction().commit();
    }

    public List<Film> getAllFilms() {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        return (List<Film>)em.createQuery("from Film order by tytul").getResultList();
    }

}
