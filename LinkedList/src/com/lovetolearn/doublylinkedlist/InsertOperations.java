package com.lovetolearn.doublylinkedlist;

import com.lovetolearn.doublylinkedlist.DoublyLinkedList.Node;

public class InsertOperations {

	public static void insertAtBeginning(DoublyLinkedList list, int data) {
		System.out.println("LinkedList before insertion at beginning");
		PrintDoubleLinkedList.printForward(list.head);
		Node node = new Node(data);
		Node head = list.head;
		node.next = head;
		head.prev = node;
		System.out.println("LinkedList after insertion at beginning");
		PrintDoubleLinkedList.printForward(node);

	}

	public static void insertAtEnd(DoublyLinkedList list, int data) {
		System.out.println("LinkedList before insertion at end");
		Node tailNode = list.tail;
		PrintDoubleLinkedList.printBackward(tailNode);
		Node node = new Node(data);
		tailNode.next = node;
		node.prev = tailNode;
		tailNode = tailNode.next;
		System.out.println("LinkedList after insertion at end");
		PrintDoubleLinkedList.printForward(tailNode);

	}

	public static void insertAtGivenPosition(DoublyLinkedList list, int data, int position) {
		System.out.println("LinkedList before insertion at given position");
		PrintDoubleLinkedList.printForward(list.head);
		Node newNode = new Node(data);

		Node node = list.head;

		if (position == 1) {
			node.prev = newNode;
			newNode.next = node;
			PrintDoubleLinkedList.printForward(newNode);
		} else {

			// position =3 pos-1 =2

			while (1 != position - 1) {
				node = node.next;
				position -= 1;

			}

			newNode.next = node.next;
			newNode.prev = node;

			if (node.next != null) {
				node.next.prev = newNode;
			}
			node.next = newNode;
			System.out.println("LinkedList after insertion at given position");
			PrintDoubleLinkedList.printForward(list.head);
		}

	}

	public static void insertNodeInSortedLinkedList(DoublyLinkedList list, int value) {
		System.out.println("LinkedList before insertNodeInSortedLinkedList");
		PrintDoubleLinkedList.printForward(list.head);
		Node node = list.head;

		Node newNode = new Node(value);

		if (value < node.data) {

			node.prev = newNode;
			newNode.next = node;
			list.head = newNode;

		} else {
			while (value >= node.data) {
				node = node.next;
			}

			node.prev.next = newNode;

			if (node.next != null) {
				node.next.prev = newNode;
			}

			newNode.next = node;
			newNode.prev = node.prev;

		}
		System.out.println("LinkedList after insertNodeInSortedLinkedList");
		PrintDoubleLinkedList.printForward(list.head);

	}

}
