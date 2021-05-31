package com.linkedlist;

public class NthElement2 {
	private static Node head;

	public static void main(String args[]) {
		NthElement2 list = new NthElement2();
		list.append("1");
		list.append("2");
		list.append("3");
		list.append("4");
		System.out.println("linked list : " + list);
		System.out.println("The first node from last: " + list.getLastNode(1));
		System.out.println("The second node from the end: " + list.getLastNode(2));
		System.out.println("The third node from the tail: " + list.getLastNode(3));
	}

	static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	public boolean isEmpty() {
		return length() == 0;
	}

	public int length() {
		int length = 0;
		Node current = head;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}

	private Node tail() {
		Node tail = head;
		// Find last element of linked list known as tail
		while (tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}

	public void append(String data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		tail().next = new Node(data);
	}

	public static String getLastNode(int n) {
		Node fast = head;
		Node slow = head;
		int start = 1;

		while (fast.next != null) {
			fast = fast.next;
			start++;

			if (start > n) {
				slow = slow.next;
			}
		}

		return slow.data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		Node current = head;
		while (current != null) {
			sb.append(current).append("-->");
			current = current.next;
		}

		if (sb.length() >= 3) {
			sb.delete(sb.length() - 3, sb.length());

		}
		return sb.toString();
	}

}
