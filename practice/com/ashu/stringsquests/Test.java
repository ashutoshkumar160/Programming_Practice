package com.ashu.stringsquests;

public class Test {
	public static void main(String[] args) {
		String s = "abbcddcgcryfsewtffagtaqrcafgg";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > 1 && ch[i] == ch[j]) {
					ch[i] = '1';
					ch[j] = '1';
				}
			}
		}
		char[] ch1 = new char[10];
		int j = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > '1') {
				ch1[j++] = ch[i];
			}
		}
		System.out.println(ch1[0]);
		// for (int i = 0; i < ch1.length; i++) {
		// System.out.print(ch1[i]);
		// }
	}
}