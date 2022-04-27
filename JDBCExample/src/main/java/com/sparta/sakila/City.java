package com.sparta.sakila;

import java.sql.Timestamp;

public class City {
    private int city_id;
    private String city_name;
    private int country_id;
    private Timestamp timestamp;

    public City(int city_id, String city_name, int country_id, Timestamp timestamp) {
        this.city_id = city_id;
        this.city_name = city_name;
        this.country_id = country_id;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                ", country_id=" + country_id +
                ", timestamp=" + timestamp +
                '}';
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }
}
