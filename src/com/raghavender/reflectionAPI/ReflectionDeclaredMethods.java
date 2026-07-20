package com.raghavender.reflectionAPI;

import java.lang.reflect.Method;

public class ReflectionDeclaredMethods {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", 30);
        Method[] methods = employee.getClass().getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }
}
