package com.sparta.sakila;

import java.sql.*;

public class JDBCDriver {
    public static void main(String[] args) {
        Statement statement = null;
        ResultSet rs = null;
        try {
            Connection conn = ConnectionFactory.getConnection();
            statement = conn.createStatement();
            // PreparedStatement is more efficient
            // CallableStatement is the most efficient (set up by DBA)
            rs = statement.executeQuery("SELECT * FROM film_text");
            while(rs.next()){
                System.out.println(rs.getString("description"));
            }
            int rows_updated = statement.executeUpdate(
                    "INSERT INTO film_text (film_id, title, description)" +
                            " VALUES (1001, 'ENG116', 'Plucky developers learn Java')");
            System.out.println(rows_updated);
            ConnectionFactory.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
