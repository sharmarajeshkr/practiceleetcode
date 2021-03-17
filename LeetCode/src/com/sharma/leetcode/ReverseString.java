package com.sharma;

/*

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.



 */


public class ReverseString {
	public static void main(String[] args) {
		String str =  "hello";		
		char []s = str.toCharArray();
		reverseString(s);
		
		
	}
	
	 public static void reverseString(char[] s) {
	        int arraylen = s.length;
	        
	        for(int i = 0 ; i <arraylen/2; i++) {
	        	char temp = s[i];
	        	s[i] = s[arraylen-1-i];
	        	s[arraylen-1-i] = temp;
	        }
	        System.out.println(s);
	 }
	 
}
