package com.raghavender.utils.optional;

import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[1] = "Optional demo.";
        Optional<String> value = Optional.of(str[1]);
        System.out.println(value.get());
        System.out.println(value.hashCode());
        System.out.println(value.isPresent());

    }
}
