package com.company;

import java.util.Comparator;

public class DateOfBirthComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDateofBirth().compareTo(o2.getDateofBirth());
    }
}
