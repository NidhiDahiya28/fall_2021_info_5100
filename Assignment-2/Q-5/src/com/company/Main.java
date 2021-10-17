package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example-1");
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.println("The Input Array is = " + Arrays.toString(nums1));
        System.out.println("The Output Array is = "+Arrays.toString(EliminateZeros.moveZeros(nums1)));
        System.out.println();
        System.out.println("Example-2");
        int[] nums2 = {0};
        System.out.println("The Input Array is = " + Arrays.toString(nums2));
        System.out.println("The Output Array is = "+Arrays.toString(EliminateZeros.moveZeros(nums2)));


    }

}


