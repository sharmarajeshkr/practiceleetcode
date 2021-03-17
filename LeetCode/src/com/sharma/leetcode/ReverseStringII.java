package com.sharma;

/*
 
 Input: s = "abcdefg", k = 2
Output: "bacdfeg"
 
 
  
 */

public class ReverseStringII {
	
	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		reverseStr(s, k);
	}
	
	public static String reverseStr(String s, int k) {
		String result = ""; 
		if ( k ==0 || k==1)
			return s;
		if ( s.length() < 2)
			return s;
		char[] a = new char[k];
		int i = 0;
		int j = 0;
		int temp = 0;
		while(i<s.length()) {	
			int out = temp+k;
			if (j%2 !=0) {
				if (out > s.length())
					result += s.substring(i, s.length());
				else
					result += s.substring(i, out);				
			}
			else {
				a = s.substring(i, out).toCharArray();
				result += reverse(a);				
			}
			i = temp = out;			
			j++;
		}		
	    return result;
	}
	
	public static String reverse(char[] ch) {		
		int arrLen = ch.length;
		String result = ""; 
		for (int i = 0 ; i < arrLen/2 ; i++) {
			char temp = ch[i];
			ch[i] = ch[arrLen-1-i];
			ch[arrLen-1-i] = temp;			
		}
		
		for (int i =0 ; i<ch.length;i++) {
			result += ch[i];
		}
		
		
		return result;
	}

}


