package com.lovetolearn.circularlinkedlist;

public class CircularSinglyLinkedList {

	public Node last;

	public static class Node {

		public Node next;
		public int data;

		public Node(int data) {
			this.data = data;
		}

	}

	public CircularSinglyLinkedList() {
		
		last = null;
	}

	public static void main(String[] args) {

		Node firstNode = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);
		Node fourthNode = new Node(4);
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		fourthNode.next = firstNode;

		CircularSinglyLinkedList cl = new CircularSinglyLinkedList();
		cl.last = fourthNode;
//		PrintCircularLinkedList.printList(cl);
//		InsertOperations.insertAtBeginning(0, new CircularSinglyLinkedList());
//		InsertOperations.insertAtBeginning(0, cl);
//		InsertOperations.insertAtEnd(5, cl);
//		InsertOperations.insertAtEnd(9, new CircularSinglyLinkedList());
		InsertOperations.insertAtGivenPosition(cl, 0, 10);

	}

}
