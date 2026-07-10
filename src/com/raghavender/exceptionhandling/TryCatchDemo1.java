package com.raghavender.exceptionhandling;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class TryCatchDemo1 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        String[] s = new String[4];
        for (String a : s)
            System.out.println(a);
         // multiple catch statements
        try {

            s[5] = "hello"; //will create array out of bound exception
            j = 10 / i;  //will create arithmetic exception

        } catch (ArrayIndexOutOfBoundsException o) {

            System.out.println("Array out of bound exception error " + o);
        } catch (ArithmeticException a) {
            System.out.println("Runtime exception detected" + a);
        } catch (Exception e) {
            System.out.println("Any other exception" + e);
        }

    }
}