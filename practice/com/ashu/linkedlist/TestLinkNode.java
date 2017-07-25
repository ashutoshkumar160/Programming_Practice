//create a link list from scratch in java..
package com.ashu.linkedlist;

public class TestLinkNode {

	public static void main(String[] args) {
		MyNode start = new MyNode(20);
		MyNode p = start;
		for (int i = 1; i < 5; i++) {
			p = p.next = new MyNode(20 + 11 * i);
		}
		for (p = start; p != null; p = p.next) {
			System.out.print(p.data + " ");
		}
		for (p = start; p != null; p = p.next) {
			System.out.println(p);
		}
	}
}
