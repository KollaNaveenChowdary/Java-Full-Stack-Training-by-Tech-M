/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author radha
 */

import java.sql.*;

public class JdbcCrudOperationsTestClass {

    // Database credentials
    static final String DB_URL = "jdbc:mysql://localhost:3306/friends";
    static final String USER = "root";
    static final String PASS = "N@veen9347673926";  // Replace with your MySQL password

    // Method to insert a record using PreparedStatement
    public void insertRecordWithPreparedStatement(int id, String name, double sal, String dept) {
        String insertQuery = "INSERT INTO employee  VALUES ("+id+","+name+","+sal+","+dept+");";
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement statement = connection.prepareStatement(insertQuery)) {
//            statement.setInt(1, id);
//            statement.setString(2, name);
//            statement.setInt(3, age);
//            statement.executeUpdate();
            System.out.println("Record inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete a record using PreparedStatement
    public void deleteRecordWithPreparedStatement(int id) {
        String deleteQuery = "DELETE FROM employee WHERE emp_id = "+id+";";
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement statement = connection.prepareStatement(deleteQuery)) {
//            statement.setInt(1, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully!");
            } else {
                System.out.println("Record with id " + id + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to update a record using PreparedStatement
    public void updateRecordWithPreparedStatement(int id, String name, double sal) {
        String updateQuery = "UPDATE employee SET emp_name = '" + name + "', salary = " + sal + " where emp_id="+id+";";

        //String updateQuery = "UPDATE employee SET name = "+name+", "salary="+sal";
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement statement = connection.prepareStatement(updateQuery)) {
//            statement.setString(1, name);
//            statement.setInt(2, age);
//            statement.setInt(3, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("Record with id " + id + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve records using PreparedStatement
    public void retrieveRecords() {
        String selectQuery = "SELECT * FROM employee";
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("emp_id");
                String name = resultSet.getString("emp_name");
                double salary = resultSet.getDouble("salary");
                String dept = resultSet.getString("department");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JdbcCrudOperationsTestClass crudOperations = new JdbcCrudOperationsTestClass();

        // Insert a new record
        crudOperations.insertRecordWithPreparedStatement(3, "John Doe", 2500.0, "CSE");
        
        // Delete a record
        crudOperations.deleteRecordWithPreparedStatement(1);

        // Update a record
       crudOperations.updateRecordWithPreparedStatement(1, "Jack Doe", 50000);

        // Retrieve all records
        crudOperations.retrieveRecords();

        

        // Retrieve all records again to verify deletion
       crudOperations.retrieveRecords();
    }
}

