package com.sparta.shop;

public class ItemFactory {
    public static Item getItemObject(String itemType){
        switch (itemType) {
            case "Shirt" -> {return new Shirt();}
            case "Telephone" -> {return new Telephone();}
            default -> {return null;}
        }
    }
}
