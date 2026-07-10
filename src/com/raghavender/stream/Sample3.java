package com.raghavender.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample3 {

    public static void main(String[] args) {

        System.out.println("Stream API collect demo");

        List<Integer> integerList =  List.of(1,2,3,4,5,6,7,8,9,10);



        List<Integer>  oddList = integerList.stream().filter(i->(i%2) ==0 ).collect(Collectors.toList());

        System.out.println(oddList);

        List<Integer> evenList = integerList.stream().filter(i -> (i%2) !=0).collect(ArrayList::new,List::add,List::addAll);

        System.out.println(evenList);




    }
}
