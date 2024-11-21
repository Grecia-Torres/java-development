package com.pluralsight.capstone2;

public interface Movable {
    default void Move() {
        System.out.println("I am moving");
    }
}
