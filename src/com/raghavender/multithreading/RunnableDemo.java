package com.raghavender.multithreading;

public class RunnableDemo implements Runnable {
String msg;

    RunnableDemo(String msg){
        this.msg=msg;
    }



    @Override
    public void run() {
        for(int i=0; i<=1000;i++){


            System.out.println(msg+" "+i);

            System.out.println(Thread.currentThread().getName()+": "+i);

        }

    }

    public static void main(String[] args) {

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread1");
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread2");

        new Thread(runnableDemo1).start();
        new Thread(runnableDemo2).start();
    }
}
