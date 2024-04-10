package refactored.view;

import refactored.model.customer.Customer;
import refactored.model.film.Film;
import refactored.model.rental.Rental;

public class ConsoleOutput implements DataOutputInterface {

    @Override
    public void printCustomer(Customer customer) {
        System.out.println(customer);
    }

    @Override
    public void printFilm(Film film) {
        System.out.println(film);
    }

    @Override
    public void printRental(Rental rental) {
        System.out.println(rental);
    }
}
