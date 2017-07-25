package com.ashu.linkedlist;

public class Node_Insertion_In_Middle {
	public static void main(String[] args) {
		MyNode start = new MyNode(20);
		MyNode p = start;
		for (int i = 1; i < 5; i++) {
			p = p.next = new MyNode(20 + 11 * i);
		}
		for (p = start; p != null; p = p.next) {
			System.out.print(p.data + " ");
		}
		System.out.println(" ");
		MyNode q = new MyNode(50);
		p = start;
		while (p.next != null) {
			if (p.next.data > q.data) {
				break;
			}
			p = p.next;
		}
		q.next = p.next;
		p.next = q;
		for (p = start; p != null; p = p.next) {
			System.out.print(p.data + " ");
		}
	}
}
