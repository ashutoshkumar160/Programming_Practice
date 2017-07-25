package com.ashu.basicquestions;

import java.util.Scanner;

/*bool Solution::isPalindrome(int num) {   <<<<<<<<<<<<<<<<<<<<
determine whether an integer is a palindrome. Do this without extra space.
A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x 
with its digit reversed.
Negative numbers are not palindromic.
Example :
Input : 12121
Output : True
input : 123
Output : False*/

public class CheckPalindrome {
	public static void main(String[] args) {
		System.out.println("enter a integer");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		System.out.println(isPalinndrome(t));
		sc.close();
	}

	static boolean isPalinndrome(int n) {
		int p = n;
		int m = 0;
		while (n != 0) {
			m = m * 10 + n % 10;
			n = n / 10;
		}
		if (p == m) {
			return true;
		}
		return false;
	}
}
