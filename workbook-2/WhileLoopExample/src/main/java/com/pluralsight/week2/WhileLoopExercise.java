package com.pluralsight.week2;

public class WhileLoopExercise {
    public static void main(String[] args) {
        exerciseWhileLoop();
        exerciseForLoop();
        exerciseForEachLoop();

    }

    public static void exerciseWhileLoop() {
        boolean done = false;
        int count = 0;
        count++;

        while (!done) {
            System.out.println("Hi " + count);
            if (Math.random() < 0.5) {
                done = true;
            }
        }
    }

    public static void exerciseForLoop() {
        for (int i = 0; i < 20; i += 2) {
            System.out.println(i);
        }

    }

    public static void exerciseForEachLoop() {
        String[] vegetables = {"Brocoli", "Spinach", "Yams", "Asparagus", "Beets", "Squash"};
        for (String veggie : vegetables) {
            System.out.println("I love " + veggie +"!");

            int x = 9;

            if (x++ < 10) {

                System.out.println("Low");

            } else {

                System.out.println("High");

            }

        }
        }

    }







