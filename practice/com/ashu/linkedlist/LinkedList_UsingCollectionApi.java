package com.ashu.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_UsingCollectionApi {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Orange");
		ll.add("Apple");
		ll.add("Grape");
		ll.add("Banana");

		// System.out.println(ll);
		// System.out.println("Size of the linked list: " + ll.size());
		// System.out.println("Is LinkedList empty? " + ll.isEmpty());
		// System.out.println("Does LinkedList contains 'Grape'? " +
		// ll.contains("Grape"));

		// using iterator on linkedlist.
		Iterator it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// cloning the list.
		// LinkedList copy = (LinkedList) ll.clone();

		// getting sublist from our list.
		// List list=ll.subList(1, 3);

	}
}
