package com.company;



public class Main {
    public static void main(String args[]) {
        int[][] room = {
                {0, 0, 0, 0},
                {-1, 0, 0, 0},
                {0, -1, 0, 0},
                {1, 0, 0, 0}
        };
        Roomba roomba = new Roomba(room);
    }
}