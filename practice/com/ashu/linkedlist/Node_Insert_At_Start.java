package com.ashu.linkedlist;

public class Node_Insert_At_Start {
	public static void main(String[] args) {
		MyNode start = new MyNode(20);
		MyNode p = start;
		for (int i = 1; i < 7; i++) {
			p.next = new MyNode(20 + 20 * i);
			System.out.print(p.data + " ");
			p = p.next;
		}
		// new node to be inserted is 10;
		MyNode x = new MyNode(10);

	}
}
