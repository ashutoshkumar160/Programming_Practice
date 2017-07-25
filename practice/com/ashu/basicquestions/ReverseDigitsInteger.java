package com.ashu.basicquestions;

import java.util.Scanner;

/*Reverse digits of an integer.
Example1:
x = 123,
return 321
Example2:
x = -123,
return -321
Return 0 if the result overflows and does not fit in a 32 bit signed integer
int Solution::reverse(int A) {*/

public class ReverseDigitsInteger {

	public static void main(String[] args) {
		System.out.println("enter an integer to reverse:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		while (a != 0) {
			result = (result * 10) + (a % 10);
			a = a / 10;
		}
		System.out.println(result);
		sc.close();
	}
}
