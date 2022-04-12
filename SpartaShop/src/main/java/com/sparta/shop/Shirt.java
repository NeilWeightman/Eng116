package com.sparta.shop;

public class Shirt {
    // instance variables
    private double price;
    // object instance variables are initialised to null
    private String designName;
    private String size;
    // primitive types are initialised to 0 (int, float), '\0' (char) or false (boolean)
    private char colour;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0.0)
            this.price = 0.0;
        else
            this.price = price;
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public char getColour() {
        return colour;
    }

    public void setColour(char colour) {
        this.colour = colour;
    }

    public double getPriceWithTax(){
        // assuming VAT is 20%
        return this.price * 1.2;
    }
}
