package com.pluralsight.streams;

public class Person {
    private String firstName;
    private String lastName;
    private int name;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getName() {
        return name;
    }

    public Person(String firstName, String lastName, int name) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", name=" + name +
                '}';
    }
}
