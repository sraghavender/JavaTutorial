package com.raghavender.basics.statics;

class Employee {
    int id;
    String name;
    static String company ="KFG";


    public void show() {
        System.out.println("id: " + id + "name: " + name + "company: " + company);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee.company = "ZFG";
        emp1.id =1;
        emp1.name="one";
        emp2.id =2;
        emp2.name="two";
        emp1.show();
        emp2.show();
    }

}
