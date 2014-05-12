/*Given a single linked list reverse it using recursion*/
package com.kumar.linkedlists;

public class RecursiveReverse {
	public static void main(String[] args) {
		LinkedListNode head = LinkedListNode.createList();
		System.out.println("initial list");
		LinkedListNode.printList(head);
		head.next = recursiveReverse(head.next);
		System.out.println("\nlist after reversing");
		LinkedListNode.printList(head);

	}

	public static LinkedListNode recursiveReverse(LinkedListNode root) {
		if (root == null || root.next == null)
			return root;
		LinkedListNode rest = root.next;
		LinkedListNode reversedList = recursiveReverse(rest);
		root.next = null;
		rest.next = root;
		return reversedList;

	}

	public ListNode ReverseList(ListNode p) {
		ListNode head;
		if (p == null)
			return null;
		if (p.next != null) {
			head = ReverseList(p.next);
			p.next.next = p;
			p.next = null;
			return head;
		} else
			return p;
	}

}
