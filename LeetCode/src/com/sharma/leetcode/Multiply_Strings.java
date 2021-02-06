package com.sharma.leetcode;

import java.math.BigDecimal;

/*
 Problem Statement : 
 Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 
 */

public class Multiply_Strings {
	public static void main(String[] args) {

		String num1 = "0";//"123456789"; // "123456789"; // "123";
		String num2 = "0";//"987654321"; // "987654321" ;//"456";
		// "1219 3263 1112 6352 69"
		// 1219 3263 1112 6352 64

		String result = new Multiply_Strings().multiply(num1, num2);
		System.out.println(result);
	}

	public String multiply(String num1, String num2) {
		int[] ans = new int[num1.length() + num2.length() - 1];

		for (int i = 0; i < num1.length(); i++) {
			for (int j = 0; j < num2.length(); j++) {
				ans[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}

		for (int i = ans.length - 1; i > 0; i--) {
			ans[i - 1] += ans[i] / 10;
			ans[i] = ans[i] % 10;
		}

		StringBuilder sb = new StringBuilder();
		boolean checkValue = true;
		
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] == 0 && checkValue == true) {
				continue;
			}
			checkValue = false;
			sb.append(ans[i]);
		}
		
		if(sb.toString().length() == 0) {
			return "0";
		}
		
		
		return sb.toString() ;
	}

}
