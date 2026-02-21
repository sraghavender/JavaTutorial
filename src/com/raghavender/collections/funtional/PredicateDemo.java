package com.raghavender.collections.funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
//    @Override
//    public boolean test(Integer integer) {
//        if (integer%2 ==0)
//            return true;
//        else
//            return false;
//

//    }

    public static void main(String[] args) {

//       Predicate<Integer> predicate = new Predicate<Integer>() {
//           @Override
//           public boolean test(Integer integer) {
//               return false;
//           }
//       };

//        Predicate<Integer> predicate = (i) -> (i%2==0);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println("Even integers " + i));


    }

}
