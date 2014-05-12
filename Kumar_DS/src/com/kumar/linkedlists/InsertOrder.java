package com.kumar.linkedlists;

public class InsertOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void InsertOrder(ListNode l, int x) {
		ListNode tmp;
		while (l.next != null && l.next.element < x)
			l = l.next;
		tmp = new ListNode();
		tmp.element = x;
		tmp.next = l.next;
		l.next = tmp;

	}

	public void InsertOrder1(ListNode l, int x) {
		ListNode tmp;
		l = l.next;
		while (l.element < x)
			l = l.next;
		tmp = new ListNode();
		tmp.element = l.element;
		l.element = x;
		tmp.next = l.next;
		l.next = tmp;
	}

	void InsertOrder2(ListNode l, int x) {
		ListNode tmp;
		l = l.next;
		while (l.element < x)
			l = l.next;
		tmp = new ListNode();

		tmp.element = l.element;
		l.element = x;
		tmp.next = l.next;
		l.next = tmp;

	}

	class ListNode {
		int element;
		ListNode next;
	}

}
