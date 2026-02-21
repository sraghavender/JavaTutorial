package com.raghavender.lambda;
@FunctionalInterface
interface Calculator{
    public void switchOn();
}

public class CalculatorImp implements Calculator {

    public void switchOn(){
        System.out.println("The switch is on...");
    }

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImp();

        calculator.switchOn();
    }
}
