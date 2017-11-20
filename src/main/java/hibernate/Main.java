package hibernate;

import hibernate.entities.Client;
import org.hibernate.*;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    private static HibernateUtil hibernateUtil = new HibernateUtil();

    public static void main(final String[] args) throws Exception {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from client");
            List<Client> list = query.list();
            for (Client o: list) {
                System.out.println(o.getFirstName());
            }
        } finally {
            session.close();
        }
    }
}
