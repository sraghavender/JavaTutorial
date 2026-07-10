package com.raghavender.collections.funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
//    @Override
//    public void accept(String s) {
//        System.out.println("The string passed is: "+s);
//    }

    public static void main(String[] args) {

//        Consumer<String> consumer = new Consumer<>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("The string passed is: " + s);
//            }
//
//
//        };
//        Consumer<Integer> consumer = i -> System.out.println("Printing integers: "+i);

       List<Integer> list = Arrays.asList(1,2,3,4,5,6);

       list.forEach(i -> System.out.println("Printing integers: "+i));


    }
}
