package com.lovetolearn.circularlinkedlist;

import com.lovetolearn.circularlinkedlist.CircularSinglyLinkedList.Node;

public class PrintCircularLinkedList {

	public static void printList(CircularSinglyLinkedList list) {

		if (list == null || list.last == null) {
			return;
		}

		Node first = list.last.next;
		Node last = list.last;

		while (first != last) {
			System.out.println(first.data);
			first = first.next;
		}
		
		System.out.println(first.data);

	}
}
