package com.ashu.arraysquests;

import java.util.Scanner;
//import java.util.logging.Logger;

public class MyArrayList {
	// private static final Logger LOGGER =
	// Logger.getLogger(MyArrayList.class.getName());

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter initial capacity of array");
		int initialCapacity = sc.nextInt();
		int lf = (int) ((int) initialCapacity * (0.75));
		int a[] = new int[initialCapacity];
		for (int i = 0; i < initialCapacity; i++) {
			a[i] = -1;
		}
		System.out.println("enter the values to be inserted");
		for (int i = 0; i < a.length; i++) {
			if (i < lf) {
				System.out.println("enter value");
				a[i] = sc.nextInt();

			} else {
				System.out.println("loadfactor crossed");
				initialCapacity = initialCapacity * 2;
				lf = (int) ((int) initialCapacity * (0.75));
				int[] an = new int[initialCapacity];
				for (int j = 0; j < a.length; j++) {
					an[j] = a[j];
				}
				a = an;
			}
		}
	}

}
