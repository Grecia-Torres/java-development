package com.pluralsight.week6;

public class Moped extends Vehicle {
    private String hasBasket;

    public String getHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(String hasBasket) {
        this.hasBasket = hasBasket;
    }

    Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String hasBasket) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hasBasket = hasBasket;
    }
}
