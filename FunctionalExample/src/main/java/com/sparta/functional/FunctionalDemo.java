package com.sparta.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FunctionalDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Michel Jean",
                "Callum Peden", "Reman Teladia", "Idriss Baouali",
                "Tina Szucs", "Usama Navid", "Alex Costi",
                "Andy Marincas", "Mauro Sorrentino", "Alex Costi"));
        // Anonymous inner class style
//        System.out.println(list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("M");
//            }
//        }).toList());
        // lambda expression style              <-------------------->
        list
                .stream()
                .peek(System.out::println)
                .filter(s -> s.startsWith("M"))       // intermediate operation
                .forEach(System.out::println); // terminal operation

        System.out.println(list
                .stream()
                .max(String::compareTo)
                .get());
    }
}
