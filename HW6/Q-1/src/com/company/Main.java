package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        List<Student>studentsList = new ArrayList<Student>();

        Date birthDAte =new SimpleDateFormat("yyyy-MM-dd").parse("1991-07-28");
        studentsList.add(new Student (1, "Nids",3.9,birthDAte));

        Date birthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("1991-07-05");
        studentsList.add(new Student(2,"Kushal",4,birthDate1));

        Date birthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1991-02-28");
        studentsList.add(new Student(3,"Pulkit",3.8,birthDate2));

        Date birthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("1991-01-01");
        studentsList.add(new Student(4,"Ankur", 3.7, birthDate3));

        Date birthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("1991-07-01");
        studentsList.add(new Student(5, "John", 3.8, birthDate4));

        Collections.sort(studentsList, new NameComparator());
        for(Student sd1: studentsList){
            System.out.println(sd1.getName());
        }

        Collections.sort(studentsList, new GpaComparator());
        for(Student sd1: studentsList){
            System.out.println(sd1.getGpa());
        }

        Collections.sort(studentsList, new DateOfBirthComparator());
        for(Student sd1 : studentsList){
            System.out.println(sd1.getDateofBirth());
        }

    }
}
