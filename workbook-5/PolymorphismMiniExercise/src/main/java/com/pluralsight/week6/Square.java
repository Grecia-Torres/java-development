package com.pluralsight.week6;

public class Square extends Shape {
    private double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double calculateCircumference() {
        return 4 * sideSize;
    }

    @Override
    public double calculateArea() {
        return sideSize * sideSize;
    }
}