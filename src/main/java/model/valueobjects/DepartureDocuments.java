package model.valueobjects;

public class DepartureDocuments {

    private final String city;
    private final String hotel;
    private final String insurance;
    private final String ticket;

    public DepartureDocuments(String city, String hotel, String insurance, String ticket) {
        this.city = city;
        this.hotel = hotel;
        this.insurance = insurance;
        this.ticket = ticket;
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

    public String getTicket() {
        return ticket;
    }
}
