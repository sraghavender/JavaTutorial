package com.raghavender.basics;

public class Ternary {

    public static void main(String[] args) {
        int num = 51;
        String result;
        if (num % 2 == 0) {
            result = "Ever number";

        } else {
            result = "Odd number";
        }
        System.out.println("if else... "+ result);
        num =80;
        // Ternary operator
        result = (num % 2 == 0) ? result = "Ever number" : "Odd number";
        System.out.println("Ternary operator... " + result);

    }
}