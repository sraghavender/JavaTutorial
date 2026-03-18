package com.raghavender.java8.methodreference;

import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args) {


        EmployeeService service = new EmployeeService();
        System.out.println("//anonymous implementation");
        service.loadEmployeeFromDb()
                .stream()
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee employee) {
                        System.out.println(employee);
                    }
                });
        System.out.println("//lambda expression implementation");
        service.loadEmployeeFromDb()
                .forEach(employee -> System.out.println(employee));

        System.out.println("/Method reference static method");
        service.loadEmployeeFromDb()
                .forEach(MethodReferenceDemo::print);

        System.out.println("/Method reference static::method");

        service.loadEmployeeFromDb()
                .forEach(System.out::println);
        }



    public static void print(Employee employee){
        System.out.println(employee);

    }


}
