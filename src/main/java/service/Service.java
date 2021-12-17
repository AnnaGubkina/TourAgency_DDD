package service;
import model.aggregators.TourСontract;
import model.aggregators.BuyingProcess;
import model.valueobjects.DepartureDocuments;

public interface Service {

    //Осуществление процесса подбора и оформления тура
    TourСontract buyingTour(BuyingProcess process);

    //Осуществление процесса отправки документов туристам
    void sendDocuments (DepartureDocuments documents);


}
