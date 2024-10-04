package com.pluralsight.week2;

import java.util.Scanner;

public class CellPhoneApplication {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        System.out.println("What is the serial number? ");
        int serialNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("What model is the phone? ");
        String model = scanner.nextLine();

        System.out.println("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        CellPhone cellPhone = new CellPhone();


        System.out.println("Enter a number to dial: ");
        String numberToDial = scanner.nextLine();
        cellPhone.dial(numberToDial);

        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setModel(model);
        cellPhone.setCarrier(carrier);
        cellPhone.setPhoneNumber(phoneNumber);
        cellPhone.setOwner(owner);

        System.out.println("\nPhone Details: ");
        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        scanner.close();;

    }
    public static void display(cellPhone phone) {
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());
    }


}
