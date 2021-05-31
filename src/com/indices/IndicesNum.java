package com.indices;

import java.util.HashMap;
import java.util.Map;

public class IndicesNum {
	static int[] nums={1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		System.out.println();
//		int[] op=twoSum(nums, 7);
		int[] op=twoSum1(nums, 17);
		System.out.println("["+op[0]+","+op[1]+"]");
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static  int[] twoSum1(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
