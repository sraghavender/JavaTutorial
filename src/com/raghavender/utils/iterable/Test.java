package com.raghavender.utils.iterable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Iterable<Integer> iterable = Arrays.asList(1,2,3,4,5,6);
        for(Integer i :iterable){
            System.out.println(i);
        }

    }
}

