package com.raghavender.multithreading;


import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RunAsyncDemo {

    public void  readFile(String path) {

                String line = "";
                try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                    while ((line = br.readLine()) != null) {
                        Thread.sleep(1);
                        System.out.println("File name: " + path + "Current thread: " + Thread.currentThread().getName() + "Data: " + line);
                    }

                } catch (FileNotFoundException f) {
                    System.out.println("file not file" + f);

                } catch (IOException i) {
                    System.out.println("IO error" + i);
                } catch (InterruptedException e) {
                    System.out.println("Interrupt exception " + e);
                }
            }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String[] filePaths = {"/home/raghavender/text1",
                "/home/raghavender/text2",
                "/home/raghavender/text3"};
            RunAsyncDemo runAsyncDemo = new RunAsyncDemo();
            for(String path:filePaths) {
                CompletableFuture runAsyncFuture = CompletableFuture.runAsync(()-> runAsyncDemo.readFile(path));
                runAsyncFuture.get();
            }

    }
}