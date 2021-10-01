package com.company;

public class AlternatingStrings {

    public static boolean checkString(String inputString )
    {

        if(Character.isLetter(inputString.charAt(0)))
        {
            for (int i = 0; i < inputString.length(); i++)
            {
                if (i%2 != 0 && Character.isLetter(inputString.charAt(i)))
                {
                    return false;
                }
                else if (i%2 == 0 && Character.isDigit(inputString.charAt(i)))
                {
                    return false;
                }
            }
            return true;

        }else if(Character.isDigit(inputString.charAt(0)))
        {
            for (int i = 0; i < inputString.length(); i++)
            {
                if (i % 2 != 0 && Character.isDigit(inputString.charAt(i)))
                {
                    return false;
                }
                if (i % 2 == 0 && Character.isLetter(inputString.charAt(i)))
                {
                    return false;
                }
            }
            return true;
        }
        return false;


    }
}
