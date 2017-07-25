package com.ashu.test;

public class InsertDashes {
	public static void main(String[] args) {
		String str = "025468";
		char[] numbers = str.toCharArray();
		String result = "";

		for (int i = 0; i < numbers.length - 1; i++) {
			int value1 = Character.getNumericValue(numbers[i]);
			int value2 = Character.getNumericValue(numbers[i + 1]);
			result = result + value1;
			if (value1 % 2 == 0 && value2 % 2 == 0) {
				result = result + "-";
			}
		}
		result = result + numbers[numbers.length - 1];
		System.out.println(result);
	}
}
