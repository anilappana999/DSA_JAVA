package com.lovetolearn.singlylinkedlist;

import com.lovetolearn.singlylinkedlist.LinkedList.Node;

public class DeleteOperations {

	public static void DeleteFirstNode(LinkedList list) {

		if (list == null || list.head == null) {
			System.out.println("List is empty");
			return;
		}

		System.out.println("Linked_List before deletion of  first node");
		PrintLinkedList.printDataInLinkedList(list);
		Node headNode = list.head;
		list.head = headNode.next;

		System.out.println("Linked_List after deletion of  first node");
		PrintLinkedList.printDataInLinkedList(list);

	}

	public static void DeleteLastNode(LinkedList list) {

		// using prev,current assigning can help to solve
		if (list == null || list.head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Linked_List before deletion of last node");
		PrintLinkedList.printDataInLinkedList(list);
		Node currNode = list.head;

		Node prevNode = null;
		while (currNode.next != null) {

			prevNode = currNode;
			currNode = currNode.next;

		}

		prevNode.next = null;

		System.out.println("Linked_List after deletion of last node");
		PrintLinkedList.printDataInLinkedList(list);

	}

	public static void deleteAtGivenPosition(LinkedList list, int position) {

		System.out.println("Linked_List before insertion at given position");
		
		PrintLinkedList.printDataInLinkedList(list);
		Node currNode = list.head;
		Node temp = null;
		if (list == null || list.head == null) {
			System.out.println("List is empty");
			return;
		}
		else if (position == 1) {
			list.head = currNode.next;
		} else {
			int count = 1;
			while (count < position - 1) {
				currNode = currNode.next;
				count++;
			}
			temp = currNode.next;
			currNode.next = temp.next;
		}
		System.out.println("Linked_List after deletion of last node");
		PrintLinkedList.printDataInLinkedList(list);

	}

	public static void deleteGivenkey(LinkedList list, int value) {

		System.out.println("Linked_List before insertion at given position");
		PrintLinkedList.printDataInLinkedList(list);
		Node currNode = list.head;
		Node prev = null;

		if (list == null || list.head == null) {
			System.out.println("List is empty");
			return;
		}

		else if (currNode.data == list.head.data) {
			list.head = currNode.next;
		} else {

			while (currNode.data != value && currNode.next != null) {
				prev = currNode;
				currNode = currNode.next;
			}

			prev.next = currNode.next;
		}

		System.out.println("Linked_List after deletion of last node");
		PrintLinkedList.printDataInLinkedList(list);

	}
}
