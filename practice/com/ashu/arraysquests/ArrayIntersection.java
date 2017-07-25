// Write a program to find intersection of two sorted array in Java?
//ex- {1,22,13,4,5,61,74,8,9} , {32,41,53,26,22,61}->{22,61}
package com.ashu.arraysquests;

public class ArrayIntersection {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 22, 13, 4, 5, 61, 74, 8, 9 };
		int[] b = new int[] { 32, 41, 53, 26, 22, 61 };
		// we can get intersection by two ways- hashset, without api
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}
}
