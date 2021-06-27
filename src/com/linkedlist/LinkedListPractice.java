package com.linkedlist;

public class LinkedListPractice {
	private static LinkedListPractice newNode = null;
	private static LinkedListPractice tempNode = null;

	int data;
	LinkedListPractice next = null;

	LinkedListPractice(int d) {
		data = d;
		next = null;
	}

	void addNode(int data) {
		LinkedListPractice newData = new LinkedListPractice(data);
		LinkedListPractice n = this;

		while (n.next != null) {
			n = n.next;
//			System.out.println(n.data);
		}
		n.next = newData;
//		System.out.println(n.next.data);
	}
	
	public static void insertLinkListAt1st(LinkedListPractice head, int x) {
		newNode = new LinkedListPractice(x);
		if (head == null) {
			head = newNode;
			head.next=null;
		} else {
			tempNode = head;
			head = newNode;
			head.next = tempNode;
		}
		System.out.println(head.next.data);
	}
	

	public static void main(String[] args) {

		LinkedListPractice head = new LinkedListPractice(12);
//		head.addNode(13);
//		head.addNode(14);
//		head.addNode(15);
//		head.addNode(16);
		
		head.insertLinkListAt1st(head, 13);
		head.insertLinkListAt1st(head, 13);
		head.insertLinkListAt1st(head, 13);
		head.insertLinkListAt1st(head, 13);

	}
}
