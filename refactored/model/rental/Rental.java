package refactored.model.rental;

import refactored.model.film.Film;

public class Rental {

    private static int lastID = 0;

    private int id;
    private final Film film;
    private final int daysRented;

    private double rentalCost;

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public Rental(Film film, int daysRented) {
        this.film = film;
        this.daysRented = daysRented;
        this.id = ++lastID;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Film getFilm() {
        return film;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", film=" + film +
                ", daysRented=" + daysRented +
                ", rentalCost=" + rentalCost +
                '}';
    }
}
