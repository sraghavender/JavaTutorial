package com.raghavender.utils.optional;

public class Demo {
    public static void main(String[] args) {
        String[] word = new String[10];

        try {
            String str = word[3].toUpperCase();
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
