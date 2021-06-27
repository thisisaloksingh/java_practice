package com.linkedlist;

public class AddTwoNumbers {
	int val;
	AddTwoNumbers next;

	AddTwoNumbers() {
	}

	AddTwoNumbers(int val) {
		this.val = val;
	}

	AddTwoNumbers(int val, AddTwoNumbers next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	int carry = 0;
	AddTwoNumbers result = null;
	AddTwoNumbers temp = null;
	AddTwoNumbers prev = null;

	public AddTwoNumbers addTwoNumbers(AddTwoNumbers l1, AddTwoNumbers l2) {

		while (l1 != null || l2 != null) {

			int sum = carry + (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;
			temp = new AddTwoNumbers(sum);

			if (result == null) {
				result = temp;
			} else {
				prev.next = temp;
			}
			prev = temp;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		if (carry == 1) {
			temp.next = new AddTwoNumbers(carry);
		}

		return result;

	}
}
