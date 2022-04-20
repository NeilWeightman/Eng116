package com.sparta.shop;

import java.util.Scanner;

public class FactoryExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which type of Item?");
        String response = scan.next();
        Item s1 = ItemFactory.getItemObject(response);
        System.out.println(s1.getPrice());
        System.out.println(s1.getClass().getName());
    }

}
