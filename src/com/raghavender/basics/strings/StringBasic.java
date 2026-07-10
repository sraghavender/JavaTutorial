package com.raghavender.basics.strings;

public class StringBasic {


    public static void main(String[] args) {

        // Below is an example of string literal. String literals are immutable and stored in string constant pool
        // within heap memory.



        String thatText ="Hello";
        String text = "Hello";

        System.out.println(text.hashCode());
        System.out.println(thatText.hashCode());
        System.out.println(text.length());

        // Creating string object which are mutable.

        String text1 = new String("Hello");
        String thatText1 = new String("Hello");
        System.out.println(text1.hashCode());
        System.out.println(thatText1.hashCode());
        System.out.println(text1.equals(thatText1));


    }
}
