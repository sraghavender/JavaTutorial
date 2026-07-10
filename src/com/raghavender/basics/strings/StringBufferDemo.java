package com.raghavender.basics.strings;

public class StringBufferDemo {
    public static void main(String[] args) {

        // String buffer is mutable and thread safe.
        StringBuffer stringBuffer = new StringBuffer("Hello");
        String assign;
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());

        // 16+6=21
        System.out.println(stringBuffer.capacity());
        assign = stringBuffer.toString();
        System.out.println(assign);

    }

}
