package com.lovetolearn.doublylinkedlist;

import com.lovetolearn.doublylinkedlist.DoublyLinkedList.Node;

public class SearchOperations {

	public static void searchPositionOfElement(DoublyLinkedList list, int value) {

		Node node = list.head;
		int count = 0;

		if (list == null || list.head == null) {
			System.out.println("list is empty");
			return;
		}

		else {

			while (value != node.data) {
				if (node.next == null) {
					System.out.println("element not found at given list");
					return;
				}
				node = node.next;
				count++;

			}

			System.out.println("element found at position" + count);

		}

	}

	public static void searchMiddleNode(DoublyLinkedList list) {

		Node slwPtr = list.head;
		Node fastPtr = list.head;

		while (fastPtr != null && fastPtr.next != null) {

			slwPtr = slwPtr.next;
			fastPtr = fastPtr.next.next;

		}

		System.out.println("Middle element " + slwPtr.data);

	}

	public static void findNthNodeFromEnd(DoublyLinkedList list, int n) {

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
