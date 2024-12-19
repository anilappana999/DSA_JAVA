package com.lovetolearn.doublylinkedlist;

import com.lovetolearn.doublylinkedlist.DoublyLinkedList.Node;

public class PrintDoubleLinkedList {

	public static void printForward(Node head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;

		}

	}

	public static void printBackward(Node tail) {

		while (tail != null) {
			System.out.println(tail.data);
			tail = tail.prev;

		}

	}

}