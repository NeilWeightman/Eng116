package com.sparta.shop;

public class ShopFront {
    public static void main(String[] args) {
        System.out.println(args[0]);
//        // local variables must be initialised before use
//        String message;
//        // can't do this
//        System.out.println(message);
        Shirt hawaiianShirt = new Shirt();
        hawaiianShirt.setPrice(123.45);
        System.out.println(hawaiianShirt.getPrice());
        System.out.println(hawaiianShirt.getPriceWithTax());
        System.out.println(hawaiianShirt.getDesignName());
        System.out.println(hawaiianShirt.getColour());
    }
}
