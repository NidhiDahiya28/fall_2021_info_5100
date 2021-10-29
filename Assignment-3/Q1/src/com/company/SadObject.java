package com.company;

public class SadObject extends MoodyObject{
    public String getMood(){
        return " Sad";
    }
    public void expressFeeling(){
        System.out.println("waah 'boo hoo' 'weep' 'sob'");
    }
    public String toString(){
        return"Subject cries a lot";
    }
}
