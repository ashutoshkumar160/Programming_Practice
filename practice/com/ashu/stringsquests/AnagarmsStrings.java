// How to check if two Strings are anagrams of each other?
//Two strings are anagrams if they are written using the same exact letters,
//ignoring space, punctuation and capitalization. Each letter should have the 
//same count in both strings. For example, Army and Mary are anagram of each other.
//hello..hello..abe kah gya>????
//yahi pr .
//to tm try karo thoda der..ok
//we need a break for some time...ok 10 mins break..fine??
//ok. 
// over & out.hahahahah :)
package com.ashu.stringsquests;

import java.util.Collections;
import java.util.HashSet;

public class AnagarmsStrings {
	public static void main(String[] args) {
		String s1 = "army";
		String s2 = "mary";
		System.out.println(isAnagram(s1, s2));
	}

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}

		char[] chars = word.toCharArray();

		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}

		return anagram.isEmpty();
	}

}
