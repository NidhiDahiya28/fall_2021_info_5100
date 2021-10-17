package com.company;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralMat(int[][] matrix) {
        List<Integer> original = new ArrayList<>();
        int start = 0;
        int end = matrix.length - 1;
        int left = 0;
        int right;
        right = matrix[0].length - 1;

        while (original.size() < matrix.length * matrix[0].length) {
            for (int i = left; i <= right; i++) {
                if (original.size() == matrix.length * matrix[0].length)
                    break;
                original.add(matrix[start][i]);
            }
            for (int i = start + 1; i <= end; i++) {
                if (original.size() == matrix.length * matrix[0].length)
                    break;
                original.add(matrix[i][right]);
            }
            for (int i = right - 1; i >= left; i--) {
                if (original.size() == matrix.length * matrix[0].length)
                    break;
                original.add(matrix[end][i]);

            }
            for (int i = end - 1; i > start; i--) {
                if (original.size() == matrix.length * matrix[0].length)
                    break;
                original.add(matrix[i][left]);
            }
            start++;
            right--;
            end--;
            left++;
        }
        return original;
    }

    public static void printDetails(int[][] matrix) {
        System.out.println("The input matrix is: " + Arrays.deepToString(matrix));
        System.out.println("The spiral matrix is: " + spiralMat(matrix));
    }
}