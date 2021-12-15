package com.geeksforgeeks.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplocate {
	static int arr[] = { 5, 2, 0, 43, 6, 7777, 8, 7, 1, 1 };

	public static void getCOunt(int arr[]) {

		int l = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < l; i++) {

			if (map.containsKey(arr[i])) {

				// map<10,10> -> value =1+1
				int val = map.get(arr[i]);
				map.replace(arr[i], val + 1);

			} else {
				map.put(arr[i], 1);
			}

		}

		for (Map.Entry<Integer, Integer> result : map.entrySet()) {
			System.out.println(result.getKey() + ":" + result.getValue());
		}

	}

	public static void main(String[] args) {
		System.out.println("ArrayDuplocate.main()");
		int arr[] = { 10, 20, 30, 10, 20, 20 };
		getCOunt(arr);
	}

	public static void sortArray(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[count]>a[j]) {
					count=i;
				}

			}
		}
	}
}

// [10,20,30,10,20,20]
