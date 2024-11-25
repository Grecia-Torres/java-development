package com.pluralsight.week9;

import java.sql.*;
import java.util.Scanner;

public class MiniExerciseCarDealership {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDealership", "root", "");
        displayAllCars(connection);
        displaySingleDealership(connection);
        connection.close();

    }
    public static void displayAllCars(Connection connection) throws SQLException {

        String query = "SELECT Color, Make, Model FROM Vehicles ";
        PreparedStatement statement = connection.prepareStatement(query);


        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("Color") + " | " + resultSet.getString("Make") + " | " + resultSet.getString("Model"));
        }
    }
    public static void displaySingleDealership(Connection connection) throws SQLException {
        System.out.println("Which Dealership details would you like to see of the following?");
        System.out.println("Torres Auto, Mar Auto, Towers Auto, or Alex Auto");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();

        String query = "SELECT Name, Address, Phone FROM Dealerships WHERE Name = ?";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, name);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("Name") + " | " + resultSet.getString("Address") + " | " + resultSet.getString("Phone"));
        }
    }


}
