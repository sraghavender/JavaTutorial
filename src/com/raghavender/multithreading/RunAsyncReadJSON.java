package com.raghavender.multithreading;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RunAsyncReadJSON {
    public List<Employee> readJSON(File file, ObjectMapper mapper) {

        List<Employee> employees = null;
        try {
            employees = mapper.readValue(file, new TypeReference<List<Employee>>() {
            });

        } catch (IOException e) {
            System.out.println(e);
        }

        return employees;

    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        File file = new File("/home/raghavender/employee.json");
        RunAsyncReadJSON runAsyncReadJSON = new RunAsyncReadJSON();

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                List<Employee> employees = runAsyncReadJSON.readJSON(file, new ObjectMapper());
                employees.forEach(System.out::println);
            }
        });
        completableFuture.get();

    }
}





