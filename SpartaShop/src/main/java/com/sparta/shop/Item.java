package com.sparta.shop;

import java.util.AbstractList;
import java.util.HashSet;

public abstract class Item implements Comparable<Item>, Printable {
    // instance variables
    private String productId;
    private double price;
    // primitive types are initialised to 0 (int, float), '\0' (char) or false (boolean)
    private char colour;

    @Override
    public void delete() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0.0)
            this.price = 0.0;
        else
            this.price = price;
    }

    // this method isn't defined here, but MUST be defined in subclasses
    public abstract double getVatRate();

    public char getColour() {
        return colour;
    }

    public void setColour(char colour) {
        this.colour = colour;
    }

    public final String sayHello(){
        return "Hello, there!";
    }

    public int compareTo(Item otherItem){
        // (int) type cast to int
        return (int)(otherItem.getPrice() - this.price);
    }
}
