package com.linkedlist;

import java.util.LinkedList;

public class ListNode_1 {
	int val;
	AddTwoNumbers next;

	ListNode_1() {
	}

	ListNode_1(int val) {
		this.val = val;
	}

	ListNode_1(int val, AddTwoNumbers next) {
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
				AddTwoNumbers l1 = new AddTwoNumbers(list.get(i));
				AddTwoNumbers l2 = new AddTwoNumbers(list2.get(j));
				System.out.println(addTwoNumbers(l1, l2));
			}
		}
	}

	public static AddTwoNumbers addTwoNumbers(AddTwoNumbers l1, AddTwoNumbers l2) {
		AddTwoNumbers dummyHead = new AddTwoNumbers(0);
		AddTwoNumbers p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new AddTwoNumbers(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new AddTwoNumbers(carry);
		}
		return dummyHead.next;
	}
}