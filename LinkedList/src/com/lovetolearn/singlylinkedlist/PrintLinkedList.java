package com.lovetolearn.singlylinkedlist;

import com.lovetolearn.singlylinkedlist.LinkedList.Node;

public class PrintLinkedList {

	public static void printDataInLinkedList(LinkedList list) {

		Node currNode = list.head;

		while (currNode != null) {

			System.out.println(currNode.data);

			currNode = currNode.next;

		}

	}

}
