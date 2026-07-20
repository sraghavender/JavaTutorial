package com.raghavender.reflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMethodCall {
    public static void main(String[] args) throws IllegalAccessException,IllegalArgumentException, InvocationTargetException {
        Employee employee = new Employee("Eon",45);

        Method[] employeeMethods =employee.getClass().getDeclaredMethods();

        for(Method employeeMethod: employeeMethods){
            if(employeeMethod.getName().equals("sayName")){
                employeeMethod.invoke(employee);
            }

        }

    }
}
