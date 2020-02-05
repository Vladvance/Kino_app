import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import poli.PracownicyEntity;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {

    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch(Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session1 = getSession();
        final Session session2 = getSession();
        try {
            PracownicyEntity pracownik;

            Transaction tx = session1.beginTransaction();

            //jezeli chcemy wykorzystać sql, robimy to:
            Query q1 = session1.createQuery("from PracownicyEntity where idPrac=180L");
            q1.setCacheable(true);

            //jeżeli wynik = jedna wartość
            pracownik = (PracownicyEntity)q1.uniqueResult();
            //jeżeli wynik = lista wartości
            //List<PracownikEntity> pracownicy = q1.list();

            System.out.println(pracownik);

            Query q2 = session1.createQuery("select nazwisko, placaPod from PracownicyEntity where idPrac=180L");
            //jeśli pobieramy niepełny rekord, przechowujemy w Object[], każdy pozycja tablicy to pobrana kolumna
            Object[] o = (Object[])q2.uniqueResult();
            System.out.println(o[0] + " : " + o[2] );

            //jeżeli pobieramy cały rekord o podanym id:
            //pracownik = session1.get(PracownicyEntity.class, 180L);

            tx.commit();

        } finally {
            session1.close();
            session2.close();
        }
    }

    public void dodajPracownika(String nazwisko, long placa_pod) {
        Session session = ourSessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        //Tworzenie rekordu
        PracownicyEntity pracownik2 = new PracownicyEntity();
        pracownik2.setNazwisko(nazwisko);
        pracownik2.setPlacaPod(placa_pod);

        tx.commit();

    }

}