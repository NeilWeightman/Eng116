package com.sparta.shop;

import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;

public class ShopFront {
    public static void main(String[] args) {
        List<Item> shoppingBasket = new ArrayList<>();

        shoppingBasket.add(new Shirt("0001", 12.01, "Summer", "XL", 'r'));
        shoppingBasket.add(new Telephone("T001", 123.45, 'g'));
        System.out.println(shoppingBasket);



//        basicClassUsage();
    }

    private static void basicClassUsage() {
        //        System.out.println(args[0]);
//        // local variables must be initialised before use
//        String message;
//        // can't do this
//        System.out.println(message);
        Shirt hawaiianShirt = new Shirt(); // zero-argument constructor
        // default constructor (ctor)
        hawaiianShirt.setPrice(123.45);
        System.out.println(hawaiianShirt.getPrice());
        System.out.println(hawaiianShirt.getPriceWithTax());
        System.out.println(hawaiianShirt.getDesignName());
        System.out.println(hawaiianShirt.getColour());

        Shirt tShirt = new Shirt("00001", -45.00, "Classic T", "L", 'b');
        Shirt tShirt2 = new Shirt("00001", -45.00, "Classic T", "L", 'b');
//        HexFormat hf = HexFormat.of();
        System.out.println(tShirt);// + " " + hf.toHexDigits(tShirt.hashCode()));
        System.out.println(tShirt2.equals(tShirt));
        System.out.println(tShirt2 == tShirt);
    }
}
