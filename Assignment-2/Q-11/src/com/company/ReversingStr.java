package com.company;

public class ReversingStr {
    public static String revertStr(String s){
        String[] original = s.trim().split(" +");
        StringBuilder build = new StringBuilder();

        for(int i = original.length-1; i>=0; i--){
            build.append(original[i]);
            if(i !=0) {
                build.append(' ');
            }
        } return build.toString();


    }
}
