package com.lovetolearn.doublylinkedlist;

import com.lovetolearn.doublylinkedlist.DoublyLinkedList.Node;

public class DeleteOperations {

	public static void DeleteFirstNode(DoublyLinkedList list) {

		Node node = list.head.next;
		node.prev = null;
		list.head = node;
		PrintDoubleLinkedList.printForward(list.head);

	}

	public static void DeleteLastNode(DoublyLinkedList list) {

		Node node = list.tail.prev;
		node.next = null;
		list.tail = node;
		PrintDoubleLinkedList.printForward(list.head);

	}

	public static void deleteAtGivenPosition(DoublyLinkedList list, int position) {
		int count = 1;
		Node node = list.head;
		if (position == 1) {
			node.prev = null;
			list.head = node;
		} else {
			while (count != position - 1) {
				node = node.next;
				count++;
			}
			if (node.next != null && node.next.next != null) {
				node.next = node.next.next;
				node.next.prev = node;
			} else {
				node.next = null;
			}
		}
		PrintDoubleLinkedList.printForward(list.head);
	}

	public static void deleteGivenkey(DoublyLinkedList list, int value) {

		if (list == null || list.head == null) {
			return;
		}

		Node node = list.head;

		while (node.data != value && node.next != null) {
			node = node.next;
		}

		if (node == null) {
			System.out.println("key not found in given list");
		}
		if (node.next != null && node.next.next != null) {
			node.next = node.next.next;
			node.next.prev = node;
		} else {
			node.next = null;
		}
		PrintDoubleLinkedList.printForward(list.head);

	}

}
