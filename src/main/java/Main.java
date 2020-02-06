import dao.FilmDao;
import entities.Film;
import entities.Rezyser;

public class Main {

    public static void main(String[] args) {
        FilmDao filmDao = new FilmDao();

        Film film = new Film();
        film.setTytul("TestFilm");
        film.setRokProdukcji("2000");
        film.setDlugosc("H20M1");
        Rezyser rezyser = new Rezyser();
        rezyser.setNazwisko("Hlushchenko");
        rezyser.setImie("Vladyslav");
        film.setRezyser(rezyser);
        filmDao.addFilm(film);
        System.out.println("New film added");
    }


}