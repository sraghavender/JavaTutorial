package com.raghavender.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//synchronous blocking models
public class CallableDemo {


    public static void main(String[] args) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "The callable has returned";
            }


        };
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> future = executor.submit(callable);

        try {
            // Blocking code
            String result = future.get();
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            executor.shutdown();
        }


    }
}


