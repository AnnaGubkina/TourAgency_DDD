package model.entities;

import java.util.Date;

public class Manager {

    private final int id;
    private String name;
    private String surname;
    private int powerOfAttorney;
    private Date date;

    public Manager(int id, String name, String surname, int powerOfAttorney) {
        this.id = id;
        this.name = name;
        this.surname = surname;

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

    public int getPowerOfAttorney() {
        return powerOfAttorney;
    }

    public void setPowerOfAttorney(int powerOfAttorney) {
        this.powerOfAttorney = powerOfAttorney;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
