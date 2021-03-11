package com.sharma;

public class MergeSortedArray {
	public static void main(String[] args) {
		int []nums1 = {1,2,3,0,0,0};
		int m = 3;
		int []nums2 = {2,5,6};
		int n = 3;
		
		int i = m - 1;
        int j = n - 1;
        
        int k = m + n - 1;
        
        while (i > -1 || j > -1) {
            if (i > -1 && j > -1) {
                nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
            }
            if (i > -1 && j == -1) nums1[k--] = nums1[i--];
            if (j > -1 && i == -1) nums1[k--] = nums2[j--];
        }
		
		//merge(nums1, m, nums2, n);
		
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int [] auxarray = new int[m+n];
		int i = 0 , j = 0, k = 0;	
		
		while (i < m && j < n ) {
			if (nums1[i] < nums2[j]) {
				auxarray[k] = nums1[i]; i++; k++;
			}else {
				auxarray[k] = nums2[j]; j++; k++;
			}
		}
		
		while(i < m) {
			auxarray[k] = nums1[i]; i++; k++;
		}
		
		while(j < n) {
			auxarray[k] = nums2[j]; j++; k++;
		}
			
		System.out.println(auxarray);
	        
	    }
}


