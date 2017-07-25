package com.ashu.arraysquests;

import java.util.ArrayList;

public class RemoveDuplicateElementArray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(2);
		al.add(3);
		System.out.println(al);
		System.out.println(al.size());
		int c = removDuplicte(al);
		System.out.println(c);
		System.out.println(al);
	}

	public static int removDuplicte(ArrayList<Integer> a) {
		int j = 0;
		int count = 1;

		for (int i = 0; i < a.size(); i++) {
			if (a.get(j) != a.get(i)) {
				a.set(++j, a.get(i));
				count++;
			}
		}
		return count;

	}

}
