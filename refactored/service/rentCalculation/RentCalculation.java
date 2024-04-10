package refactored.service.rentCalculation;

import refactored.model.customer.Customer;
import refactored.model.rental.Rental;

public interface RentCalculation {
    public Rental calculateRent(Rental rental, Customer customer);
}
