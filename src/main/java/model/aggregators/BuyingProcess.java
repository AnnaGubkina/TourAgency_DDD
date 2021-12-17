package model.aggregators;
import model.entities.Manager;
import model.entities.Customer;
import java.util.Date;

public class BuyingProcess {

    private Manager manager;
    private final Customer customer;
    private Date tourDateContract;



    public BuyingProcess(Manager manager, Customer customer, Date tourDateContract) {
        this.manager = manager;
        this.customer = customer;
        this.tourDateContract = tourDateContract;
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
}
