//find that index where left sum and right sum are equal.

package com.ashu.arraysquests;
public class MiddleIndex {
	public static int findIndex(int[] nums) {
		int sumleft = nums[0];
		int sumright = nums[nums.length - 1];
		int i = 1;
		int j = nums.length - 2;
		while (true) {
			if (sumleft > sumright) {
				sumright = sumright + nums[j--];
			} else {
				sumleft = sumleft + nums[i++];
			}
			if (sumleft == sumright) {
				break;
			}
		}
		return j-2;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4,5,3, 4, 5, 6, 7, 5, 6, 7, 10,4,5 };
		System.out.println(findIndex(a));
	}
}
