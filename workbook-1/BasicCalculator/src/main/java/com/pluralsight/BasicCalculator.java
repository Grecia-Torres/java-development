package com.pluralsight;

import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter thr first number: ");
        int num1 = myScanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = myScanner.nextInt();

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option: ");

        String inputAnswer = myScanner.next();
        int result;

        switch(inputAnswer) {
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
                System.out.println(num1 + " / "  + num2 + " = " + result);
                break;

        }
        myScanner.close();

    }
}
