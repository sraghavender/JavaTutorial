package com.raghavender.basics.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // String builder is mutable and not thread safe.
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.append(" world!"));
        System.out.println(sb.append('!'));
        System.out.println(sb.insert(12,'!'));

    }

}
