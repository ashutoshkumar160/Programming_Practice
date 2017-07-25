package com.ashu.basicquestions;

import java.util.Scanner;

/*Write a function that takes a string as input and returns the string reversed.
Example:
Given s = "hello", return "olleh".
*/

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("enter a string to reverse");
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();
		System.out.println(reverseString(p));
		sc.close();
	}

	public static String reverseString(String s) {
		/*
		 * String sb=new StringBuilder(s).reverse().toString(); return sb;
		 */
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result = result + s.charAt(i);
		}
		return result;
	}
}
