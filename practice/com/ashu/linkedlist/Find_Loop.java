//find any loop that exists in given linklist.
package com.ashu.linkedlist;

public class Find_Loop {
	public static void main(String[] args) {
		MyNode start = new MyNode(20);
		MyNode p = start;
		for (int i = 1; i < 5; i++) {
			p = p.next = new MyNode(20 + 11 * i);
		}
		for (p = start; p != null; p = p.next) {
			System.out.print(p.data + " ");
		}
	}
}
