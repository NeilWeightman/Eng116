package com.sparta.shop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceExample {
    public static void main(String[] args) {
        List<String> nameList = getNameList();
        for(String name: nameList){
            System.out.println(name);
        }
        if(nameList.contains("Idriss"))
            System.out.println("Idriss is in the list!");
        nameList.remove("Michel");
        System.out.println(nameList);

        // how can this compile?
        // A extends B
        // A implements B
//        B b = new A();
    }

    private static List<String> getNameList() {
        return new LinkedList<>(
                List.of("Reman", "Michel", "Idriss",
                        "Callum", "Usama", "Alex",
                        "Andy", "Mauro", "Tina"));
    }

}
