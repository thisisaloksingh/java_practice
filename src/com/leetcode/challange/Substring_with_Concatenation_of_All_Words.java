package com.leetcode.challange;

import java.util.List;

/*You are given a string s and an array of strings words of the same length. Return all starting indices of substring(s) in s that is a concatenation of each word in words exactly once, in any order, and without any intervening characters.
You can return the answer in any order.
Example 1:
Input: s = "barfoothefoobarman", words = ["foo","bar"]
Output: [0,9]
Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
The output order does not matter, returning [9,0] is fine too.
Example 2:
Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
Output: []
Example 3:
Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
Output: [6,9,12]*/

public class Substring_with_Concatenation_of_All_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words={"the","foo","the","foo"};
		new Substring_with_Concatenation_of_All_Words().findSubstring("foothebar",words );

	}

	public List<Integer> findSubstring(String s, String[] words) {
		for (int i = 0; i < words.length; i++) {
			String word=words[i];
			boolean isFound = s.indexOf(word) !=-1? true: false;
			if (isFound) {
				System.out.println("Substring_with_Concatenation_of_All_Words.findSubstring()");
			}
		}
		return null;
	}

}
