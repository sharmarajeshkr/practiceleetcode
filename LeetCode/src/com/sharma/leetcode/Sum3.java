package com.sharma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/*

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []



 */




public class Sum3 {
	public static void main(String[] args) {
		     // [3,0,-2,-1,1,2] [1,2,-2,-1]   {-1,0,1,2,-1,-4};
		int [] nums =  {3,0,-2,-1,1,2};
		threeSum(nums);
	}
	
	 public static List<List<Integer>> threeSum(int[] nums) {
		 if (nums.length == 0) return new ArrayList<>();
		 
		 Arrays.sort(nums);
		 
		 int i = 0 , j = i+1;
		 int k = nums.length -1;		 
		 Set<List <Integer>> set = new HashSet<>();
		 
		 // {-1,0,1,2,-1,-4}
		 // { -4 ,-1 , -1 , 0 ,1 ,2}
		 int sum = 0;
		 while (j < k) {
			 
			 sum = nums[i]+ nums[j]+ nums[k];
			 
			 if (sum ==0) {
				 set.add(Arrays.asList( nums[i] ,nums[j] ,nums[k] ));
				 j++; k--;
			 }else if (sum >0) {
				 k--;
			 }else {
				 i++;
				 j++;
			 }
		 }	 
		 
		 System.out.println( set.stream().collect(Collectors.toList()));
		return  set.stream().collect(Collectors.toList());
	        
	  }

}
