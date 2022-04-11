package com.sparta.strings;

public class StringExample {
    public static void main(String[] args) {
        String andy = "Andy Marincas";
        String alex = "Alex Costi";
        System.out.println(alex.compareTo(alex));
        System.out.println("SE1 0AA"
                .matches("^[a-zA-Z]{1,2}[0-9][0-9A-Za-z]{0,1} {0,1}[0-9][A-Za-z]{2}$"));
        String listOfNames = "Idriss/Reman/Anthony";
        String[] nameArray = listOfNames.split("/");
        for (String name: nameArray)
            System.out.println(name);
        System.out.println(listOfNames.substring(7, 12));
    }

    private static StringBuilder michel() {
        String firstName = "Michel";
        String lastName = "Jean";
        // + can be used for concatenation
        // unnecessary objects are created
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));
        firstName = firstName + "2";
        // how not to do it
        String result = "";
        for(int i = 0; i < 1000; i++)
            result = result + firstName + " " + lastName + " ";
        System.out.println(result);
        // better solution
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 1000; i++){
            builder.append(firstName);
            builder.append(" ");
            builder.append(lastName);
            builder.append(" ");
        }
        return builder;
    }

    private static void usama() {
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
