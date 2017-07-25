//How to Print duplicate characters from String?
// ex={meranaamjoker}- {m,e,r,a}

package com.ashu.stringsquests;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateString {
	public static void main(String[] args) {
		String str = "meranamjoker";
		// for (int i = 0; i < str.length(); i++) {
		// for (int j = i + 1; j < str.length(); j++) {
		// if (str.charAt(i) == str.charAt(j)) {
		// System.out.print(str.charAt(i));
		// }
		// }
		// }
		Set s = new HashSet();
		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (s.contains(a[i])) {// s-> m,e,r,a,n,
				System.out.print(a[i] + " ");
				s.remove(a[i]);
			} else {
				s.add(a[i]);
			}
		}
		// System.out.println(s);
	}
}
