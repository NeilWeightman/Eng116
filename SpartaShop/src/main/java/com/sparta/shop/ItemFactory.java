package com.sparta.shop;

public class ItemFactory {
    public static Item getItemObject(String itemType){
        switch(itemType){
            case "Shirt" -> {
                return new Shirt();
            }

        }
        if(itemType.equals("Shirt"))
            return new Shirt();
        else if(itemType.equals("Telephone"))
            return new Telephone();
        else
            return null;
    }
}
