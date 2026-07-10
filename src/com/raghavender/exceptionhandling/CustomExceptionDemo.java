package com.raghavender.exceptionhandling;
class MyException extends Exception{
    public MyException(String error){


        super(error);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {


        try {
            throw new MyException("Throw custom exception from try block...");



        } catch (MyException e){
            System.out.println("Error from catch block "+e);
        }
    }
}
