package com.ashu.arraysquests;

import java.util.ArrayList;

public class RemoveArrayElement {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(4);
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(3);
		System.out.println(a);
		myRemoveElement(a, 1);
		System.out.println(a.size());
		System.out.println(a);
	}
	public static int myRemoveElement(ArrayList<Integer> a,int b){
		int j=0;
		int count = 0;
		for(int i=0;i<6;i++){
			if(a.get(i)!=b){
				a.set(j++, a.get(i));
				count++;
			}
		}
		return a.size();
	}
}
