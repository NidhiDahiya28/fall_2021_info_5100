package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Example 1");
	    String ransomeLetter1 = "a";
        System.out.println(ransomeLetter1);
        String magazine1 = "b";
        System.out.println(magazine1);
        boolean result1 = CheckStrings.willMake(ransomeLetter1,magazine1);
        System.out.println("The result is" + " " + result1);
        System.out.println();

        System.out.println("Example 2");
        String ransomeLetter2 = "aa";
        System.out.println(ransomeLetter2);
        String magazine2 = "ab";
        System.out.println(magazine2);
        boolean result2 = CheckStrings.willMake(ransomeLetter2,magazine2);
        System.out.println("The result is" + " " + result2);
        System.out.println();

        System.out.println("Example 3");
        String ransomeLetter3 = "aa";
        System.out.println(ransomeLetter3);
        String magazine3 = "aab";
        System.out.println(magazine3);
        boolean result3 = CheckStrings.willMake(ransomeLetter3,magazine3);
        System.out.println("The result is" + " " + result3);


    }
}
