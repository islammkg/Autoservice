package jdbc;

import jdbc.entities.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataReader dataReader = new DataReader();

        System.out.print("Input first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Input last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Input address: ");
        String address = scanner.nextLine();
        System.out.print("Input phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println();

        dataReader.insert(new Client(firstName, lastName, address, phoneNumber));

        dataReader.readData();
        dataReader.print();
    }
}
