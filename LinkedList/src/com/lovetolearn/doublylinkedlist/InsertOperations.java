package com.lovetolearn.doublylinkedlist;

import com.lovetolearn.doublylinkedlist.DoublyLinkedList.Node;

public class InsertOperations {

	public static void insertAtBeginning(DoublyLinkedList list, int data) {

		Node node = new Node(data);
		Node head = list.head;
		node.next = head;
		head.prev = node;
		PrintDoubleLinkedList.printForward(node);

	}

	public static void insertAtEnd(DoublyLinkedList list, int data) {

		Node tailNode = list.tail;
		Node node = new Node(data);
		tailNode.next = node;
		node.prev = tailNode;
		tailNode = tailNode.next;

		PrintDoubleLinkedList.printBackward(tailNode);

	}

	public static void insertAtGivenPosition(DoublyLinkedList list, int data, int position) {

		
		Node newNode = new Node(data);

		Node node = list.head;

		if (position == 1) {
			node.prev = newNode;
			newNode.next = node;
			PrintDoubleLinkedList.printForward(newNode);
		} else {

			//position =3 pos-1 =2 
			
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
			PrintDoubleLinkedList.printForward(list.head);
		}
		

	}
}
 