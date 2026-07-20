package com.raghavender.reflectionAPI;

import java.lang.reflect.Field;

public class ReflectionDeclaredFields {
    public static void main(String[] args) {
        Employee employee = new Employee("Steve",40);

       Field[] declaredFields= employee.getClass().getDeclaredFields();
       for(Field fields:declaredFields)
       {
           System.out.println(fields);
       }
    }
}
