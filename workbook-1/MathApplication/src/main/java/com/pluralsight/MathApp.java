package com.pluralsight;


public class MathApp {
    public static void main(String[] args) {

        // Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine whose salary is greater using Math.max() and
        //store the answer in highestSalary. Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is ...")
        System.out.println("Question 1:");
        int bobSalary = 40000;
        int garySalary = 60000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want.
        System.out.println("Question 2:");
        double carPrice = 16000.00;
        double truckPrice = 22000.00;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest priced vehicle is "+ lowestPrice);

        // Find and display the area of a circle whose radius is 7.25
        System.out.println("Question 3:");
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle whose radius is 7.25 is " + area);

        // Find and display the square root a variable after it is set to 5.0
        System.out.println("Question 4:");
        double setNumber = 5.0;
        double squareRoot = Math.sqrt(setNumber);
        System.out.println("The square root of " + setNumber + "is " + squareRoot);

        // Find and display the distance between the points (5, 10) and (85, 50)
        System.out.println("Question 5:");
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double pointsDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
        System.out.println("The distance between the points (5,10) and (85,50) is " + pointsDistance );

        // Find and display the absolute (positive) value of a variable after it is set to -3.8
        System.out.println("Question 6:");
        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("The absolute number of " + negativeValue + "is " + absoluteValue);

        // Find and display a random number between 0 and 1
        System.out.println("Question 7:");
        System.out.println("A random number between 0 and 1 is " + Math.random());



}




}

