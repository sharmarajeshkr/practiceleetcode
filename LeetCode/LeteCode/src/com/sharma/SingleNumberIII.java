package com.sharma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumberIII {
	public static void main(String[] args) {
		int [] nums = {1,2,1,3,2,5};
		
		singleNumber(nums);
		
	}
	
	public static int[] singleNumber(int[] nums) {
        List<Integer> value = new ArrayList();
        int[] res = new int[2];                   
        int k=0;
		Arrays.sort(nums);
		
		// {1,2,1,3,2,5};
		// 1, 1 2 2 3 5
		
		 for (int i=0;i<nums.length-1;i++){
	            if(nums[i]==nums[i+1]){
	                i++;
	            }else{
	               res[k] = nums[i];
	               k++;
	            }
	        }
	                    
	        if(k==1){
	          res[k] = nums[nums.length-1];   
	        }
	       
	        return res;  
		
		    }

}
