package com.raghavender.exceptionhandling;

public class TryCatchThrowDemo {

    public static void main(String[] args) {
        int a =10;
        int b =20;
        a= b/a;
        try {
            if (a == 2) {
                throw new ArithmeticException("This is intentionally generated error...");

            }
        } catch (Exception e) {
            System.out.println("Error captured..." +e);
        }




    }
}
