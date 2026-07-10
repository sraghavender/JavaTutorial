package com.raghavender.utils.iterable;

import java.util.ArrayList;
import java.util.List;

public class IterableEnhancedForLoop {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hello");
        listOfStrings.add("There");
        listOfStrings.add("!");
        //The objects of classes implementing collection interface can be iterated using enhanced for loop.
        //Collection interface extends iterable interface.
        for (String s : listOfStrings) {
            System.out.println(s);
        }

    }
}
