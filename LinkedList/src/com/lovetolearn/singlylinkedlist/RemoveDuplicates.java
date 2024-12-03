package com.lovetolearn.singlylinkedlist;

import com.lovetolearn.singlylinkedlist.LinkedList.Node;

public class RemoveDuplicates {

	public static void removeDuplicates(LinkedList list) {

		Node curr = list.head;

		while (curr != null && curr.next != null) {
			if (curr.data == curr.next.data) {

				curr.next = curr.next.next;

			} else {
				curr = curr.next;
			}

		}

		PrintLinkedList.printDataInLinkedList(list);

	}

}
