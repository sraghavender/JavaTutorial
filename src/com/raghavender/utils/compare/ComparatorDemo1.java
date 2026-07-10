package com.raghavender.utils.compare;

import java.util.*;

class Student {
    int age;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class ComparatorDemo1 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(12, "Ajay"));
        students.add(new Student(15, "Rana"));
        students.add(new Student(19, "Vijay"));
        students.add(new Student(13, "Raj"));

        System.out.println(students);

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.age > b.age)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(students, com);

        System.out.println(students);
    }
}
