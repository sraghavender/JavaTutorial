package com.raghavender.collections.funtional;

import java.util.function.Function;

public class FunctionalDemo implements Function<Integer,String> {
    @Override
    public String apply(Integer integer) {
         return  "This is a integer passed to the method "+integer;

    }

    public static void main(String[] args) {
     FunctionalDemo functionalDemo = new FunctionalDemo();

        System.out.println(functionalDemo.apply(10));;
    }
}
