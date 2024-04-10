package refactored.service.rentCalculation;

import refactored.model.customer.Customer;
import refactored.model.film.Film;
import refactored.model.rental.Rental;

class CalculateRentChildren implements RentCalculation {
    @Override
    public Rental calculateRent(Rental rental, Customer customer) {
        if (rental.getFilm().getPriceCode() == Film.MovieType.CHILDREN) {
            double rentalCost = 1.5;
            if (rental.getDaysRented() > 3) {
                rentalCost += (rental.getDaysRented() - 3) * 1.5;
                rental.setRentalCost(rentalCost);
            } else {
                rental.setRentalCost(rentalCost);
            }
            return rental;
        } else {
            System.out.println("You're using the wrong calculator it seems");
            return null;
        }
    }
}
