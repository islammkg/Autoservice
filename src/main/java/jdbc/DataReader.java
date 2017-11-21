package jdbc;

import jdbc.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private List<Address> addresses = new ArrayList<Address>();
    private List<Auto> autos = new ArrayList<Auto>();
    private List<Client> clients = new ArrayList<Client>();
    private List<Employer> employers = new ArrayList<Employer>();

    private final String url = "jdbc:mysql://localhost:3306/autoservice";
    private final String user = "root";
    private final String password = "";

    public DataReader () {}

    public void readData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM client");
            while (resultSet.next()) {
                clients.add(new Client(resultSet.getString("first_name"),
                                        resultSet.getString("last_name"),
                                        resultSet.getString("address"),
                                        resultSet.getString("phone_number")));
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }
    }

    public void read() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM client");
            while (resultSet.next()) {
                clients.add(new Client(resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("address"),
                        resultSet.getString("phone_number")));
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }
    }

    public void insert(Client client) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String query = "INSERT INTO client (first_name, last_name, address, phone_number) VALUES ('" + client.getFirstName() + "', '" + client.getLastName() +
                    "', '" + client.getAddress() + "', '" + client.getPhoneNumber() + "')";
            statement.executeUpdate(query);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }
    }

    public void print() {
        for (Client client: clients) {
            System.out.println("Name: " + client.getFirstName() + " " + client.getLastName());
            System.out.println("Address: " + client.getAddress());
            System.out.println("Phone number: " + client.getPhoneNumber());
            System.out.println();
        }
    }
}
