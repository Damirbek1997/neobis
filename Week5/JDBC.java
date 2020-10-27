package com.example.demo;

import java.sql.*;

public class JDBC {
    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static String url="jdbc:mysql://localhost:3306/week5";
    private static String username = "root";
    private static String password = "password";
    private static int rows;

    public static void main(String[] args) {
        try {
            addDB("Jackets", false);
            addDB("Underwear", true);
            addDB("Shorts", true);
            addDB("Suits", true);

            selectDB();
            updateDB("Coats",1);
            deleteFromDB(4);
            selectDB();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // configuration of connection to DB
    private static void connectionDB (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    // method to add data to table
    private static void addDB(String name, Boolean is_available) {
        try {
            connectionDB();
            statement = connection.prepareStatement("INSERT INTO categories (name, is_available) " +
                    "VALUES (?, ?)");
            statement.setString(1, name);
            statement.setBoolean(2, is_available);
            rows = statement.executeUpdate();

            System.out.printf("%d rows added \n", rows);
        }
        catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException e){
            }
            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    // method to print all data that DB has
    private static void selectDB(){
        try {
            connectionDB();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM categories");

            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Boolean is_available = resultSet.getBoolean(3);

                System.out.printf("%d. %s  \n", id, name, is_available);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException e){
            }
            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    // method to update data in table
    private static void updateDB(String name, int id){
        try {
            connectionDB();
            statement = connection.prepareStatement("UPDATE categories SET name = ? WHERE id = ?");
            statement.setString(1, name);
            statement.setInt(2, id);
            rows = statement.executeUpdate();

            System.out.printf("%d rows updated \n", rows);
        }
        catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException e){
            }
            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    // method to delete data from DB
    private static void deleteFromDB(int id){
        try {
            connectionDB();
            statement = connection.prepareStatement("DELETE FROM categories WHERE id = ?");
            statement.setInt(1, id);
            rows = statement.executeUpdate();

            System.out.printf("%d rows deleted \n", rows);
        }
        catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException e){
            }
            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
