package com.pluralsight.week6;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("red",4,55,100,"yes");
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getCargoCapacity());
        System.out.println(slowRide.getNumberOfPassengers());
        System.out.println(slowRide.getFuelCapacity());
        System.out.println(slowRide.getHasBasket());
    }
}