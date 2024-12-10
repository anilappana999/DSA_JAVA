package com.lovetolearn.singlylinkedlist;

import com.lovetolearn.singlylinkedlist.LinkedList.Node;

public class InsertOperations {

	public static void insertAtBeginning(LinkedList list, int data) {

		System.out.println("Linked_List before insertion of new node AtBeginning");
		PrintLinkedList.printDataInLinkedList(list);
		Node newNode = new Node(data);
		newNode.next = list.head;
		list.head = newNode;
		System.out.println("Linked_List after insertion of new node AtBeginning");
		PrintLinkedList.printDataInLinkedList(list);

	}

	public static void insertAtEnd(LinkedList list, int data) {

		System.out.println("Linked_List before insertion of new node AtEnd");
		PrintLinkedList.printDataInLinkedList(list);

		Node currNode = list.head;

		if (currNode == null) {

			currNode = new Node(data);
		} else {
			while (currNode.next != null) {
				currNode = currNode.next;

			}
			currNode.next = new Node(data);
		}

		System.out.println("Linked_List after insertion of new node AtEnd");
		PrintLinkedList.printDataInLinkedList(list);

	}

	public static void insertAtGivenPosition(LinkedList list, int data, int position) {

		System.out.println("Linked_List before insertion at given position");
		PrintLinkedList.printDataInLinkedList(list);

		Node currNode = list.head;
		Node newNode = new Node(data);
		if (position == 1) {
			newNode.next = list.head;
			list.head = newNode;

		} else {
			int count = 1;
			while (count < position - 1) {

				currNode = currNode.next;
				count++;
			}
			Node temp = currNode.next; // storing data after current node
			newNode.next = temp; // assigning temp to new node
			currNode.next = newNode; // assigning newNode next to the node of given position

		}
		System.out.println("Linked_List after insertion at given position");
		PrintLinkedList.printDataInLinkedList(list);
	}

	public static void insertNodeInSortedLinkedList(LinkedList list, int value) {

		Node currNode = list.head;
		Node newNode = new Node(value);
		Node temp = null;
		while (currNode.next != null) {

			if (currNode.data <= value && currNode.next.data <= value) {
				temp = currNode.next;
				currNode.next = newNode;
				currNode.next.next = temp;
				break;
			}

			else {
				currNode = currNode.next;
			}

		}
		if (currNode.data != value && currNode.next == null) {
			currNode.next = new Node(value);
		}

		PrintLinkedList.printDataInLinkedList(list);

	}

}
