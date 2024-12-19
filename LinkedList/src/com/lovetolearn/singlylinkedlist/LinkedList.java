package com.lovetolearn.singlylinkedlist;

public class LinkedList {

	public Node head;

	public static class Node {

		public Node next;
		public int data;

		public Node(int data) {

			this.data = data;

		}

	}

	public static void main(String[] args) {

		Node node = new Node(1);
		LinkedList list = new LinkedList();
		list.head = node;
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(3);
		Node n6 = new Node(4);
		list.head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;

		DetectLoopLinkedlist.removeLoop();
		// InsertOperations.insertNodeInSortedLinkedList(list, 5);
		// DeleteOperations.DeleteFirstNode(list);
		// SearchOperation.searchMiddleNode(list);
		// PrintLinkedList.printDataInLinkedList(list);
		// InsertOperations.insertAtBeginning(list, 0);
		/// InsertOperations.insertAtEnd(list, 0);//insert eleemnt in empty linked list
		// InsertOperations.insertAtEnd(list, 4);
		// InsertOperations.insertAtGivenPosition(list, 7, 3);
		// DeleteOperations.DeleteLastNode(list);
		// DeleteOperations.deleteAtGivenPosition(list,3);
		// SearchOperation.searchPositionOfElement(list, 3);
		// ReverseLinkedList.reverseAList(list);

//		InsertOperations.insertAtEnd(null, 1);
//		InsertOperations.insertAtEnd(null, 2);
//		InsertOperations.insertAtEnd(null, 3);
//		InsertOperations.insertAtEnd(null, 4);

	}

}
