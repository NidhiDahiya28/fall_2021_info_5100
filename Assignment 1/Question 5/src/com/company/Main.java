package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Example-1");
        String str1 = "1A3d4s5T";
        System.out.println("Input String is"+ " "+ str1);
        boolean result1 = AlternatingStrings.checkString(str1);
        System.out.println("The Result is =" + " "+ result1);
        System.out.println();

        System.out.println("Example-2");
        String str2 = "A2bb2d4";
        System.out.println("Input String is"+ " "+ str2);
        boolean result2 = AlternatingStrings.checkString(str2);
        System.out.println("The Result is =" + " "+ result2);
        System.out.println();
    }
}
