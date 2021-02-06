package com.sharma.leetcode;

/* Problum Description

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6


* */


import java.util.ArrayList;
import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        Running_Sum_of_1d_Array rs = new Running_Sum_of_1d_Array();
        int[] nums = {1,1,1,1};
        int []sums = rs.runningSum(nums);
        for(int s : sums){
            System.out.println(s);
        }
    }

    public int[] runningSum(int[] nums) {
        int temp = 0;
        ArrayList<Integer> tempSum = new ArrayList<Integer>();
        //int[] sums = new int[nums.]
        for (int i : nums){
            temp += i;
            tempSum.add(temp);
        }
        int[] sums = tempSum.stream().mapToInt(i->i).toArray();
        //OR
        //int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return  sums;
    }

}
