package com.sparta.sakila;

public class DAODriver {
    public static void main(String[] args) {
        CityDAO dao = new CityDAO();
        City result = dao.getCityById(55);
        System.out.println(result);
    }
}
