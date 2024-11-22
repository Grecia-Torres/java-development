package com.pluralsight.week9;

import javax.sql.DataSource;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");

        Statement statement = connection.createStatement();

        String query = "SELECT ProductName FROM Products ";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("ProductName"));
        }

        connection.close();
    }
}