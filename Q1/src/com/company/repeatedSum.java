package com.company;

import java.util.Arrays;

public class repeatedSum {
    public static int repeatingSum(int[] nums) {
        boolean value = true;
        int sum = 0;
        int result = 0;

        for(int val = 0; val < nums.length; val++){
            result += nums[val];
        }

        for (int val1 = 0; val1 < nums.length; val1++){
            value =true;
            for (int val2 = 0; val2 <nums.length; val2++) {
                if (nums[val1] == nums[val2] && val2!=val1) {
                    value =false;
                    break;
                }
            }
            if(value ==true) {
                sum += nums[val1];
            }
        }
        return (result - sum)/2;
    }
}

