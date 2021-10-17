package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Example-1");
        char[] input1 ={'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        CompressArray.compressChar(input1);
        System.out.println();
        System.out.println("Example-2");
        char[] input2 ={'a'};
        CompressArray.compressChar(input2);
        System.out.println();
        System.out.println("Example-3");
        char[] input3 ={'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        CompressArray.compressChar(input3);
        System.out.println();
        System.out.println("Example-4");
        char[] input4 ={'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        CompressArray.compressChar(input4);
        System.out.println();



    }
}
