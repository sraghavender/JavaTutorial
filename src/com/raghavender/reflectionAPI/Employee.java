package com.raghavender.reflectionAPI;

public class Employee {
    private final String name;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //The is no method to set name

    public void setAge(int age) {
        this.age = age;
    }

    public void sayName(){
        System.out.println("My name is "+name);
    }
    private void thisIsMethod(){
        System.out.println("This is private method");
    }

    public static void thisIsPublicStaticMethod(){
        System.out.println("This is public static method");
    }

    private static void thisIsPrivateStatic(){
        System.out.println("This is private static method");
    }
}
