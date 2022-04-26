package com.sparta.sakila;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection connection = null;
    public static Connection getConnection() {
        if(connection == null) {
            try {
                Properties dbProps = new Properties();
                dbProps.load(new FileReader("database.properties"));
                connection = DriverManager.getConnection(
                    dbProps.getProperty("db.url"),
                    dbProps.getProperty("db.username"),
                    dbProps.getProperty("db.password"));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void closeConnection(){
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        connection = null;
    }
}
