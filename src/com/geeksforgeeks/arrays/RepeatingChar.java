package com.geeksforgeeks.arrays;

import java.util.HashMap;
import java.util.Map;

//[10,20,30,10,20,20]o/p-

/*[1:17 PM] Saranya Selvakumar
10 : 2
​[1:18 PM] Saranya Selvakumar
20 : 3
​[1:18 PM] Saranya Selvakumar
30 : 1*/

public class RepeatingChar {
	
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 10, 20, 20 };
		getCOunt(arr);
	}

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

}
