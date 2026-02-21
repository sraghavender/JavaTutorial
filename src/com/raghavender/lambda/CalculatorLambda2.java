package com.raghavender.lambda;
interface CalculatorLambda2Interface {
    public void displayResult(int result);
}
public class CalculatorLambda2 {
    public static void main(String[] args) {
        // Lambda expression with single argument.
        CalculatorLambda2Interface calculatorLambda2Interface = (int result) -> {
            System.out.println("Display result: "+result);
        };

        calculatorLambda2Interface.displayResult(10);
    }
}
