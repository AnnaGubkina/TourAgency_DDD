package model.valueobjects;

import java.util.Date;

public class AirTicket {

    private final int code;
    private final String country;
    private final String city;
    private final Date departureDate;
    private final int price;

    public AirTicket(int code, String country, String city, Date departureDate, int price) {
        this.code = code;
        this.country = country;
        this.city = city;
        this.departureDate = departureDate;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public int getPrice() {
        return price;
    }
}
