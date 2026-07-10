package com.raghavender.multithreading;


class Counter {
    int count;
    // The processing will be done without overlap or race condition.
    public synchronized void increment() {
        count++;
    }

    public void show() {
        System.out.println("The value of the counter is " + count);
    }
}


public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable runnable1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };

        Runnable runnable2 = () -> {
            for (int j = 1; j <= 10000; j++) {
                counter.increment();
            }

        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
        // method main will wait till thread have completed.
        t1.join();
        t2.join();
        counter.show();
    }


}
