package com.ashu.arraysquests;

/*Given an array of integers, every element appears twice except for one. Find that single one.
Note:Your algorithm should have a linear runtime complexity. Could you implement it 
without using extra memory?*/

public class UniqueInteger {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		/*
		 * int result = 0; for (int i : nums) { result = result ^ i; } return
		 * result;
		 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					nums[i] = -1;
					nums[j] = -1;
				}
			}
		}
		int p = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (nums[i] > 0) {
				p = nums[i];
			}
		}
		System.out.println("");
		return p;

	}
}
