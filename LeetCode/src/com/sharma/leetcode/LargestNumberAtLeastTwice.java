package com.sharma;

import java.util.List;


public class LargestNumberAtLeastTwice {
	public static void main(String[] args) {
		int []nums = {0,0,2,3};//{3, 6, 1, 0};
		System.out.println(dominantIndex(nums));
	}

	public static int dominantIndex(int[] nums) {
		int secondlargest = Integer.MIN_VALUE;
		int highestValue = Integer.MIN_VALUE;
		int index = -1;
		for (int i= 0 ; i<nums.length ; i++) {
			
			if (highestValue < nums[i]) {
				index = i;
				secondlargest = highestValue;
				highestValue = nums[i];
			}else if(secondlargest < nums[i])
				secondlargest = nums[i];
			
		}
		
		return highestValue >= 2*secondlargest ? index : -1;
		
	       
    }
	
	public static int getIndex(int[] nums,int num) {
		for (int i= 0 ; i<nums.length ; i++) {
			if (nums[i] == num )
				return i;
		}
		return -1;
	}
}
