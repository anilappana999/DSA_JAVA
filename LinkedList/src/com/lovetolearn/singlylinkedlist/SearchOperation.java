package com.lovetolearn.singlylinkedlist;

import com.lovetolearn.singlylinkedlist.LinkedList.Node;

public class SearchOperation {

	public static void searchPositionOfElement(LinkedList list, int value) {

		int count = 1;

		if (list == null || list.head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode = list.head;
		while (currNode.data != value) {
			currNode = currNode.next;
			count++;
			if (currNode.next == null) {
				System.out.println("Given element is not present in given linkedlist");

			}

			System.out.println(currNode.data + "is at position" + count);

		}
	}

	public static void searchMiddleNode(LinkedList list) {

		Node slowPtr = list.head;
		Node fastPtr = list.head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;

		}

		System.out.println(slowPtr.data);

	}

	public static void findNthNodeFromEnd(LinkedList list, int n) {

		Node mainNode = list.head;
		Node refNode = list.head;
		int count = 0;
		while (count < n) {
			refNode = refNode.next;
			count++;
		}

		while (refNode.next != null) {
			mainNode = mainNode.next;
			refNode = refNode.next;
		}

		System.out.println(mainNode.data);
	}

}