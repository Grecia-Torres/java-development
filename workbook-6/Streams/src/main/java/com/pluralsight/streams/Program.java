package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Grecia", "Torres", 29));
        personList.add(new Person("Karla","Torr", 26));
        personList.add(new Person("Isley","Torr", 31));
        personList.add(new Person("Chelsey","Torr",24));
        personList.add(new Person("Kaylee","Torr",16));
        personList.add(new Person("Alex","Torr",55));
        personList.add(new Person("Liz","Torr",55));
        personList.add(new Person("Paola","Torr",55));
        personList.add(new Person("Alexa","Torr",55));
        personList.add(new Person("Johnny","Castle",55));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name either first or last name: ");
        String search = scanner.nextLine();

        List<Person> personList1 = new ArrayList<>();

        for(Person person : personList) {
            if(person.getFirstName().contains(search) || person.getLastName().contains(search)) {
                personList1.add(person);
            }
        }
    }
}
