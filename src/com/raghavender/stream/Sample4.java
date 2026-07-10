package com.raghavender.stream;

import java.util.Arrays;
import java.util.List;

public class Sample4 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
    integerList.stream().filter(i->i%2==0).map(i-> i*2).forEach(System.out::println);
    }
}









