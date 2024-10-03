package com.pluralsight.week2;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder address = new StringBuilder();

        System.out.print("Please provide the following information:\n" + "Full name: ");
        address.append(scanner.nextLine()).append("\n\n");

        System.out.print("Enter Billing Street: ");
        address.append("Billing Address: \n").append(scanner.nextLine()).append("\n");

        System.out.print("Enter Billing City: ");
        address.append(scanner.nextLine()).append(", ");

        System.out.print("Enter Billing State: ");
        address.append(scanner.nextLine()).append(" ");;

        System.out.print("Enter Billing Zip: ");
        address.append(scanner.nextLine()).append(" ");
        address.append("\n\n");

        System.out.print("Enter Shipping Street: ");
        address.append("Shipping Address: \n").append(scanner.nextLine()).append("\n");;

        System.out.print("Enter Shipping City: ");
        address.append(scanner.nextLine()).append(", ");;

        System.out.print("Enter Shipping State: ");
        address.append(scanner.nextLine()).append(" ");

        System.out.print("Enter Shipping Zip: ");
        address.append(scanner.nextLine()).append(" ");

        String getAddress = address.toString();
        System.out.println(getAddress);

        scanner.close();
    }
}
