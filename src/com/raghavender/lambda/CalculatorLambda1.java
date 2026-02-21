package com.raghavender.lambda;
interface CalculatorLambda1Interface{
    void switchOn();
}
public class CalculatorLambda1 {

    public static void main(String[] args) {

//        CalculatorLambda1Interface calculatorLambda1Interface = () -> {
//                System.out.println("Switch via Lambda expression...");
//
//        };

        CalculatorLambda1Interface calculatorLambda1Interface = () -> System.out.println("Switch via lambda expression");

        calculatorLambda1Interface.switchOn();
    }
}
