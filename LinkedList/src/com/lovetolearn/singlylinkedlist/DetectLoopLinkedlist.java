package com.lovetolearn.singlylinkedlist;

import com.lovetolearn.singlylinkedlist.LinkedList.Node;

public class DetectLoopLinkedlist {

	public static LinkedList getLinkedList() {
		Node node = new Node(1);
		LinkedList list = new LinkedList();
		list.head = node;

		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		list.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n3;
		return list;

	}

	public static boolean detectLoop(LinkedList list) {

		Node slowPtr = list.head;
		Node fastPtr = list.head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				System.out.println("element where loop starts:" + findStartOfLoop(list, slowPtr).data);
				return true;
			}

		}

		return false;
	}

	public static Node findStartOfLoop(LinkedList list, Node ptr) {

		Node temp = list.head;

		while (ptr != temp) {
			ptr = ptr.next;
			temp = temp.next;

		}

		return temp;

	}

	public static void removeLoop() {
		LinkedList list = getLinkedList();
		Node head = list.head;
		// there are two steps in removing a loop first step is to detect if loop exists
		// then we need to remove it
		

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}
		}

		if (slow == fast) {

			slow = head;
			while (slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}

			fast.next = null;

		}

		System.out.println("Linked list after removal of loop");
		PrintLinkedList.printDataInLinkedList(list);

	}

}
