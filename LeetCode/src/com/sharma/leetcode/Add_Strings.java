package com.sharma.leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/*
Problem Statement : 

Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.

 */

public class Add_Strings {
	public static void main(String[] args) {
		String num1 = "0";// ;"6913259244";// "9"; // "123";
		String num2 = "0";// "71103343";// "99";//"456";

		// "6913259244"
		// "71103343"

		System.out.println(new Add_Strings().addStrings(num1, num2));

	}

	public String addStrings(String num1, String num2) {

		// return Integer.valueOf(num1) + Integer.valueOf(num2)+"";

		// List<Integer> list = new ArrayList<>();
		int len = 0;

		if (num1.length() > num2.length()) {
			len = (num1.length()) - (num2.length());
		} else if (num1.length() < num2.length()) {
			len = (num2.length()) - (num1.length());
		}

		String s = "";
		for (int i = 0; i < len; i++)
			s += "0";

		if (num1.length() > num2.length()) {
			num2 = s + num2.trim();
		} else if (num1.length() < num2.length()) {
			num1 = s + num1.trim();

		}

		int[] ans = new int[num1.length() + 1];

		ans[ans.length - 1] = -1;
		ans[ans.length - 1] = -1;

		int k = 0;
		for (int i = 0; i < num1.length(); i++) {
			for (int j = 0; j < num2.length(); j++) {
				if (i == j) {
					ans[k] = num1.charAt(i) - '0' + num2.charAt(j) - '0';
					k++;
				}
			}
		}

		for (int i = ans.length - 1; i > 0; i--) {
			ans[i - 1] += ans[i] / 10;
			ans[i] = ans[i] % 10;
		}

		StringBuilder sb = new StringBuilder();
		boolean checkValue = true;

		for (int i = 0; i < ans.length; i++) {
			if (ans[i] == -1 && (i == ans.length - 1) && checkValue == true) {
				break;
			}
			checkValue = false;
			sb.append(ans[i]);
		}

		if (sb.toString().length() == 0) {
			return "0";
		}

		return sb.toString().replace("-1", "");

	}

}
