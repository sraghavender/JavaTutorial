package com.raghavender.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureChain {
    public static void main(String[] args) {


        CompletableFuture<Integer> futureChain = CompletableFuture.supplyAsync(() -> 10)
                .thenApplyAsync(result -> result * 2)
                .thenApplyAsync(result -> result - 2);
                futureChain.thenAcceptAsync(System.out::println);
    }
}
