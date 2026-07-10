package com.raghavender.multithreading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentFileReaderWithThreadPool {

    public static void readFile(String path) {
        String line="";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            while((line=br.readLine()) != null) {
                Thread.sleep(3000);
                System.out.println("File name: " + path + "Current thread: " + Thread.currentThread().getName() + "Data: " + line);
            }
        } catch (FileNotFoundException f){
            System.out.println("file not file"+f);

        } catch (IOException i){
            System.out.println("IO error"+i);
        } catch (InterruptedException e){
            System.out.println("Interrupt exception "+e);
        }
    }

    public static void main(String[] args) {


        String[] filePaths = {"/home/raghavender/text1",
                         "/home/raghavender/text2",
                         "/home/raghavender/text3"

                        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
                for(String path:filePaths){
                    executorService.execute(()->readFile(path));
                }
                executorService.shutdown();

    }


}
