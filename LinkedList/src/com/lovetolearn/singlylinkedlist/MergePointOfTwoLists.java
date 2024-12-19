package com.lovetolearn.singlylinkedlist;

import com.lovetolearn.singlylinkedlist.LinkedList.Node;

public class MergePointOfTwoLists {

	public static void main(String[] args) {

		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node node = new Node(1);
		LinkedList list = new LinkedList();
		list.head = node;
		Node n1 = new Node(1);
		Node n2 = new Node(2);

		list.head.next = n1;
		n1.next = n2;
		n2.next = n5;
		n5.next = n6;
		n6.next = n7;
		LinkedList list1 = new LinkedList();
		Node n3 = new Node(3);
		list1.head = n3;
		Node n4 = new Node(4);
		Node n8 = new Node(9);
		Node n9 = new Node(10);
		Node n10 = new Node(11);
		list1.head.next = n3;
		n3.next = n4;
		n4.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = n5;
		n5.next = n6;
		n6.next = n7;

		System.out.println(findMergeNode(list.head, list1.head));

	}

	static int getCount(Node node) {
		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	static int findMergeNode(Node head1, Node head2) {

		int head1Count = getCount(head1);
		int head2Count = getCount(head2);

		if (head1Count > head2Count) {

			int count = head1Count - head2Count;
			while (count != 0) {
				head1 = head1.next;
				count--;
			}
		} else {
			int count = head2Count - head1Count;
			while (count != 0) {
				head2 = head2.next;
				count--;
			}
		}

		while (head1 != head2) {
			head1 = head1.next;
			head2 = head2.next;
		}

		return head1.data;

	}

}