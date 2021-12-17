package model.valueobjects;
import java.util.Date;

public class Tour {

    private final int code;
    private final String country;
    private final String city;
    private final String hotel;
    private final String insurance;
    private final String ticket;
    private final String tourOperator;
    private final int price;
    private final Date startDate;
    private final Date finishDate;

    public Tour(int code, String country, String city, String hotel, String insurance, String tourOperator, int price, Date startDate, Date finishDate,String ticket ) {
        this.code = code;
        this.country = country;
        this.city = city;
        this.hotel = hotel;
        this.insurance = insurance;
        this.tourOperator = tourOperator;
        this.price = price;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.ticket = ticket;
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

    public String getHotel() {
        return hotel;
    }

    public String getInsurance() {
        return insurance;
    }

    public String getTourOperator() {
        return tourOperator;
    }

    public int getPrice() {
        return price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public String getTicket() {
        return ticket;
    }
}
