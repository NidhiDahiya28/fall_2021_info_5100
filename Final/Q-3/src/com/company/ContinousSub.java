package com.company;

import java.util.Arrays;

public class ContinousSub {
        public static int subarraySum(int[] nums, int k) {
            int count = 0;
            for (int start = 0; start < nums.length; start++) {
                for (int end = start + 1; end <= nums.length; end++) {
                    int sum = 0;
                    for (int i = start; i < end; i++)
                        sum += nums[i];
                    if (sum == k)
                        count++;
                }
            }
            return count;
        }


        public static void output(int[] n, int k){
            System.out.println("Input: n: " + Arrays.toString(n) + " ; k: " + k);
            System.out.println("Output: " + subarraySum(n, k));
            System.out.println();
        }
    }

