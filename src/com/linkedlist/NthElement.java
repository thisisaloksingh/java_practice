package com.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NthElement {

	int val;
	NthElement next;

	NthElement() {
	}

	NthElement(int val) {
		this.val = val;
	}

	NthElement(int val, NthElement next) {
		this.val = val;
		this.next = next;
	}

	public static void main(String[] args) {
		removeNthFromEnd(new NthElement(2,new NthElement(10)), 2);
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		// String input
		String name = sc.nextLine();
		System.out.println(name);
		// Character input
		// char gender = sc.next().charAt(0);

		LinkedList<List> ll = new LinkedList<List>();
		for (int i = 0; i < name.length(); i++) {
			al.add("Index" + name.charAt(i));
			ll.add(al);
			removeNthFromEnd(new NthElement(i), 2);
		}
//		System.out.println(al);
//		System.out.println(ll.toString());

	}

	public static NthElement removeNthFromEnd(NthElement head, int n) {
		NthElement dummy = new NthElement(0);
		dummy.next = head;
		System.out.println(head.next);
		int length = 0;
		NthElement first = head;
		while (first != null) {
			length++;
			first = first.next;
		}
		length -= n;
		first = dummy;
		while (length > 0) {
			length--;
			first = first.next;
		}
		first.next = first.next.next;
		System.out.println(dummy.next);
		return dummy.next;
	}
}