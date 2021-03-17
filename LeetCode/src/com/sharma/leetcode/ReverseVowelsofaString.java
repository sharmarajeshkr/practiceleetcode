package com.sharma;

/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".
 */



public class ReverseVowelsofaString {

	public static void main(String[] args) {
		String str = "hello";
		new ReverseVowelsofaString(). reverseVowels(str);
	}
	 public String reverseVowels(String s) {
		 char[] ch = s.toCharArray();
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i = 0;i<ch.length;i++) {
	            char c = ch[i];
	            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
	                sb.append(c);
	                ch[i] = '_';
	            }	                
	        }
	        
	        char[] rev = reverse(sb.toString());
	        int j = 0;
	        for (int i = 0;i<ch.length;i++){
	            if (ch[i] == '_') ch[i] = rev[j++];
	        }
	        
	        return new String(ch);
	    }
	    
	 	public char[] reverse(String s){
	        int i = 0;
	        int j = s.length() - 1;
	        char[] ch = s.toCharArray();
	        while (i < j)
	            swap(ch, i++, j--);
	        return ch;
	    }
	    
	    public void swap(char[] ch, int a, int b){
	        char temp = ch[a];
	        ch[a] = ch[b];
	        ch[b] = temp;
	    } 
	 
}
