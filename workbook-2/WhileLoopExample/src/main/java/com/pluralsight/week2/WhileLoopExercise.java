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
        for (int x = 0; x < 20; x += 2) {
            System.out.println(x);
        }

    }

    public static void exerciseForEachLoop() {
        String[] vegetables = {"Brocoli", "Spinach", "Yams", "Asparagus", "Beets", "Squash"};
        for (String veggie : vegetables) {
            System.out.println("I love " + veggie +"!");
        }

    }
}






