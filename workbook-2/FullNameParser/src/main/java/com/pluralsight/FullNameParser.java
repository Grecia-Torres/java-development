package com.pluralsight;

import java.util.*;

public class FullNameParser {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your first last or first middle last name:");
        String fullName = scanner.nextLine().trim();

        getFullName(fullName);
        scanner.close();
    }

    public static void getFullName(String fullName) {
        String[] allNames = fullName.split(" +");
        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if (allNames.length == 2) {
            firstName = allNames[0];
            lastName = allNames[1];
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
        } else if (allNames.length == 3) {
            firstName = allNames[0];
            middleName = allNames[1];
            lastName = allNames[2];
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
        }
    }

    }

