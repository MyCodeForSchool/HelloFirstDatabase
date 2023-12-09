package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:sqlite:hello.sqlite";
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();

//        String createTableSQL = "CREATE TABLE cats (name TEXT, age INTEGER)";
//        statement.execute(createTableSQL);

//        String insertDataSQL = "INSERT INTO cats VALUES ('Mary', 10)";
//        statement.execute(insertDataSQL);

//        String insertDataSQL = "INSERT INTO cats VALUES ('Lucy', 15)";
//        statement.execute(insertDataSQL);

        String getAllDataSQL = "SELECT * FROM cats";
        ResultSet allCats = statement.executeQuery(getAllDataSQL);

        while (allCats.next()) {
            String name = allCats.getString("name");
            int age = allCats.getInt("age");
            System.out.println(name + " is " + age + " years old.");
        }

        connection.close();



    }
}