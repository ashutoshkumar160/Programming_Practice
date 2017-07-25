package com.ashu.test;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int largest = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any five numbers: ");
		int[] arr = new int[5];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("largest number is:" + largest);
	}
}
