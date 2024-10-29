package com.pluralsight.week6;

public class Hovercraft extends Vehicle {
    private String lifeJackets;

    public String getLifeJackets() {
        return lifeJackets;
    }

    public void setLifeJackets(String lifeJackets) {
        this.lifeJackets = lifeJackets;
    }

    Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String lifeJackets) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.lifeJackets = lifeJackets;
    }
}
