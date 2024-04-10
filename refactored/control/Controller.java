package refactored.control;

import refactored.model.customer.Customer;
import refactored.model.film.Film;
import refactored.model.rental.Rental;
import refactored.service.Utility;
import refactored.service.rentCalculation.CalculatorFactory;
import refactored.view.ConsoleReader;
import refactored.view.OutputFactory;

public class Controller {

    public void run () {
        OutputFactory.createOutput("").printMenu();
        OutputFactory.createOutput(ConsoleReader.readAndReturnString());
        Film terminator = new Film.Builder("Terminator", Film.MovieType.NEW_RELEASE)
                .filmGenre("Scy-fy, Action")
                .countryOfOrigin("USA")
                .actors("Big Arny")
                .description("I'll be back")
                .build();
        Customer customer = Utility.createCustomer(ConsoleReader.readAndReturnString());
        Utility.addRentalsToCustomer(customer, CalculatorFactory.createCalculator(terminator)
                .calculateRent(new Rental(terminator, ConsoleReader.readAndReturnInt()), customer));
        OutputFactory.createOutput("").printCustomer(customer);
    }
}
