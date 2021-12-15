package com.geeksforgeeks.arrays;
//Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pair {
	long first, second;

	public pair(long first, long second) {
		this.first = first;
		this.second = second;
	}
}

public class ArraysMinMaxArray {
	public static void main(String[] args) throws IOException {
		long[] a1 = { 12, 23, 45, 355, 555, 1, 1 };
		Compute.getMinMax(a1, 7);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the
														// testcases
		while (t-- > 0) {
			long n = Long.parseLong(br.readLine().trim());
			long a[] = new long[(int) (n)];
			// long getAnswer[] = new long[(int)(n)];
			String inputLine[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				a[i] = Long.parseLong(inputLine[i]);
			}

			Compute obj = new Compute();
			pair product = obj.getMinMax(a, n);
			System.out.println(product.first + " " + product.second);

		}
	}
}

class Compute {
	static pair getMinMax(long a[], long n) {
		// Write your code here
		long max = 0;
		long min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(min + " and " + max);
		return new pair(min, max);
	}

//	public static int getMaximumValueUsingRecursion(int[] numbers, int a, int n) {
//		return a >= numbers.length ? n : Math.max(n, max(numbers, a + 1, numbers[a] > n ? numbers[a] : n));
//	}

//	private static int getMinimumValueUsingRecursion(int[] numbers, int a, int n) {
//		return a == numbers.length ? n : Math.min(n, min(numbers, a + 1, numbers[a] < n ? numbers[a] : n));
//	}
}
