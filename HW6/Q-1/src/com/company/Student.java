package com.company;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateofBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public Student(int id, String name, double gpa, Date dateofBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateofBirth = dateofBirth;
    }
}
