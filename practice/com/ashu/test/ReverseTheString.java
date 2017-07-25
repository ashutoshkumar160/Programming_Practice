package com.ashu.test;

public class ReverseTheString {
	public static void main(String[] args) {
		String name = "John Doe is name My";

		String[] words = name.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}
