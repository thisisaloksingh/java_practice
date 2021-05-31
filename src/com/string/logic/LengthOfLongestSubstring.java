package com.string.logic;

import java.io.InputStream;
import java.util.Scanner;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int a = new LengthOfLongestSubstring().lengthOfLongestSubstring(name);
		System.out.println(a);
	}

	public static int longestSubstring(String s) {
		return 0;
	}

	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (checkRepetition(s, i, j)) {
					res = Math.max(res, j - i + 1);
				}
			}
		}
		return res;
	}

	private boolean checkRepetition(String s, int start, int end) {
		int[] chars = new int[128];
		System.out.println("\n" + "TEST- b4 for -start : " + s.charAt(start) + " :" + chars[s.charAt(start)]);
		System.out.println("TEST- b4 for -end : " + s.charAt(end) + " :" + chars[s.charAt(end)]);

		for (int i = start; i <= end; i++) {
			char c = s.charAt(i);
			System.out.println("TEST- before ++ : " + c + " :" + chars[c]);
			chars[c]++;
			System.out.println("TEST- after ++ : " + c + " :" + chars[c]);
			if (chars[c] > 1) {
				System.out.println("TEST -if : " + c + " :" + chars[c]);
				System.out.println("False");
				return false;
			}
		}
		System.err.println("OUTSIDE OF  FOR LOOP");
		return true;
	}

}
