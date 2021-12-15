package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> groupAnag(String[] strs) {
        if (strs.length == 0)
            return new ArrayList();
        HashMap<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }


    public static void output(String[] strs){
        System.out.println("Input: " + Arrays.deepToString(strs));
        System.out.println("Output: " + groupAnag(strs));
        System.out.println();
    }
}



