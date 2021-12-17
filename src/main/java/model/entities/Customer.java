package model.entities;

public class Customer {

    private final int id;
    private String name;
    private String surname;
    private int passportId;

    public Customer(int id, String name, String surname, int passportId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.passportId = passportId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }
}
