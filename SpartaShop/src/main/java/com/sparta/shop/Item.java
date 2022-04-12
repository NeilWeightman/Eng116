package com.sparta.shop;

public class Item {
    // instance variables
    private String productId;
    private double price;
    // primitive types are initialised to 0 (int, float), '\0' (char) or false (boolean)
    private char colour;

    public Item(String prodId, double price, char colour) {
        this.price = price;
        productId = prodId;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productId='" + productId + '\'' +
                ", price=" + price +
                ", colour=" + colour +
                '}';
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

    public char getColour() {
        return colour;
    }

    public void setColour(char colour) {
        this.colour = colour;
    }
}
