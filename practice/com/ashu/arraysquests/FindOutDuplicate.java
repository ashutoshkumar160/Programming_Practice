// find out duplicate number(suppose only one duplicate is there).
// to find out duplicate in (1,2,3,3,4,5)-> find the expected sum[n(n+1)/2]=42 and the real sum 
// for (int i:arr){sum=sum+i;}=18, hence the diff b/w 21-18=3. ans

package com.ashu.arraysquests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindOutDuplicate {

	public static int findDuplicate(List<Integer> nums) {
		Set<Integer> check = new HashSet<>();
		int p = 0;
		for (Integer i : nums) {
			if (!check.add(i)) {
				System.out.println("number repaeated:" + i);
				p = i;
			}
		}
		return p;
	}

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(6);
		ls.add(5);
		ls.add(4);
		ls.add(3);
		ls.add(2);
		ls.add(1);
		System.out.println(ls);
		System.out.println(findDuplicate(ls));

	}

}
