//How to program to print first non repeated character from String?

package com.ashu.stringsquests;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		System.out.println("enter a sring");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = FirstNonRepeated(s);
		System.out.println("the first non repeated character is:" + c);

	}

	public static Character FirstNonRepeated(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (hm.get(c) == 1) {
				return c;
			}
		}
		return null;
	}
}