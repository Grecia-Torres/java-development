package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String employeeName = scanner.nextLine();

        System.out.print("How many hours have you worked? ");
        float hoursWorked = scanner.nextInt();

        System.out.print("What is your pay rate? ");
        float payRate = scanner.nextInt();

        float grossPay = hoursWorked * payRate;

        System.out.println(employeeName + "'s" + " Gross Pay is " + grossPay );

        scanner.close();
    }

}

