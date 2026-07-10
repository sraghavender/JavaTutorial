package com.raghavender.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mac-d");
        list.add("Peter");
        list.add("David");
        list.add("Mr.Steve");

//        for(String s: list){
//            System.out.println(s);
//        }

//        list.stream().forEach((t)-> System.out.println(t));

        for (String s : list) {
            if(s.endsWith("d")) {
                System.out.println(s);
            }
        }

        list.stream().filter(p->p.startsWith("M")).forEach((t) -> System.out.println(t));



        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");


       map.forEach((key,value) -> System.out.println(key+":"+value));
       map.entrySet().stream().forEach(System.out::println);

    }
}
