package com.raghavender.utils.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();

        nums.add(23);
        nums.add(46);
        nums.add(101);
        nums.add(11);
        System.out.println("Original list without sorting"+nums);

        // Sorting using collections class
        Collections.sort(nums);
        System.out.println("List after sorting"+nums);
    }
}