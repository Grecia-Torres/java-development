package com.pluralsight.week9;


import java.sql.*;

public class MiniExerciseProduct {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");

    }
    public static void displayAllCars {

        String query = "SELECT ProductName, ProductID FROM Products ";
        PreparedStatement statement = connection.prepareStatement(query);


        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("ProductName"));
        }

        connection.close();
    }
}
}