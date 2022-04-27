package com.sparta.sakila;

import java.sql.*;

public class JDBCDriver {
    public static void main(String[] args) {
        PreparedStatement statement = null;
        PreparedStatement insertStatement = null;
        ResultSet rs = null;
        try {
            Connection conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement("SELECT * FROM actor WHERE first_name = ?");
            // PreparedStatement is more efficient
            // CallableStatement is the most efficient (set up by DBA)
            statement.setString(1, "JULIA");
            rs = statement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("first_name") + " "
                    + rs.getString("last_name"));
            }
            insertStatement = conn.prepareStatement(ConnectionFactory.getInsertSQL());
            for(int i = 1002; i <= 1005; i++){
                insertStatement.setInt(1, i);
                insertStatement.setString(2, "ENG116");
                insertStatement.setString(3, "This is a description " + i);
                insertStatement.executeUpdate();
            }

//            int rows_updated = statement.executeUpdate(
//                    "INSERT INTO film_text (film_id, title, description)" +
//                            " VALUES (1001, 'ENG116', 'Plucky developers learn Java')");
//            System.out.println(rows_updated);
            ConnectionFactory.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
