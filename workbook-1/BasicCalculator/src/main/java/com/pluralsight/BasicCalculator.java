package com.pluralsight;

import java.util.*;

public class BasicCalculator {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = numInput("Enter the first number: ");
        int num2 = numInput("Enter the second number: ");

        String operation = getOperation("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option: ");
    }
    private static int numInput(String message) {
        System.out.print(message);
        int output = myScanner.nextInt();
        myScanner.nextLine();
        return output;

    }
    private static String getOperation(String message) {
        System.out.print(message);
        return myScanner.nextLine();
    }

public static void displayResult(int num1, int num2, int result, String operation) {
        switch (operation) {
            case "A":
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "S":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "M":
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "D":
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;


        }
    }
}
