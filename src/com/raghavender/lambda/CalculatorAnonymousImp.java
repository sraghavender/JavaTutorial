package com.raghavender.lambda;
@FunctionalInterface
interface CalculatorAnonymous {
public void switchOn();
}

public class CalculatorAnonymousImp {

    public static void main(String[] args) {
        // anonymous class
        CalculatorAnonymous calculator = new CalculatorAnonymous(){

            public void switchOn(){
                System.out.println("Implementation of anonymous class...");
            }
        };

        calculator.switchOn();
    }
}
