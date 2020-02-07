import dao.FilmDao;
import dao.KinoDao;
import dao.SalaDao;
import entities.Film;
import entities.Kino;
import entities.Rezyser;
import entities.Sala;
import org.hibernate.exception.ConstraintViolationException;

import javax.persistence.RollbackException;

public class Main {

    public static void main(String[] args) {
        FilmDao filmDao = new FilmDao();
        SalaDao salaDao = new SalaDao();
        KinoDao kinoDao = new KinoDao();

//        try {
//            Film film = new Film();
//            film.setTytul("TestGabi");
//            film.setRokProdukcji("2020");
//            film.setDlugosc("123");
//            Rezyser rezyser = new Rezyser();
//            rezyser.setNazwisko("Hebebebe");
//            rezyser.setImie("Halyna");
//            film.setRezyser(rezyser);
//            filmDao.addFilm(film);
//            System.out.println("New film added: " + film);
//        } catch(RollbackException e) {
//            System.out.println("Film already exists");
//        }

//        try{
//            filmDao.deleteFilm("TestGabi", "2020");
//        } catch (Exception e){
//            System.out.println("Nie ma takiego filmu");
//        }

        //DODAWANIE KINA DZIAŁA
//        Kino kino = new Kino();
//
//        try {
//
//            kino.setAdres("Aaaaa");
//            kino.setNazwa("Naazwaa");
//            kinoDao.addKino(kino);
//
//
//            System.out.println("New kino added: " + kino);
//        } catch(RollbackException e) {
//            System.out.println("Kino already exists");
//        }

        //DODAWANIE SALI DZIAŁA
//        try {
//            Kino kino = new Kino();
//            kino.setAdres("Aaaaa");
//            kino.setNazwa("Naazwaa");
//            Sala sala = new Sala();
//            sala.setNrSali(12);
//            sala.setLiczbaMiejsc((byte) 25);
//            sala.setKinoByKinoNazwa(kino);
//            String nazwa = kino.getNazwa();
//            sala.setKinoNazwa(nazwa);
//
//            salaDao.addSala(sala);
//            System.out.println("New sala added: " + sala);
//        } catch(RollbackException e) {
//            System.out.println("Sala already exists");
//        }

        //USUWANIE KINA DZIAŁA
//        try{
//            kinoDao.deleteKino("Naazwaa");
//        } catch (Exception e){
//            System.out.println("Nie ma takiego kina");
//        }

        //USUWANIE SALI DZIAŁA
//        try{
//            salaDao.deleteSala(12, "Naazwaa");
//        } catch (Exception e){
//            System.out.println("Nie ma takiego kina");
//        }


    }


}