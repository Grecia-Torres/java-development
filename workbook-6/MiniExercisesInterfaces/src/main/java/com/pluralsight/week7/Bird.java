package com.pluralsight.week7;

abstract class Bird extends Animal implements Flyable {
    public Bird(String type) {
        super(type);
    }
}
