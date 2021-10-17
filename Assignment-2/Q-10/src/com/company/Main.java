package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Example 1");
        String s1 = "A man, a plan, a canal: Panama";
        PalindromeStr.palindromeCheck(s1);
        System.out.println();

        System.out.println("Example 2");
        String s2 = "race a car";
        PalindromeStr.palindromeCheck(s2);
        System.out.println();

        //example 3
        System.out.println("Example 3");
        String s3 = "malayalam";
        PalindromeStr.palindromeCheck(s3);

    }
}
