package com.pluralsight;

import java.util.*;

//EXERCISE 1
//Create a Java application named SandwichShop. This will be a point of sales
//application to calculate the cost of a sandwich.
//Step 1
//Prompt the user for the size of the sandwich (1 or 2):
//- 1: Regular: base price $5.45
//- 2: Large: base price $8.95
//Prompt the user for their age:
//- Student (17 years old or younger) — receive a 10% discount
//- Seniors (65 years old or older) — receive a 20% discount
//Display the cost of the sandwich to the screen

public class SandwichShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Did you get a regular sandwich or a large sandwich? ");

        double initialCost = 0.0;
        String chosenSize = scanner.nextLine();

        switch (chosenSize) {
            case "regular":
                initialCost = 5.45;
                break;
            case "large":
                initialCost = 8.95;
                break;
            default:
                System.out.println("That is not a valid option. Please choose regular or large: ");
                return;

        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double totalCost = initialCost * (1 - discount);
        System.out.printf("The total cost of your sandwich is going to be: $%.2f%n", totalCost);

        scanner.close();
    }


}

