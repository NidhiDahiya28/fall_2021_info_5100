package com.company;

public class CheckStrings {
    public static boolean willMake(String ransomeLetter, String magazine) {
        int[] checkBox = new int[26];
        for (char x : magazine.toCharArray())
            ++checkBox[x - 'a'];

        for (char x : ransomeLetter.toCharArray())
            if (--checkBox[x - 'a'] < 0)
                return false;
            return true;
    }
}
