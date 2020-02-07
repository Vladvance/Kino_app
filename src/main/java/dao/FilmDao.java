package dao;

import entities.Film;
import entities.FilmPK;
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

    public void deleteFilm(String tytul, String rok) {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        FilmPK filmPK = new FilmPK();
        filmPK.setTytul(tytul);
        filmPK.setRokProdukcji(rok);
        Film film = em.find(Film.class, filmPK);
        em.getTransaction().begin();
        em.remove(film);
        em.getTransaction().commit();

    }

    public List<Film> getAllFilms() {
        EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
        return (List<Film>)em.createQuery("from Film order by tytul").getResultList();
    }

}
