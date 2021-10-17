package com.company;

public class Transpose {
        public static int[][] findTrans(int[][] org) {
            int x = org.length;
            int y = org[0].length;
            int[][] trans= new int[y][x];

            for (int i=0; i<x; i++){
                for(int j=0; j<y; j++){
                    trans[j][i]= org[i][j];
                }
            }
            return trans;



    }
}
