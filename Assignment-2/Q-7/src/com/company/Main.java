package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("--Question 7--");

        //example 1
        System.out.println("Example 1");
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SpiralMatrix.printDetails(matrix1);
        System.out.println();

        //example 2
        System.out.println("Example 2");
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        SpiralMatrix.printDetails(matrix2);
    }
}
