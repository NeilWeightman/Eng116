package com.sparta.sakila;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CityDAOTest {

    @org.junit.jupiter.api.Test
    void getCityById() {
        Assertions.assertEquals("Barcelona", new CityDAO().getCityById(55).getCity_name());
    }
}