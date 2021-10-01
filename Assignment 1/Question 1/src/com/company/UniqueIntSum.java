package com.company;

public class UniqueIntSum {
        public static int findUniqueSum ( int[] nums) {
            int sum = 0;
            int [] countArray = new int [50];
            for (int i=0; i< nums.length; i++)
            {
                countArray[nums[i]]++;
            }
            for( int i=0 ; i <countArray.length; i++)
            {
                if ( countArray[i]==1 )
                    sum += i;
            }
            return sum;
        }
    }

