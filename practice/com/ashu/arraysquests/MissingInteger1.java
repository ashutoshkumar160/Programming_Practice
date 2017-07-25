// find missing integer
package com.ashu.arraysquests;

public class MissingInteger1 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		int sum = (10 * (10 + 1)) / 2;
		int asum = 0;

		for (int i = 0; i < a.length; i++) {
			asum = asum + a[i];
		}

		// for (int j = 0; j < a.length; j++) {
		// asum = asum + a[j];
		// }
		int miss = sum - asum;
		System.out.println("Misssing no. is " + miss);
	}
}
