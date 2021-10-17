package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Example 1");
        String nums1 = "11";
        String nums2 = "123";
        AddingStrings.printDetails(nums1, nums2);
        System.out.println();

        System.out.println("Example 2");
        String nums3 = "456";
        String nums4 = "77";
        AddingStrings.printDetails(nums3, nums4);
        System.out.println();

        //example 3
        System.out.println("Example 3");
        String nums5 = "0";
        String nums6 = "0";
        AddingStrings.printDetails(nums5, nums6);
    }
}
