package com.sharma;

/*
 
 Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.
  
 */

public class Median_of_Two_Sorted_Arrays {
	public static void main(String[] args) {
			int[] num1 = {2};
			int[] num2 = {};
				
			
			System.out.println(findMedianSortedArrays(num1,num2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length == 0 && nums2.length == 0)
			return 0;
		
		
		int i =0; int j=0;
		
		int [] mergedArray = new int[ nums1.length + nums2.length];
		
		int k = 0;
		
		while( i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
            	mergedArray[k] = nums1[i]; i++; k++;
			
            }else{
            	mergedArray[k] = nums2[j]; j++; k++;
            }
		}
		
		while (i < nums1.length) {
			mergedArray[k] = nums1[i]; i++; k++;
		}
		while (j < nums2.length) {
			mergedArray[k] = nums2[j]; j++; k++;
		}
		
		int mergeLength = mergedArray.length;
		
        double median = 0;
        int h = mergeLength/2;
        if ( (mergeLength % 2) == 0) {
        	       	
        	System.out.println(mergedArray[h] );
        	System.out.println(mergedArray[ h-1] ) ;
        	median = ( (double)(mergedArray[h] ) + (double)(mergedArray[ h-1] ) )/2.0;
        	
        }else {
        	
        	System.out.println(mergedArray[h] );
        	median = ( (double)mergedArray[h]  );
        }
		
		// mergedArray[(mergedArray.length)/2];
			
		return median;
        
    }
	
	public static double findMid(int[] nums) {
		double len = (nums.length);
		return len;
	}

}
