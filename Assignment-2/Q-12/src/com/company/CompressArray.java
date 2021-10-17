package com.company;

import java.util.Arrays;

public class CompressArray {
    public static int compressChar(char[] chars){
        if(chars.length==1)
            return chars.length;

        int counter = 0;
        int tracker = 0;

        while(tracker<chars.length){
            char ch = chars[tracker];
            int tracker1= tracker++;

            while(tracker<chars.length&& chars[tracker]==ch){
                tracker++;
            }
            int diff=tracker-tracker1;
            chars[counter++]=ch;
            if(diff>1)
                for(char c: Integer.toString(diff).toCharArray()){
                    chars[counter++]=c;
                }
        }
        System.out.println(Arrays.toString(chars));
        return counter;
    }
    public static void printOutput(char[] chars){
        System.out.println("The input of characters is: " + Arrays.toString(chars));
        System.out.println("The output is: " + compressChar(chars));

    }
}




