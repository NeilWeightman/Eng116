package com.sparta.fileio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        String testDate = "4/6/2022";
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try {
            d = df.parse(testDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
        java.sql.Date sqlDate = new java.sql.Date(d.getTime());
        System.out.println(sqlDate);
    }
}
