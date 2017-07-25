package com.ashu.basicquestions;

import java.util.Vector;

public class RemoveVectorElement {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(4);
		v.add(1);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(3);
		System.out.println(v);
		int count=myRemove(v, 1);
		System.out.println(count);
		System.out.println(v);
	}
	public static int myRemove(Vector<Integer> v,Integer b){
		Integer j=0;
		Integer count=0;
		for(int i=0;i<6;i++){
			if(v.get(i)!=b){
				v.set(j++, v.get(i));
				count++;
			}
		}
		return count;
	}
}
