package com.lovetolearn.singlylinkedlist;

import com.lovetolearn.singlylinkedlist.LinkedList.Node;

public class ReverseLinkedList {

	public static void reverseAList(LinkedList list) {
		PrintLinkedList.printDataInLinkedList(list);
		Node currNode = list.head;
		Node previous = null;
		Node next = null;
		while (currNode != null) {
			next = currNode.next;
			currNode.next = previous;
			previous = currNode;
			currNode = next;

		}
		list.head = previous;
		PrintLinkedList.printDataInLinkedList(list);
	}
}
