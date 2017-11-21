package jdbc.entities;

public class Auto {
    private String model;
    private int year;
    private float capacity;
    private String stateNumber;
    private Client owner;

    public Auto (String model, String stateNumber, Client owner) {
        this.model = model;
        this.stateNumber = stateNumber;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public float getCapacity() {
        return capacity;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public Client getOwner() {
        return owner;
    }
}
