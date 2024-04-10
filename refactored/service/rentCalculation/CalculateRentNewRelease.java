package refactored.service.rentCalculation;

import refactored.model.customer.Customer;
import refactored.model.film.Film;
import refactored.model.rental.Rental;

class CalculateRentNewRelease implements RentCalculation {
    @Override
    public Rental calculateRent(Rental rental, Customer customer) {
        if (rental.getFilm().getPriceCode() == Film.MovieType.NEW_RELEASE) {
            double rentalCost = rental.getDaysRented() * 3;
            rental.setRentalCost(rentalCost);
            int bonusPoints = 0;
            if (rental.getDaysRented() > 1) {
                bonusPoints++;
                bonusPoints += customer.getFrequentRenterPoints();
                customer.setFrequentRenterPoints(bonusPoints);
            }
            return rental;
        } else {
            System.out.println("You're using the wrong calculator it seems");
            return null;
        }
    }
}
