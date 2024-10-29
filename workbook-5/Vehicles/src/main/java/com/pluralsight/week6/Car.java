package com.pluralsight.week6;

public class Car extends Vehicle {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String model) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.model = model;
    }
}
