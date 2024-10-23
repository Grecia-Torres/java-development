package com.pluralsight.week5;

import static java.lang.Double.NaN;

public class SimpleCalculator {
    public static double addTwoNumbers(double x, double y) {
        return x + y;
    }

    public double divideByZero(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return x / y;
    }
}
