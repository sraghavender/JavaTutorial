package com.raghavender.multithreading;

public class ThreadDemo extends Thread {
    String message;

    ThreadDemo(String message)
    {
        this.message=message;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {

            System.out.println(message+" "+i);

            System.out.println(message+":"+Thread.currentThread().getName()+" "+i);

        }
    }
    public static void main(String[] args) {

     ThreadDemo threadDemo1 = new ThreadDemo("Thread1");
     ThreadDemo threadDemo2 = new ThreadDemo("Thread2");


     threadDemo1.start();
     threadDemo2.start();

        }
    }


