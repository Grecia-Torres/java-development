package com.pluralsight.week6;

public class SemiTruck extends Vehicle {
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String company) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.company = company;
    }
}
