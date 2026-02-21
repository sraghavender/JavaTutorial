package com.raghavender.lambda;
interface CalculatorLambda4Interface {
    int subtract(int i,int j);
}
public class CalculatorLambda4 {

    public static void main(String[] args) {

        CalculatorLambda4Interface calculatorLambda4Interface = (int i, int j) -> {
             if(i<j) {
                 throw new RuntimeException("i is less than j");
             }
             else {

                 return i - j;
             }
        };
        System.out.println(calculatorLambda4Interface.subtract(3,4));
    }
}
