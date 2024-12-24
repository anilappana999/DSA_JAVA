package com.lovetolearn.circularlinkedlist;

import com.lovetolearn.circularlinkedlist.CircularSinglyLinkedList.Node;

public class InsertOperations {

	public static void insertAtBeginning(int value, CircularSinglyLinkedList list) {

		Node newNode = new Node(value);
		Node last = list.last;

		if (last == null) {
			last = newNode;
			list.last = last.next = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;

		}

		PrintCircularLinkedList.printList(list);

	}

	public static void insertAtEnd(int value, CircularSinglyLinkedList list) {

		Node newNode = new Node(value);
		Node last = list.last;

		if (last == null) {
			last = newNode;
			list.last = last.next = last;
		} else {
			newNode.next = last.next;
			last.next = newNode;
			list.last = newNode;
		}

		PrintCircularLinkedList.printList(list);

	}

	public static void insertAtGivenPosition(CircularSinglyLinkedList list, int value, int position) {
		Node newNode = new Node(value);
		Node first = list.last.next;
		int count = 0;

		if (position > lengthOfList(list)) {
			System.out.println("Invalid position given position is greater than length of given list");
			return;
		}

		else if (position == 0) {
			newNode.next = list.last.next;
			list.last.next = newNode;
		} else {

			while (position - 1 != count || first == list.last) {
				first = first.next;
				count++;
			}
			if (first == list.last) {
				Node last = list.last;
				newNode.next = last.next;
				last.next = newNode;
				list.last = newNode;
			} else {
				Node temp = first.next;
				first.next = newNode;
				newNode.next = temp;
			}
		}

		PrintCircularLinkedList.printList(list);
	}

	public static int lengthOfList(CircularSinglyLinkedList cList) {

		int count = 0;

		Node first = cList.last;
		while (first != cList.last) {
			count++;
		}
		count++;
		return count;
	}

}