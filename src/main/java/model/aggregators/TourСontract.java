package model.aggregators;
import model.entities.Manager;
import model.entities.Customer;
import model.valueobjects.Tour;
import java.util.Date;

public class TourСontract {

    private final int id;
    private Manager manager;
    private final Customer customer;
    private Date tourDateContract;
    private final Tour tour;


    public TourСontract(int id, Manager manager, Customer customer, Date tourDateContract, Tour tour) {
        this.id = id;
        this.manager = manager;
        this.customer = customer;
        this.tourDateContract = tourDateContract;
        this.tour = tour;
    }

    public int getId() {
        return id;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Customer getCustomer() {
        return customer;
    }


    public Date getTourDateContract() {
        return tourDateContract;
    }

    public void setTourDateContract(Date tourDateContract) {
        this.tourDateContract = tourDateContract;
    }

    public Tour getTour() {
        return tour;
    }
}
