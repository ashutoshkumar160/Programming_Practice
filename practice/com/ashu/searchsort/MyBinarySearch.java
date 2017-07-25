package com.ashu.searchsort;

import java.util.Scanner;

public class MyBinarySearch {
	public static void main(String[] args) {

		// ask user to enter array length.
		int first, mid, last, search, c, n, arr[];
		System.out.println("enter the number of elements in array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		// create an array to store elements to be ssearched first.
		arr = new int[n];
		System.out.println("enter intergers");

		// store the numbers in the array.
		for (c = 0; c < n; c++) {
			arr[c] = sc.nextInt();
		}

		System.out.println("enter the value to be searched");
		search = sc.nextInt();

		first = 0;
		last = n - 1;

		while (first <= last) {
			mid = (first + last) / 2;

			if (arr[mid] == search) {
				System.out.println(search + " " + "found at location" + " " + (mid + 1) + ".");
				break;
			} else if (arr[mid] < search) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		if (first > last) {
			System.out.println("no such element is present");
		}
	}
}
