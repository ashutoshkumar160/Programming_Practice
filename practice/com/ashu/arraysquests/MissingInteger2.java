//find two missing integers between 1,10;
package com.ashu.arraysquests;

public class MissingInteger2 {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 7, 8, 9, 10 };
		int sum = 55;
		int asum = 0;

		for (int i = 0; i < a.length; i++) {
			asum = asum + a[i];
		}

		// for (int j = 0; j < a.length; j++) {
		// asum = asum + a[j];
		// }
		int miss = sum - asum;
		System.out.println(sum);
		System.out.println(asum);
		// System.out.println("Misssing no. is " + miss);
		int firstMissing = miss - (a.length + 1);
		System.out.println("firstMissing no. " + firstMissing);
		int secondMissing = miss - firstMissing - 1;
		System.out.println("secondMissing no. " + secondMissing);
	}
}
