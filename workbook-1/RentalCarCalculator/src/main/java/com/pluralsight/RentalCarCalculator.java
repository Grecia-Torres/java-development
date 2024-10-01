package com.pluralsight;

import java.util.*;

//In this exercise you will create a CLI application for a rental car company. You
//will prompt the user to answer questions about their selected options and then
//calculate the cost of the rental.
//You are not required to use only switch statements in this exercise. You can
//choose to use if/else or switch statements as you deem appropriate.
//EXERCISE 1
//Step 1
//Create a Java application named RentalCarCalculator that estimates the cost of
//reserving a rental car. Prompt the user for the following information:
//- pickup date (store as a string)
//- number of days for the rental
//- whether they want an electronic toll tag at $3.95/day (yes/no)
//- whether they want a GPS at $2.95/day (yes/no)
//- whether they want roadside assistance at $3.95/day (yes/no)
//- their current age

public class RentalCarCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double = 29.99;
        double =

        System.out.print("Hello and Welcome! What day would you like to reserve your rental car? ");
        String getDate = scanner.nextLine();

        System.out.print("How many days would you like to rent the car for? ");
        int totalDays = scanner.nextInt();

        System.out.print("Would you like to add an electronic toll tag for an additional charge of $3.95 a day? (yes/no): ");
        String electronicTag = scanner.next();

        System.out.print("Would you like to add a GPS for an additional charge of $2.95 a day? (yes/no): ");
        String addGPS = scanner.next();

        System.out.print("Would you like to add roadside assistance for an additional charge of $3.95 a day? (yes/no): ");
        String roadsideAssistance = scanner.next();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if (electronicTag.equals("yes")) {
            addedCost += 3.95f;
        }
        if (addGPS.equals("yes")) {
            addedCost += 2.95f;
        }
        if (roadsideAssistance.equals("yes")) {
            addedCost += 3.95f;
        }
        if (age < 25) {
            totalCost *= 1.3f;
        }
        totalCost = (totalCost + addedCost)

    }
}
