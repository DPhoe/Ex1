package refactored.service;

import refactored.model.customer.Customer;
import refactored.model.film.Film;
import refactored.model.rental.Rental;

public class Utility {

    public static Rental createNewRental (Film film, int daysRented) {
        return new Rental(film, daysRented);
    }
    public static void addRentalsToCustomer (Customer customer, Rental rental) {
        customer.getRentals().add(rental);
    }

    public static Customer createCustomer (String string) {
        return new Customer(string);
    }
}
