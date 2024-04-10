package refactored.service.rentCalculation;

import refactored.model.film.Film;

public abstract class CalculatorFactory implements RentCalculation {
    public static RentCalculation createCalculator (Film film) {
        return switch (film.getPriceCode()) {
            case NEW_RELEASE -> new CalculateRentNewRelease();
            case CHILDREN -> new CalculateRentChildren();
            default -> null;
        };
    }
}
