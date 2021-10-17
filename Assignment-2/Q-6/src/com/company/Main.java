package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Example-1");
        int[][] matrix1= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Input = "+ (Arrays.deepToString(matrix1)));
        System.out.println("Output = "+ (Arrays.deepToString(RotateMatrix.rotate(matrix1))));
        System.out.println();
        System.out.println("Example-2");
        int[][] matrix2= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("Input = "+ (Arrays.deepToString(matrix2)));
        System.out.println("Output = "+ (Arrays.deepToString(RotateMatrix.rotate(matrix2))));
        System.out.println();
        System.out.println("Example-3");
        int[][] matrix3= {{1}};
        System.out.println("Input = "+ (Arrays.deepToString(matrix3)));
        System.out.println("Output = "+ (Arrays.deepToString(RotateMatrix.rotate(matrix3))));
        System.out.println();
        System.out.println("Example-4");
        int[][] matrix4= {{1,2},{3,4}};
        System.out.println("Input = "+ (Arrays.deepToString(matrix4)));
        System.out.println("Output = "+ (Arrays.deepToString(RotateMatrix.rotate(matrix4))));
    }
}
