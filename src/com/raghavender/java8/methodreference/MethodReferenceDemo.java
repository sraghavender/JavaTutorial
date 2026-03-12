package com.raghavender.java8.methodreference;

import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        service.loadEmployeeFromDb()
                .stream()
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee employee) {
                        System.out.println(employee);
                    }
                });
    }
}
