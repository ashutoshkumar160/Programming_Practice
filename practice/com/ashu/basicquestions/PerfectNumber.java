package com.ashu.basicquestions;
public class PerfectNumber {
	public static boolean isPerfect(int n) {
		int p = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				p = p + i;
			}
		}
		if (p == n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPerfect(45));
	}
}
