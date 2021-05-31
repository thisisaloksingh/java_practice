package com.linkedlist;

import java.util.LinkedList;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		// Adding elements to the Linked list
		list.add(1);
		list.add(4);
		list.add(8);

		LinkedList<Integer> list2 = new LinkedList<Integer>();

		// Adding elements to the Linked list
		list.add(4);
		list.add(2);
		list.add(8);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				ListNode l1 = new ListNode(list.get(i));
				ListNode l2 = new ListNode(list2.get(j));
				System.out.println(addTwoNumbers(l1, l2));
			}
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
}