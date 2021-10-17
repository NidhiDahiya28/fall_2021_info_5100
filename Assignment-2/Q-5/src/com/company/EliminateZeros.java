package com.company;

import java.util.Arrays;

public class EliminateZeros {
    public static int[] moveZeros(int[] nums) {

        int counter = 0;

        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                counter++;
            }
            if (nums[i] != 0) {
                nums[i - counter] = nums[i];
            }


        }
        for (int i = 0; i < counter; i++) {
            nums[len - counter + i] = 0;


        }

        return nums;

        }

}
