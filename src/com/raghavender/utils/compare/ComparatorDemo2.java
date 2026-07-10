package com.raghavender.utils.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp implements Comparable<Emp> {
    int id;
    String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Emp emp) {
        if (this.id < emp.id)

            return 1;
        else
            return -1;
    }
}

public class ComparatorDemo2 {

    public static void main(String[] args) {


        List<Emp> empList = new ArrayList<Emp>();

        empList.add(new Emp(20, "Shyam"));
        empList.add(new Emp(51, "Kishore"));
        empList.add(new Emp(72, "Satish"));
        empList.add(new Emp(62, "kiran"));
        empList.add(new Emp(30, "Manoj"));

        System.out.println("Unsorted list of Employees" + empList);

        Collections.sort(empList);

        System.out.println("sorted list of Employees" + empList);

    }
}
