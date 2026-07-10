package com.raghavender.fileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter text...");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String out = br.readLine();
        System.out.println("The input string is " + out);


    }
}