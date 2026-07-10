package com.raghavender.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> greeting = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(10);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Hi";
        });

        greeting.thenAcceptAsync(System.out::println);
    }

}
