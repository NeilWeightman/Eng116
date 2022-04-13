package com.sparta.shop;

import java.util.*;

public class ShopFront {
    // nested (inner) class
    private static class MyItemComparator implements Comparator<Item> {
        @Override
        public int compare(Item o1, Item o2) {
            return (int)(o2.getPrice() - o1.getPrice());
        }
    }
    public static void main(String[] args) {
        List<Item> shoppingBasket = new ArrayList<>();

        // can't instantiate an abstract class
//        Item i = new Item("IABC", 12.00, 'o');
//        shoppingBasket.add(i);
        shoppingBasket.add(new Shirt("0001", 12.01, "Summer", "XL", 'r'));
        shoppingBasket.add(new Telephone("T001", 123.45, 'g'));
        // can't do this
//        shoppingBasket.add(new Customer());
        for(Item theItem: shoppingBasket)
            System.out.println(theItem);
        // why does this not work atm
        // Collections.sort(shoppingBasket);
//        shoppingBasket.sort(new MyItemComparator());
        // an anonymous inner class
//        shoppingBasket.sort(new Comparator<Item>() {
//            @Override
//            public int compare(Item o1, Item o2) {
//                return (int)(o2.getPrice() - o1.getPrice());
//            }
//        });
        // lambda version
        shoppingBasket.sort((o1, o2) -> (int)(o2.getPrice() - o1.getPrice()));
        System.out.println(shoppingBasket);

        List<String> nameList = new ArrayList<>(
                List.of("Reman", "Michel", "Idriss",
                "Callum", "Usama", "Alex", "Andy", "Mauro", "Tina"));
        // when this does?
        Collections.sort(nameList);
        System.out.println(nameList);
        List<Printable> printList = new ArrayList<>();
        Item i = new Shirt();
        printList.add(i);
        Customer c = new Customer();
        printList.add(c);
        Printable p = printList.get(0);
        p.print();
        // can access other features of the object by casting
        // risky, because you're turning off the type checking
        System.out.println(((Shirt)p).getPrice());

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
