package com.company;

import java.util.Arrays;

public class minDistance {
    public static int dist(String[] words, String word1, String word2){
        int x = -1;
        int y = -1;
        int shortDist = words.length;

        for( int i=0; i<words.length; i++){
            if (words[i].equals(word1))
                x=i;
            for(int j=0; j<words.length; j++){
                if(words[j].equals(word2))
                    y=j;
            }
            if (x!=-1&& y!=-1)
                shortDist = Math.min(shortDist,Math.abs(x-y));

        }

        return shortDist;
    }
    public static void printDistance(String[] words, String word1, String word2){

        System.out.println(Arrays.toString(words));
        System.out.println("word 1 = "+ word1);
        System.out.println("word 2 = "+ word2);
        System.out.println("Minimum Distance = "+ minDistance.dist(words,word1,word2));
        System.out.println();

    }
}
