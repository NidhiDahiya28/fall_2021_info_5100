package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input-1");
        int[][] input1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(input1));
        System.out.println("The Transpose is "+ "\n"+ (Arrays.deepToString(Transpose.findTrans(input1))));

        System.out.println("Input-2");
        int[][] input2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(input1));
        System.out.println("The Transpose is "+ "\n"+ (Arrays.deepToString(Transpose.findTrans(input2))));


    }
}
