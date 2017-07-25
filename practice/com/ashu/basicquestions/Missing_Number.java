package com.ashu.basicquestions;

import java.util.ArrayList;
import java.util.List;

public class Missing_Number {
	public int find_Missing_Number(List<Integer> numbers) {
		int actualSum = getSum(numbers);
		int n = numbers.size() - 1;
		System.out.println(n);
		int expectedSum = (n * (n + 1)) / 2;
		int result = actualSum - expectedSum;
		return result;

	}

	public int getSum(List<Integer> numbers) {

		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i < 5; i++) {
			numbers.add(i);
		}
		// add duplicate number.
		numbers.add(3);
		Missing_Number ms = new Missing_Number();
		System.out.println(ms.find_Missing_Number(numbers));
	}
}
