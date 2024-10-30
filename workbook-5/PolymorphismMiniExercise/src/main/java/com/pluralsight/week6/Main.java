package com.pluralsight.week6;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Square(4);
        Shape s3 = new Circle(8);

        s2.setColor("Forest Green");
        s3.setColor("Yellow Green");


        System.out.println("Square Color: " + s2.getColor());
        System.out.println("Area " + s2.calculateArea());
        System.out.println("Circumference " + s2.calculateCircumference());
        System.out.println("Circle Color: " + s3.getColor());
        System.out.println("Area: " + s3.calculateArea());
        System.out.println("Circumference: " + s3.calculateCircumference());
    }
}