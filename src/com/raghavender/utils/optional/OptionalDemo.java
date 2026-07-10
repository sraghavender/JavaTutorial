package com.raghavender.utils.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        String[] word = new String[5];
        
        Optional<String> nullCheck = Optional.ofNullable(word[3]);
    if(nullCheck.isPresent()) {
        String str = word[3].toLowerCase();
        System.out.println(str);
    }
    else
    {
        System.out.println("The string is empty.");
    }
    }
}
