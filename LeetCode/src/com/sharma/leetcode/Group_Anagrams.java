package com.sharma.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Problem Statement : 
 
 Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lower-case English letters.

 * 
 */

public class Group_Anagrams {
	public static void main(String[] args) {
		String[] strs = { "" };// {"a"};// { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> list = new Group_Anagrams().groupAnagrams(strs);
		System.out.println(list);

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		if (strs.length == 0 || strs == null)
			return new ArrayList<>();
		for (String s : strs) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			if (!map.containsKey(key))
				map.put(key, new ArrayList<>());
			map.get(key).add(s);
		}
		return new ArrayList<>(map.values());
	}

}
