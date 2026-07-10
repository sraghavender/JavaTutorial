package com.raghavender.utils.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {


    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {

                if (a % 10 > b % 10) // compare based on last digit of the number
                    return 1;
                else
                    return -1;
            }
        };

        nums.add(23);
        nums.add(46);
        nums.add(102);
        nums.add(11);
        System.out.println("Original list without sorting" + nums);
        Collections.sort(nums, com);
        System.out.println("List after sorting" + nums);
    }
}
