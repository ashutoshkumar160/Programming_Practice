package com.ashu.stringsquests;

// recursion se banao aise smjh nh aayega..google karo
public class ReverseString2 {
	public static void main(String[] args) {
		String str = "happy";
		String str1 = reverseString(str);
		System.out.println(str1);
	}

	public static String reverseString(String s) {
		if (s.length() < 2) {
			return s;
		}
		String rev = reverseString(s.substring(1)) + s.charAt(0);
		return rev;
	}
}
