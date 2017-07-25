package com.ashu.test;

import java.util.Scanner;

public class MyFrog {
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of hopes");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		int[] array = { a, b, c, d };
		int k = 0;

		for (int i = 0; i < array.length; i++) {
			int n = array[i];
			int x = n / 3;
			int y = n % 3;
			int z = x * 35;

			switch (y) {
			case 0:
				k = 0 + z;
				break;
			case 1:
				k = 20 + z;
				break;
			case 2:
				k = 30 + z;
				break;
			case 3:
				k = 35 + z;
				break;
			}
			System.out.println(k);
		}
	}
}
