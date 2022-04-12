package com.sparta.shop;

public class Telephone extends Item {
    private String brand;
    private String modelName;

    public Telephone(String prodId, double price, char colour) {
        super(prodId, price, colour);
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "productId='" + getProductId() + '\'' +
                ", price=" + getPrice() +
                ", colour=" + getColour() +
                ", brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
