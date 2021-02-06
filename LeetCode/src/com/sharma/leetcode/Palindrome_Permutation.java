package com.sharma.leetcode;
/*
 Problem Statement :  	
Given a string, determine if a permutation of the string could form a palindrome.

For example, "code" -> False, "aab" -> True, "carerac" -> True.

Hint:

Consider the palindromes of odd vs even length. What difference do you notice? Count the frequency of each character. 
If each character occurs even number of times, then it must be a palindrome. How about character which occurs odd number of times?
 
 
 * 
 */

import java.util.HashSet;
import java.util.Set;

public class Palindrome_Permutation {
	public static void main(String[] args) {
		// "code" -> False, "aab" -> True, "carerac" -> True.
		String s = "code";		
		Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                set.remove(s.charAt(i));   
            }
        }
        
       System.out.println(set.size());
		
		
	}

}
