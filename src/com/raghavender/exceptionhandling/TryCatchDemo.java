package com.raghavender.exceptionhandling;

public class TryCatchDemo {
    public static void main(String[] args) {


        int i = 0;
        int j = 0;

        try {
            j = 16 / i;
        } catch (Exception e) {
            System.out.println("There is a error..."+e);
        }
        System.out.println(j);

        System.out.println("Exiting.");

    }
}