package com.lovetolearn.doublylinkedlist;

public class DoublyLinkedList {

	public Node head;
	public Node tail;
	public int length;

	public static class Node {

		public int data;
		public Node next;
		public Node prev;

		public Node(int data) {

			this.data = data;
		}

	}

	public DoublyLinkedList() {

		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int getLength() {
		return length;
	}

	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		Node n = new Node(1);
		dl.head = n;
		Node n1 = new Node(2);
		n.next = n1;
		n1.prev = n;
		Node n2 = new Node(5);
		n1.next = n2;
		n2.prev = n1;
		dl.tail = n2;
//		InsertOperations.insertNodeInSortedLinkedList(dl, 1); //need to pass sorted linked-list as parameter
//		PrintDoubleLinkedList.printForward(dl.head);
//
//		PrintDoubleLinkedList.printBackward(dl.tail);
//		InsertOperations.insertAtBeginning(dl, 0);
//		InsertOperations.insertAtEnd(dl, 4);
//		InsertOperations.insertAtGivenPosition(dl, 4, 3);
//		SearchOperations.searchPositionOfElement(dl, 6);
//		SearchOperations.searchMiddleNode(dl);
//		SearchOperations.findNthNodeFromEnd(dl, 1);
//		DeleteOperations.DeleteFirstNode(dl);
//		DeleteOperations.DeleteLastNode(dl);
//		DeleteOperations.deleteAtGivenPosition(dl, 2);
		DeleteOperations.deleteGivenkey(dl, 1);

	}
}
