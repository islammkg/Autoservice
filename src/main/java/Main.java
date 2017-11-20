import entities.*;

public class Main {

    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        //dataReader.insert(new Client("Islam", "Manasov", "Suyumbaeva 1a", "+996558551023"));
        dataReader.readData();
        dataReader.print();
    }
}
