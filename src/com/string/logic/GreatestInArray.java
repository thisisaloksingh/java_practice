package com.string.logic;

public class GreatestInArray {

	public static void main(String[] args) {
		greatesInArray();
	}

	private static int greatesInArray() {
		int arr[] = { 2, 13, 4, -2, -9 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		return max;
	}
}
