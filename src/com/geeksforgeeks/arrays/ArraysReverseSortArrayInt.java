package com.geeksforgeeks.arrays;

public class ArraysReverseSortArrayInt {
	static int arr[] = { 5, 2, 0, 43, 6, 7777, 8, 7, 1 };
	static int length = arr.length;

	public static void main(String[] args) {
		 sortArray(arr);
	}

	public static void sortArray(int arr[]) {
		int temp = 0;
		int length = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] rearrange(int[] new_arra, int n) {
		int temp[] = new int[n];
		int small_num = 0, large_num = n - 1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (flag) {
				temp[i] = new_arra[large_num--];
			} else {
				temp[i] = new_arra[small_num++];
			}
			flag = !flag;
		}
		for (int j = 0; j < new_arra.length; j++) {
			System.out.println(temp[j]);
		}
		return temp;
	}

	public int[] sortArr(int[] arr) {
		// code here
		int length = arr.length - 1;
		// int[] tmp=new int[arr.length];
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == length) {
				length = length - 1;
			}
			if (arr[i] > arr[length]) {
				tmp = arr[i];
				arr[i] = arr[length];
				arr[length] = tmp;
			}
			// length = length - i;
			System.out.println(arr[i]);
		}
		return arr;
	}
	public static int[] reverserArray(int[] arr){
	
		for (int i = 0; i < arr.length; i++) {
			for (int  q = 0;  q < arr.length;  q++) {
				
			}
		}
		return arr;
	}
}
