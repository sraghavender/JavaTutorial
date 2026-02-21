package com.raghavender.collections;

import java.util.Comparator;

public class StudentRank implements Comparator<Student> {

    public int compare(Student a,Student b){
        return a.getRank()-b.getRank();
    }
}
