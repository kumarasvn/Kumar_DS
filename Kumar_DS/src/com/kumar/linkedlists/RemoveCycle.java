package com.kumar.linkedlists;

import java.util.HashSet;

public class RemoveCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int removeCycle(ListNode l) {
		ListNode p, lastnode = null;
		HashSet<ListNode> h = new HashSet<ListNode>();

		for (p = l.next; p != null; lastnode = p, p = p.next) {
			if (!h.contains(p))
				h.add(p);
			else {
				lastnode.next = null;
				break;
			}
		}

		if (p != null)
			return 1;
		return -1;
	}

	public int removeCycle1(ListNode l) {
		ListNode slow, fast, slow1, prev = null;
		slow = fast = l;
		do {
			if (fast == null || fast.next == null)
				return -1;
			slow = slow.next;
			fast = fast.next.next;
		} while (slow != fast);

		slow1 = l;
		while (slow1 != slow) {
			prev = slow;
			slow = slow.next;
			slow1 = slow1.next;
		}
		prev.next = null;
		return 1;
	}

}
