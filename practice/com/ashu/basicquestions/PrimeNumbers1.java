package com.ashu.basicquestions;

import java.util.Scanner;

public class PrimeNumbers1 {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(isPrime(a));
		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n % 2 == 0) {
			return false;
		} else {
			for (int i = 3; i < n / 2; i = i + 2) {
				if (n % 3 == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
