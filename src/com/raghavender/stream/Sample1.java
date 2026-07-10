package com.raghavender.stream;



import java.util.Arrays;

public class Sample1 {
    public static void main(String[] args) {
        String[] location = {"Delhi", "Hyderabad", "Bangalore"," ",null,"Kolkata","","xyz"};


        String[] result = Arrays.stream(location).filter(s->s !=null && !s.isBlank() && !s.isEmpty()).toArray(String[]::new);

        for (String s : result) {
            System.out.println(s);


        }
    }
}