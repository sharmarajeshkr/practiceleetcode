package com.sharma.leetcode;
/*
 
 Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
Example 3:

Input: s = "a"
Output: "a"
Example 4:

Input: s = "ac"
Output: "a"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters (lower-case and/or upper-case),
 
 
 
 */

public class Longest_Palindromic_Substring {
	public static void main(String[] args) {
		String string = "abccccdd";//"bb"; //"ac";// "a"; //"cbbd"; // "babad";		
		String str = new Longest_Palindromic_Substring().longestPalindrome(string);
		System.out.println(str);
	}
	
	 int maxlen = 0;
	 int start = 0;
	 int end = 0;
	 
	 public String longestPalindrome(String s) {
		 if (s == null || s.length()==0) return "";
			 
		 for (int i = 0 ; i <s.length();i++) {
			 
				int len =  foundPosition(i, i, s);			 
				int len1 =  foundPosition(i, i+1, s);				
				len = Math.max(len, len1);
				if ((end-start) < len) {
					
					start = i - (len-1)/2;
					end = i + len/2;
				}
				
		 }
		 		
		 return s.substring(start,end+1);
	 }
	 
	
	 
	 
		/*
		 * public void getSubString(int left,int right,String s) {
		 * 
		 * while(left > 0 && right < s.length()) { if(s.charAt(left) == s.charAt(right))
		 * { left--; right++; }else break; } int len = right - left - 1; if (len >
		 * maxlen) { maxlen = len; start = left + 1; end = right -1; } }
		 */





public int foundPosition(int start, int end, String str) {
	 while ( start >=0 && end <str.length() &&  str.charAt(start) == str.charAt(end)) {
		 start--;end++;
	 }
	 return end-(start+1);
	 
}

}
