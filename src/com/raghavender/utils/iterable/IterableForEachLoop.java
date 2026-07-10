package com.raghavender.utils.iterable;

import java.util.ArrayList;
import java.util.List;

public class IterableForEachLoop {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hi");
        listOfStrings.add("There");
        listOfStrings.add("!");

        listOfStrings.forEach(System.out::println);
    }
}
