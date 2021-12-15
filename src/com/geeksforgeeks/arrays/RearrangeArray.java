package com.geeksforgeeks.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RearrangeArray {
	/*
	 * Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1} Output : [-1, 1, 2, 3,
	 * 4, -1, 6, -1, -1, 9]
	 */
	public static void main(String[] args) {
		int a[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		System.out.println("RearrangeArray.main()");
		System.out.println(Arrays.toString(arrangeArraymap(a)));
	}

	public static int[] fixArray(int[] a) {
		int n = a.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[j] == i) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					break;
				}
			}
		}
		for (int k = 0; k < n; k++) {
			if (a[k] != k) {
				a[k] = -1;
			}
		}

		return a;
	}

	public static int[] rearrangeArray(int a[]) {

		// Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
		// Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

		int temp;
		for (int i = 0; i < a.length;) {
			if (a[i] >= 0 && a[i] != 1) {
				temp = a[a[i]];// a[-1];
				a[a[i]] = a[i];// -1
				a[i] = temp;
			} else {
				i++;
			}
		}
		return a;
	}

	public static int[] arrangeArray(int a[]) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for(int i=0;i<a.length;i++){
			if (set.contains(i)) {
				a[i] = i;
			} else {
				a[i]=-1;
			}
		}

		return a;
	}
	public static int[] arrangeArraymap(int a[]){
		Map<Integer,Integer> map=new HashMap<>();
		int value;
		for(int i=0;i<a.length;i++){
			if(a[i]==i){
				map.put(i, a[i]);
			}else{
				map.put(i, -1);
			}
		}
		 for (Map.Entry<Integer,Integer> entry : map.entrySet()){
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	    }
		
		
		
		return a;
	}
}
