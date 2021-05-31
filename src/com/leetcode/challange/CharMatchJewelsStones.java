package com.leetcode.challange;

import java.util.HashSet;
import java.util.Set;

public class CharMatchJewelsStones {

	public static int numJewelsInStones(String j, String s) {
		int count = 0;
		Set seta = new HashSet<>();

		for (int jj = 0; jj < j.length(); jj++) {
			seta.add(j.charAt(jj));
			System.out.println(seta);
		}
		for (int i = 0; i < s.length(); i++) {
			if (seta.contains(s.charAt(i))) {
				System.out.println(s.charAt(i));
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		System.out.println(numJewelsInStones("abc", "shdsjabdasc"));
	}

}
