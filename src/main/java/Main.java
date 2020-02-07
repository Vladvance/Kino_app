import dao.*;
import entities.*;
import org.hibernate.exception.ConstraintViolationException;

import javax.persistence.RollbackException;

public class Main {

    public static void main(String[] args) {
        FilmDao filmDao = new FilmDao();
        SalaDao salaDao = new SalaDao();
        KinoDao kinoDao = new KinoDao();
        KlientDao klientDao = new KlientDao();
        PromocjaDao promocjaDao = new PromocjaDao();
        RezyserDao rezyserDao = new RezyserDao();
        ZamowienieDao zamowienieDao = new ZamowienieDao();


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

        //DODAWANIE KLIENTA DZIAŁA
//        try {
//            Klient klient = new Klient();
//            klient.setAdresEmail("elsa@wp.pl");
//            klient.setIdKlienta(123);
//            klient.setImie("Elsaa");
//            klient.setNazwisko("Aaaarendelleee");
//            klient.setNrTelefonu("982398238");
//            klientDao.addKlient(klient);
//
//
//            System.out.println("New klient added: " + klient.getImie());
//        } catch(RollbackException e) {
//            System.out.println("Kino already exists");
//        }

        //USUWANIE KLIENTA DZIAŁA
//        try{
//            klientDao.deleteKlient(123);
//        } catch (Exception e){
//            System.out.println("Nie ma takiego klienta");
//        }

        //DODAWANIE PROMOCJI DZIAŁA
//        try {
//            Promocja promocja = new Promocja();
//            promocja.setIdProm(222);
//            promocja.setObnizka(14);
//            promocja.setRodzajProm("Na wiosne");
//            promocjaDao.addPromocja(promocja);
//
//
//            System.out.println("New promocja added: " + promocja);
//        } catch(RollbackException e) {
//            System.out.println("Promocja already exists");
//        }

        //USUWANIE PROMOCJI DZIAŁA
//        try{
//            promocjaDao.deletePromocja(111);
//        } catch (Exception e){
//            System.out.println("Nie ma takiej promocji");
//        }

        //DODAWANIE REZYSERA DZIAŁA
//        try {
//            Rezyser rezyser = new Rezyser();
//            rezyser.setImie("Makrela");
//            rezyser.setNazwisko("Makarena");
//            rezyserDao.addRezyser(rezyser);
//
//
//            System.out.println("New rezyser added: " + rezyser);
//        } catch(RollbackException e) {
//            System.out.println("Rezyser already exists");
//        }

        //USUWANIE REZYSERA DZIAŁA
//        try{
//            rezyserDao.deleteRezyser("Makrela", "Makarena");
//        } catch (Exception e){
//            System.out.println("Nie ma takiego rezysera");
//        }

        //DODAWANIE ZAMOWIENIA DZIAŁA
//        try {
//            Zamowienie zamowienie = new Zamowienie();
//            zamowienie.setKlientIdKlienta(3445);
//            zamowienie.setNrZamowienia(12);
//            zamowienieDao.addZamowienie(zamowienie);
//
//
//            System.out.println("New zamowienie added: " + zamowienie);
//        } catch(RollbackException e) {
//            System.out.println("Zamowienie already exists");
//        }

        //USUWANIE ZAMOWIENIA DZIAŁA
//        try{
//            zamowienieDao.deleteZamowienie(12);
//        } catch (Exception e){
//            System.out.println("Nie ma takiego zamowienia");
//        }




    }


}