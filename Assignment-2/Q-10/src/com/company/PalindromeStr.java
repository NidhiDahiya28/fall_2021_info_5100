package com.company;

public class PalindromeStr {
    public static boolean palindromeCheck(String s){

        if (s == null)
        {
            return false;
        }
        int x = 0 ;
        int y = s.length()-1 ;
        while (x < y){
            while( x < y && !Character.isLetterOrDigit(s.charAt(x))){
                x++;
            }
            while(x < y && ! Character.isLetterOrDigit(s.charAt(y))){
                y--;
            }
            if (Character.toLowerCase(s.charAt(x)) != Character.toLowerCase(s.charAt(y))) {
                System.out.println("Explanation- " + (s.replaceAll("[^a-zA-Z]+", "").toLowerCase()) + "is not a palindrome.");
                return false;
        }
            x++;
            y--;
        }
        System.out.println("Explanation- "+ (s.replaceAll("[^a-zA-Z]+","").toLowerCase())+"is a palindrome");
        return true;
        }


    }


