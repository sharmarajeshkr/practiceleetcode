package com.sharma;

import java.util.Arrays;

/*

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].



 */


public class SquareOfASortedArray {
	public static void main(String[] args) {
		int [] nums = {-4,-1,0,3,10};
		
		for (int i = 0 ; i< nums.length; i++) {
			nums[i] = nums[i]*nums[i];
		}
		
		Arrays.sort(nums);
		System.out.println(nums);
		
		
	}

}
