package com.pluralsight.week5;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private static ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
