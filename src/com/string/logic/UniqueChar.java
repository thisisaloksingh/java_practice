package com.string.logic;

public class UniqueChar {

	public static void main(String[] args) {
		System.out.println("Is Unique :"+isUniqueChar2("uest"));

	}

	public static boolean isUniqueChar(String s) {
		int checker = 0;
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
			System.out.println((1 << val));
			System.out.println(checker);
		}
		return true;
	}

	public static boolean isUniqueChar2(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length()-1; j >= 1; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isUniqueChar3(String s) {

		if (s.length() > 128) {
			return false;
		}
		
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			System.out.println(val);
			System.out.println(char_set[val]);
			if(char_set[val]){
				return false;
			}
		}
		return true;
	}

}
