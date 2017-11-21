package hibernate;

import hibernate.entities.Address;
import hibernate.entities.Auto;
import hibernate.entities.Client;
import hibernate.entities.Employer;
import org.hibernate.*;

import java.util.List;

public class Main {
    private static HibernateUtil hibernateUtil = new HibernateUtil();

    public static void main(final String[] args) {
        Main m = new Main();
        System.out.println("Clients: ");
        m.getClients();
        System.out.println("Addresses of Service-Centers: ");
        m.getAddresses();
        System.out.println("Autos: ");
        m.getAutos();
        System.exit(0);
    }

    public void getClients() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Client> result = (List<Client>) session.createQuery("from Client").list();
            session.getTransaction().commit();
            for (Client c : result) {
                System.out.println("Name: " + c.getFirstName() + " " + c.getLastName());
                System.out.println("Address: " + c.getAddress());
                System.out.println("Mobile number: " + c.getPhoneNumber());
                System.out.println();
            }
        } finally {
            session.close();
        }
    }

    public void getAddresses() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Address> result = (List<Address>) session.createQuery("from Address").list();
            session.getTransaction().commit();
            for (Address a : result) {
                System.out.println(a.getPostcode() + " " + a.getCity() + ", " + a.getCity() + " " + a.getBuildingNumber());
                System.out.println(a.getPhoneNumber());
                System.out.println();
            }
        } finally {
            session.close();
        }
    }

    public void getAutos() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Auto> result = (List<Auto>) session.createQuery("from Auto").list();
            session.getTransaction().commit();
            for (Auto a : result) {
                System.out.println("Model: " + a.getModel() + ", Year: " + a.getYear());
                System.out.println("Capacity: " + a.getCapacity());
                System.out.println("State number: " + a.getStateNumber());
                System.out.println();
            }
        } finally {
            session.close();
        }
    }
}







