package com.pluralsight;

import java.util.*;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal loan amount: ");
        double principalLoan = scanner.nextDouble();

        System.out.print("Enter the interest rate on your loan: ");
        double interestRate = scanner.nextDouble();
        double interestRateFinal = interestRate / 100 / 12;

        System.out.print("Enter the loan length: ");
        int loanLength = scanner.nextInt();
        int loanLengthFinal = loanLength * 12;

        double monthlyPayment = monthlyPayment(principalLoan, interestRateFinal, loanLengthFinal);
        System.out.printf("Your monthly payment is: $%.2f\n", monthlyPayment);

        double totalInterest = (monthlyPayment * loanLengthFinal) - principalLoan;
        System.out.printf("Your total interest is: $%,.2f\n", totalInterest);

        scanner.close();

    }

    public static double monthlyPayment(double principalLoan, double interestRateFinal, int loanLengthFinal) {
        return principalLoan * (interestRateFinal * Math.pow(1 + interestRateFinal, loanLengthFinal)) /
                (Math.pow(1 + interestRateFinal, loanLengthFinal) - 1);

    }
}



