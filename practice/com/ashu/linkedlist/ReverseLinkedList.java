package com.ashu.linkedlist;

import java.util.Scanner;

public class ReverseLinkedList {
	public MyNode head;

	public static void main(String[] args) {
		ReverseLinkedList rll = new ReverseLinkedList();
		int i = 0;
		for (i = 1; i < 11; i++) {
			rll.addNode(i * 2);
		}
		/*
		 * rll.addNode(4); rll.addNode(6); rll.addNode(8); rll.addNode(10);
		 * rll.addNode(12);
		 */
		rll.MyTraverse();
		System.out.println("\n");
		rll.myReverseMethod();
		rll.MyTraverse();
	}

	public void MyTraverse() {

		MyNode temp = head;
		while (true) {
			if (temp == null) {
				break;
			}
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
	}

	public void myReverseMethod() {

		MyNode prev = null;
		MyNode current = head;
		MyNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void addNode(int x) {
		MyNode n = new MyNode();
		n.data = x;
		MyNode temp = head;
		while (true) {
			if (temp == null) {
				head = n;
				break;
			} else if (temp.next == null) {
				temp.next = n;
				break;
			} else {
				temp = temp.next;
			}
		}
	}
}
