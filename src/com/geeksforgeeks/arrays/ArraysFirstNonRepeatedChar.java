package com.geeksforgeeks.arrays;

public class ArraysFirstNonRepeatedChar {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	public static void main(String[] args) {
		String s="wteest";
		System.out.println(s.charAt(returnFNRChar(s)));
		
	}

	static void getCharCountArray(String str) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	public static int returnFNRChar(String str) {
		getCharCountArray(str);
		int index = -1, i;

		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}

		return index;
	}

}
