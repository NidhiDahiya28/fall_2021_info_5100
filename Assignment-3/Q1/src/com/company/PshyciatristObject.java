package com.company;

public class PshyciatristObject {
    public void examine(MoodyObject mood){
        System.out.println("How are you feeling today?");
        mood.queryMood();
    }
    public void observe(MoodyObject mood){
        mood.expressFeeling();
        System.out.println("Observation: "+ mood.toString());
    }
}
