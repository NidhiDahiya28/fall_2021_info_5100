package com.company;

public class Main {

    public static void main(String[] args) {
	PshyciatristObject psychiatrist = new PshyciatristObject();
    HappyObject happyDay = new HappyObject();
    SadObject sadDay = new SadObject();
    psychiatrist.examine(happyDay);
        System.out.println();
    psychiatrist.observe(happyDay );
        System.out.println();
    psychiatrist.examine(sadDay);
        System.out.println();
    psychiatrist.observe(sadDay);
    }
}
