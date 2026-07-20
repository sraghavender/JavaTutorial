package com.raghavender.reflectionAPI;

import java.lang.reflect.Field;

public class ReflectionSetField {

    public static void main(String[] args) throws IllegalAccessException {
        Employee employee = new Employee("Karan", 35);
        System.out.println("The employees name before reflection change :" + employee.getName());
        Field[] Employeefield = employee.getClass().getDeclaredFields();
        for (Field field : Employeefield) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(employee, "steve");

            }
        }
        System.out.println(employee);
    }
}
