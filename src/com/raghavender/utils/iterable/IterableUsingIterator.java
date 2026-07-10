package com.raghavender.utils.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableUsingIterator {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hello");
        listOfStrings.add("Iterator");
        listOfStrings.add("!");

       Iterator<String> iterator = listOfStrings.iterator();

       while (iterator.hasNext()){
           boolean b = iterator.hasNext();
           String s = iterator.next();
           System.out.println(b+s);
       }

    }
}
