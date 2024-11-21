package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable e) {
            System.out.println("Initial Session Factory Creation Failed: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void testConnection() {
        try(Session session = getSessionFactory().openSession()) {
            System.out.println("Connection Established");
        }catch(Exception e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
}
