package com.company;

public class IsomorphicCheck {
    public static boolean isomorphic(String s, String t) {
        int[] x = new int[256];
        int[] y = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (x[s.charAt(i)] == 0 && y[t.charAt(i)] == 0) {
                x[s.charAt(i)] = t.charAt(i);
                y[t.charAt(i)] = s.charAt(i);

            } else if (x[s.charAt(i)] != t.charAt(i) || y[t.charAt(i)] != s.charAt(i)) return false;

        }
        return true;

    }

}