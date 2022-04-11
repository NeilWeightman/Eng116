package com.sparta.enums;

import java.util.Scanner;

public class EnumDriver {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    //    public static final int MONDAY = 0;
//    public static final int TUESDAY = 1;
//    public static final int WEDNESDAY = 2;
//    public static final int THURSDAY = 3;
//    public static final int FRIDAY = 4;
//    public static final int SATURDAY = 5;
//    public static final int SUNDAY = 6;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // we should add some exception handling here
        Day dayOfWeek = Day.valueOf(scan.next().toUpperCase());
        if (dayOfWeek.equals(Day.MONDAY))
            System.out.println("It's Monday :-(");
        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a week day");
            case SATURDAY, SUNDAY -> System.out.println("It's the weekend!");
            default -> System.out.println("Invalid day");
        }
    }
}
