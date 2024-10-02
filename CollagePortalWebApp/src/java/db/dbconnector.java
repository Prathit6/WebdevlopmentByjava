/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author prathit
 */
public class dbconnector {
    
     static Connection con;
    static Statement st;

    static {
        try {
            // Load the MySQL JDBC driver
           Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver loaded!");

            // Establish the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sig_practices_iist?characterEncoding=UTF-8", "prathit-dode", "@ptcdode");
            System.out.println("Connected");

            // Create the statement
            st = con.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e);
        }
    }

    // Method to get the Statement object
    public static Statement getStatement() {
        return st;
    }

    // Method to get the Connection object
    public static Connection getConnection() {
        return con;
    }
}
