package Secao18.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Secao18.model.entities.CarRental;
import Secao18.model.entities.Vehicle;
import Secao18.model.services.BrazilTaxService;
import Secao18.model.services.RentalService;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data");
        System.out.println("Car model: ");
        String carModel = in.nextLine();
        System.out.println("Pickup (dd/MM/yyyy HH:ss): ");
        Date start = sdf.parse(in.nextLine());
        System.out.println("Return (dd/MM/yyyy HH:ss): ");
        Date finish = sdf.parse(in.nextLine());

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Enter price per hour: ");
        double pricePerHour = in.nextDouble();
        System.out.println("Enter price per day: ");
        double pricePerDay = in.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
    }

}