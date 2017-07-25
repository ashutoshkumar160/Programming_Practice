package com.ashu.basicquestions;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers2 {
	public static void main(String[] args) {
		System.out.println("enter a number to check");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList bl = allPrime(a);
		for (int i = 0; i < bl.size(); i++) {
			System.out.print(bl.get(i) + " ");
		}

	}

	public static ArrayList allPrime(int n) {
		ArrayList al = new ArrayList();
		int i = 2;
		for (i = 2; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " a ");
				continue;

			} else {
				for (int j = 3; j < n; j += 2) {
					if (i % j == 0) {
						System.out.println(i + " b ");
						continue;
					} else {
						al.add(i);
						System.out.println(i + " c ");
					}
				}
			}
		}
		return al;
	}

}
