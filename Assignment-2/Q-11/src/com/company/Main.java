package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Example 1");
        String str1 = "the sky is blue";
        System.out.println(str1);
        System.out.println(ReversingStr.revertStr(str1));
        System.out.println();

        System.out.println("Example 2");
        String str2 = "  hello world  ";
        System.out.println(str2);
        System.out.println(ReversingStr.revertStr(str2));
        System.out.println();

        System.out.println("Example 3");
        String str3 = "a good  example";
        System.out.println(str3);
        System.out.println(ReversingStr.revertStr(str3));
        System.out.println();
    }
}
