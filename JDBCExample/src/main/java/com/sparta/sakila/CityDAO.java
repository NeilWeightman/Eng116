package com.sparta.sakila;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CityDAO{
    public boolean createCity(City newCity){
        // code to insert a city in the db
        return false;
    }
    public City getCityById(int city_id){
        Connection conn = ConnectionFactory.getConnection();
        City result;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(
                    "SELECT * FROM city WHERE city_id=" + city_id);
            if (rs.next() == false) return null; // no results
            result = new City(
                    rs.getInt("city_id"),
                    rs.getString("city"),
                    rs.getInt("country_id"),
                    rs.getTimestamp("last_update"));
        } catch(SQLException e){
            e.printStackTrace();
            result = null;
        }
        return result;
    }
    public ArrayList<City> getAllCities(){
        return null;
    }
    public boolean deleteCityById(int city_id){
        return false;
    }
    public boolean updateCity(City newCityState){
        return false;
    }
}
