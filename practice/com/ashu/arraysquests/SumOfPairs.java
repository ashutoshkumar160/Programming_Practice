// How to find all pairs on integer array whose sum is equal to given number?
//For example if input integer array is {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}.

package com.ashu.arraysquests;

public class SumOfPairs {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 3 };
		int target = 15;
		int s = 0;
		int[] arr1 = new int[10];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					arr1[s++] = arr[i];
					arr1[s++] = arr[j];
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
