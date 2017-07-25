package com.ashu.basicquestions;

import java.util.Scanner;

public class PrimeNumbers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter value to be checked as prime");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				count++;
				System.out.println(n + ": not prime");
				break;
			}
		}
		if (count == 0) {
			System.out.println(n + ": is prime");
		}
	}
}
