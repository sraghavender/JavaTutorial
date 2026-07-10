package com.raghavender.stream;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {


    public static void main(String[] args) {

        List<Integer> intList = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Print even integers from the list");
        intList.stream().filter(i->(i%2) ==0).forEach(System.out::println);
        System.out.println("Print odd integers from the list");
        intList.stream().filter(j-> (j%2) !=0).forEach(System.out::println);
    }
}
