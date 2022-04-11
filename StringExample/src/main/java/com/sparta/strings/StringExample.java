package com.sparta.strings;

public class StringExample {
    public static void main(String[] args) {
        // this String is created in the pool
        String usama = "Usama Navid"; // init using String literal
        // explicitly use the String constructor, stored in the heap
        // probably never do this, certainly have good reasons
        String usama2 = null;
//        String usama2 = new String("Usama Navid");
//        usama2 = usama2.intern(); // moves the object to the pool
        System.out.println(usama == usama2);
        usama2 = usama;
        // usama  = "Usama Navid"
        // usama2 = "Usama Navid"
        usama2 = usama2.toLowerCase();
        // usama2 = "usama navid"
        System.out.println(usama2);
        System.out.println(usama);
    }

    private static String return_message() {
        return "This is a message";
    }
}
