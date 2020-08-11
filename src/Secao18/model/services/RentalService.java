package Secao18.model.services;

import Secao18.model.entities.CarRental;
import Secao18.model.entities.Invoice;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();//Data de início com Milisegundos
        long t2 = carRental.getFinish().getTime();//Data de fim com Milisegundos
        double hours = (double) (t2 - t1) / 1000 / 60 / 60;//Faz a subtração e transforma em horas
        double basicPayment;

        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour; //Math.ceil arredonda pra cima
        } else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}