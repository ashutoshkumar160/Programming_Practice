package com.ashu.basicquestions;
public class Test8 {
	public static void main(String[] args) {
		String s1 = new String("ashu");
		String s2 = new String("ashu");
		String s3 = s1;
		System.out.println(s1 == s2);// null
		System.out.println(s1.equals(s2));// true ya false
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2));
	}
}
