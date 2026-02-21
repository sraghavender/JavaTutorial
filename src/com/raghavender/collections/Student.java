package com.raghavender.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Student {
    private int rank;
    private String name;
    private int age;


    Student()
    {}

    Student(int rank,String name,int age){
        this.rank=rank;
        this.name=name;
        this.age=age;
    }
    public void setRank(int rank){
        this.rank=rank;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getRank(){
        return this.rank;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;

    }
    @Override
    public  String toString(){
        return "Student{"+getRank()+","+getName()+","+getAge()+"}";
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"raghavender",25);
        Student student2 = new Student(6,"balaji",24);
        Student student3 = new Student(99,"susheel",20);
        Student student4 = new Student(8,"Sinu",19);
        Student student5 = new Student(78,"Raju",21);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
// Students before sorting this list based on their rank...
        System.out.println("// Students before sorting this list based on their rank...");
        System.out.println(studentList);
        System.out.println("// Students after sorting this list based on their rank...");
        StudentRank studentRank = new StudentRank();
        Collections.sort(studentList,studentRank);
        System.out.println(studentList);

        Comparator<Student> studentAgeSort = (a,b) -> a.getAge()-b.getAge();
//Student age sorting based on age using lambda expression...
        System.out.println("//Student age sorting based on age using lambda expression...");
        Collections.sort(studentList,studentAgeSort);
        System.out.println(studentList);
    }

    }