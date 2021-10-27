package com.company;

import java.util.HashSet;

public class LongestStr {
    public static String longestSub(String str){
        if(str.length() <= 1){
            return str;
        }
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;
        String longestSubstring = "";

        for(int current = 0 ; current < str.length(); current ++){
            if( !set.contains(str.charAt(current) )){
                set.add(str.charAt(current));
                if(maxLen <  current - left +1 ){
                    maxLen = current - left +1;
                    longestSubstring = str.substring(left, current+1);
                }
            }else{
                while( set.contains(str.charAt(current)) ) {
                    set.remove(str.charAt(left));
                    left ++;
                }
                set.add(str.charAt(current));
            }
        }
        return longestSubstring;

    }

}
