package com.linkedlist;

public class ReverseLinkedList {
	
	int val;
	ReverseLinkedList next;

	ReverseLinkedList() {
	}

	ReverseLinkedList(int val) {
		this.val = val;
	}

	ReverseLinkedList(int val, ReverseLinkedList next) {
		this.val = val;
		this.next = next;
	}

}
