package com.raghavender.fileIO;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("The number entered is "+i);


    }

}
