package helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryHelper {

    private static EntityManagerFactory factory;

    static {
        try {
            factory = Persistence.createEntityManagerFactory("KinoPU");
        } catch(ExceptionInInitializerError e) {
            throw e;
        }
    }

    public static EntityManagerFactory getFactory() {
        return factory;
    }

}
