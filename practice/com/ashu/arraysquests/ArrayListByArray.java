package com.ashu.arraysquests;

public class ArrayListByArray {
	public static void addValue(int[] num, int b) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				num[i] = b;
				break;
			}
		}
	}

	public static void deleteValue() {

	}

	public static int getValue(int[] num, int b) {
		int p = 0;
		for (int i = 0; i < num.length; i++) {
			if (i == b) {
				p = num[i];
			}
		}
		return p;
	}

	public static int sizeOfArray(int[] num) {
		return num.length;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		int loadFactor = a.length / 2;
		for (int i = 0; i < a.length; i++) {
			if (i < loadFactor) {
				a[i] = i + 1;
				System.out.print(" " + a[i]);
			} else {
				System.out.println(" ");
				int[] b = new int[a.length * 2];
				for (int j = 0; j < loadFactor; j++) {
					b[j] = a[j];
				}
				a = b;
				for (int i1 = 0; i1 < a.length; i1++) {
					System.out.print(" " + a[i1]);
				}
				break;
			}
		}
		addValue(a, 12);
		System.out.println(" ");
		for (int i1 = 0; i1 < a.length; i1++) {
			System.out.print(" " + a[i1]);
		}
		System.out.println(" ");
		System.out.println(" " + getValue(a, 3));
		System.out.println(" " + sizeOfArray(a));

	}
}
