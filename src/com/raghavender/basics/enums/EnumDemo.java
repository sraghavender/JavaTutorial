package com.raghavender.basics.enums;

enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}


public class EnumDemo {
    public static void main(String[] args) {

        DaysOfWeek day = DaysOfWeek.SATURDAY;
        System.out.println("Print all the days for the week.");
        for (DaysOfWeek d : DaysOfWeek.values())
            System.out.println(d);

        switch (day) {
            case SUNDAY:
                System.out.println("Its a weekend!");
                break;
            case MONDAY:
                System.out.println("Weekday!");
                break;
            case SATURDAY:
                System.out.println("Weekday !");
                break;
        }
    }
}