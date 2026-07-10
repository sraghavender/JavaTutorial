package com.raghavender.lambda;
@FunctionalInterface
interface CalculatorLambda3Interface {
    int sum(int i,int j);
}
public class CalculatorLambda3 {


    public static void main(String[] args) {

        CalculatorLambda3Interface calculatorLambdaInterface3 = (int i, int j) -> {

            return  i+j;
        };

       System.out.println(calculatorLambdaInterface3.sum(10,8));
    }
}
