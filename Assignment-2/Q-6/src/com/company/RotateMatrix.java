package com.company;

public class RotateMatrix {
    public static int[][] rotate(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<i; j++){
                int sample = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = sample;

            }
        }
        for (int i=0; i<matrix.length; i++){
            int counter = 0;
            int next = matrix.length-1;
            while(counter < next){
                int sample = matrix[i][counter];
                matrix[i][counter] = matrix[i][next];
                matrix[i][next] = sample;
                counter++;
                next--;
            }

        }
        return matrix;
    }
}
