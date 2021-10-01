package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,6,4,3,2,9};
        System.out.println("Example 1");
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Unique sum Is");
        int result1 = UniqueIntSum.findUniqueSum(arr1);
        System.out.println(result1);

        int[] arr2 = {1,2,2,3};
        System.out.println("Example 2");
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Unique sum Is");
        int result2 = UniqueIntSum.findUniqueSum(arr2);
        System.out.println(result2);


    }
}
