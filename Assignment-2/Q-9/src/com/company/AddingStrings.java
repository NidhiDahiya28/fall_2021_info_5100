package com.company;

public class AddingStrings {
    public static String addStr(String nums1, String nums2) {
        char[] x = nums1.toCharArray();
        char[] y = nums2.toCharArray();

        int a = nums1.length() - 1;
        int b = nums2.length() - 1;
        int carry = 0;

        StringBuilder build = new StringBuilder();

        while (a >= 0 || b >= 0) {
            int sum = 0;
            if (a >= 0 && b >= 0) {
                sum = x[a] - '0' + y[b] - '0' + carry;
                a--;
                b--;
            } else if (a >= 0 && b < 0) {
                sum = x[a] - '0' + carry;
                a--;
            } else if (a < 0 && b >= 0) {
                sum = y[b] - '0' + carry;
                b--;
            }
            carry = sum / 10;
            sum = sum % 10;
            build.append(sum);

        }
        if (carry != 0)
            build.append('1');

        return build.reverse().toString();
    }

    public static void printDetails(String s1, String s2) {
        System.out.println("The input is: nums1: " + s1 + ", nums2: " + s2);
        System.out.println("The output is: " + addStr(s1, s2));
    }
}

