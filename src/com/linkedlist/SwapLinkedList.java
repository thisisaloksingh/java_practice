package com.linkedlist;

import java.util.Hashtable;
import java.util.LinkedList;

class Node {

	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class SwapLinkedList {
	private static Node newNode = null;
	private static Node tempNode = null;

	public static void main(String[] args) {
//		swapKthLinkedList(0);
//		displayLinkedList(new Node(12), 13);
		insertLinkListAt1st(new Node(12), 14);
		insertLinkListAt1st(new Node(12), 14);
		insertLinkListAt1st(new Node(12), 14);
		insertLinkListAt1st(new Node(12), 14);
		
	}

	public static void insertLinkListAt1st(Node head, int x) {
		newNode = new Node(x);

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
	
	public static void displayLinkedList(Node head,int x){
		Node current=head;
		if(head==null){
			insertLinkListAt1st(head, x);
			return;
		}
		while(current!=null){
			insertLinkListAt1st(head, x);
			System.out.println(current.data);
			current =current.next;
		}
	}

	public static void swapKthLinkedList(int kth) {
		LinkedList llist=new LinkedList();
		llist.add(new Node(1));
		llist.add(new Node(2));
		llist.add(new Node(3));
		llist.add(new Node(4));
		llist.add(new Node(8));
		
		System.out.println(llist);
			
		Node head=null;
		int count =0;
		while(head!=null){
			count++;
			head=head.next;
		}
		
		System.out.println(count);
		
		
	}

}
