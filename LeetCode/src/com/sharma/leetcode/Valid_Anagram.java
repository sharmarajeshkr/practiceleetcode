package com.sharma.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Problem Statement : 

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

 
 */

public class Valid_Anagram {
	public static void main(String[] args) {
		String s = "aacc";// "ab";// "rat";// "anagram";
		String t = "ccac"; // "a"; // "car"; // "nagaram";
		new Valid_Anagram().isAnagram(s, t);
		
		System.out.println(new Valid_Anagram().validateAnagram(s, t)); 

	}
	
	public boolean validateAnagram(String s, String t) {
		
		if ((s.length() != t.length()) || s == null || t == null)
			return false;
		
		char [] str1 = s.toCharArray();
        char [] str2 = t.toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        return Arrays.equals(str1,str2);
        
	}

	public boolean isAnagram(String s, String t) {

		if ((s.length() != t.length()) || s == null || t == null)
			return false;

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			if (!map.containsKey(t.charAt(i)))
				return false;
			else if ((map.containsKey(t.charAt(i))) && (map.get(t.charAt(i)) > 0)) {
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
			} else {
				return false;
			}
		}
		return true;
	}

}
