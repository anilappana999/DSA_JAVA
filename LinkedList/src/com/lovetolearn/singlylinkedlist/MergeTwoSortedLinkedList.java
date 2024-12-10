package com.lovetolearn.singlylinkedlist;

import com.lovetolearn.singlylinkedlist.LinkedList.Node;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		Node node = new Node(1);
		LinkedList list = new LinkedList();
		list.head = node;
		Node n2 = new Node(4);

		Node n4 = new Node(5);

		Node n6 = new Node(7);
		list.head.next = n2;
		n2.next = n4;
		n4.next = n6;

		Node node6 = new Node(2);
		LinkedList list1 = new LinkedList();
		list1.head = node6;
		Node n7 = new Node(3);
		Node n8 = new Node(6);
		list1.head.next = n7;
		n7.next = n8;
		mergeSortedLinkedList(list, list1);

	}

	public static void mergeSortedLinkedList(LinkedList list1, LinkedList list2) {

		Node node = new Node(0);
		LinkedList list = new LinkedList();
		list.head = node;
		Node n = list.head;
		list.head = n;
		Node n1 = list1.head;
		Node n2 = list2.head;

		while (n1 != null && n2 != null) {
			if (n1.data < n2.data) {
				n.next = n1;
				n1 = n1.next;
			} else {
				n.next = n2;
				n2 = n2.next;
			}
			n = n.next;
		}

		if (n1 == null) {
			n.next = n2;
		} else {
			n.next = n1;
		}
		
		list.head = list.head.next;
				

		PrintLinkedList.printDataInLinkedList(list);
	}

}
