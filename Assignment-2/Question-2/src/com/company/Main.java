package com.company;

public class Main {

    public static void main(String[] args) {
       Add sum = new Add();
        System.out.println( Add.findSum(2,3));
        System.out.println( Add.findSum(4,9,12));
        System.out.println( Add.findSum(4, 5.0));
        System.out.println( Add.findSum(15.5,5));
        System.out.println( Add.findSum(1.0,6.4));
    }
}
