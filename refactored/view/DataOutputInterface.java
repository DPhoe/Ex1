package refactored.view;

import refactored.model.customer.Customer;
import refactored.model.film.Film;
import refactored.model.rental.Rental;

public interface DataOutputInterface {
    default void printMenu () {
        System.out.println("""
                This menu is a subject to change
                Please contact someone for something
                It's just a placeholder really
                """);
    }

    void printCustomer(Customer customer);

    void printFilm(Film film);

    void printRental(Rental rental);
}
