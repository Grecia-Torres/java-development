package com.pluralsight.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String allEmployees;
            System.out.println("Employee ID: ");

            while ((allEmployees = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|");


            }
            bufReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


