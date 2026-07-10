package com.raghavender.lambda;
@FunctionalInterface
public interface MyFunctionalInterface {
    // abstract method
    void m1();

    default void m2(){
        System.out.println("Default method");
    }
    static void m3() {
        System.out.println("Static method");
    }

    default void m4() {
        System.out.println("Default method");
    }
}


