package com.company;

abstract class MoodyObject {
    abstract String getMood();
    abstract void expressFeeling();
    public void queryMood(){
        System.out.println("I feel "+ getMood()+" today!!");
    }
}
