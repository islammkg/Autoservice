package hibernate.entities;

import javax.persistence.*;

@Entity
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "client_id")
    private int clientId;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private int year;

    @Column(name = "capacity")
    private float capacity;

    @Column(name = "gov_num")
    private String stateNumber;

    public Auto () {}

    public Auto (int id, Client client, String model, String stateNumber) {
        this.id = id;
        this.clientId = client.getId();
        this.model = model;
        this.stateNumber = stateNumber;
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
}
