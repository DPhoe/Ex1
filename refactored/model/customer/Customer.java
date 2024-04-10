package refactored.model.customer;

import refactored.model.rental.Rental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static int lastID = 0;

    private int id;
    private final String name;

    private int frequentRenterPoints;

    private List<Rental> rentals = new ArrayList<>();

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    public void setFrequentRenterPoints(int frequentRenterPoints) {
        this.frequentRenterPoints = frequentRenterPoints;
    }

    public Customer(String name) {
        this.name = name;
        this.id = ++lastID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", frequentRenterPoints=" + frequentRenterPoints +
                ", rentals=" + rentals +
                '}';
    }
}
