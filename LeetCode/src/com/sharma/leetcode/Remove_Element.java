package com.sharma;

public class Remove_Element {
	
	public static void main(String[] args) {
		int [] nums = {3,2,2,3};
		int val = 3;
		int len = removeElement(nums, val);
		System.out.println(len);
	}
	
	public static int removeElement(int[] nums,int val) {
		
		
		int i = 0;
		int j = nums.length-1;
		while(i <= j) {
			if (nums[i] == val) {
				if(nums[j] == val) {
					nums[j] = -1;
					j--;					
				}else {
					nums[i] = nums[j];
					i++;
					j--;
				}
		}else {
			i++;
			}
		}
		
		return i;
	}

}

/*
 
 int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==val){
                if(nums[j]==val)
                    j--;
                else{
                    nums[i]=nums[j];
                    j--;
                    i++;
                }
            }
            else i++;
        }
        return i;
    }
 
 
 
 
 
 
 */





