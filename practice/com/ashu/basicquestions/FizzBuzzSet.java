package com.ashu.basicquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]*/

public class FizzBuzzSet {
	public static void main(String[] args) {
		System.out.println("enter a new number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fizzBuzz(n));
		sc.close();
	}

	public static List<String> fizzBuzz(int n) {
		List<String> ls = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			if ((i % 3 == 0) && (i % 5 != 0)) {
				ls.add("Fizz");
				continue;
			}
			if ((i % 3 != 0) && (i % 5 == 0)) {
				ls.add("Buzz");
				continue;
			}
			if ((i % 3 == 0) && (i % 5 == 0)) {
				ls.add("FizzBuzz");
				continue;
			} else {
				String s = Integer.toString(i);
				ls.add(s);
			}
		}
		return ls;
	}
}
