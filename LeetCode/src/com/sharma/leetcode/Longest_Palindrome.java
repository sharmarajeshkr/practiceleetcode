package com.sharma.leetcode;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

/*
 * 
 Problem Staement : 
 	Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Example 3:

Input: s = "bb"
Output: 2
 */

public class Longest_Palindrome {
	
	public static void main(String[] args) {
		String str = "aaabbbbcccccccddddddeff";
		Map<Character,Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0 ; i<str.length();i++) {
			if( !map.containsKey(str.charAt(i))) 
				map.put(str.charAt(i), 1);			
			else if (map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), (map.get(str.charAt(i)))+1);				
						
		}
		// {a=1, b=1, c=4, d=2;
		//{a=3, b=4, c=7, d=6, e=1, f=2}
		boolean isOdd = false;
		
		for(Map.Entry<Character,Integer> e : map.entrySet()){
	        if(e.getValue()%2==0)
	            count +=  e.getValue();
	        
	        else{
	            if(isOdd == false){
	            	count +=  e.getValue();
	            	isOdd = true;
	            }	            
	            else
	                count +=  e.getValue()-1;
	        }
	        
	    }
		
		System.out.println(count);
	}

}
