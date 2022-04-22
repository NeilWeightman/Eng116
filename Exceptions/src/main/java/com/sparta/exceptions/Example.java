package com.sparta.exceptions;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan;
        boolean suitableResponse = false;
        int l = 0;
        while(!suitableResponse) {
            try {
                System.out.println("Enter an int:");
                scan = new Scanner(System.in);
                l = scan.nextInt();
                suitableResponse = true;
            } catch (InputMismatchException|ArithmeticException e) {
                System.out.println("Looks like you didn't enter an int!");
            }
//            System.out.println("After try/catch");
        }
        // report an error
//        throw new RuntimeException("Some sort of problem");
        System.out.println(l);
        try {
            new Example().methodOne();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void methodOne() throws ParseException {
        DateFormat df = DateFormat.getDateInstance();
        Date today = null;
        today = df.parse("22-04-2022");
        System.out.println(today);
    }

    public void methodTwo(){

    }
}
