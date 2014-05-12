/*Given a single linked list find the kth node from end
 * */
package com.kumar.linkedlists;

import java.util.Scanner;

public class KthNodeFromEnd {

	public static void main(String[] args) {
		LinkedListNode root = LinkedListNode.createList();
		System.out.println("Elements in the list are...");
		LinkedListNode.printList(root);
		System.out.println("\nenter the kth node u want from end..");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		LinkedListNode kthNode = findkthToLast(root, k);
		if (kthNode == null)
			System.out.println("k is not a valid value");
		else
			System.out.println("\n kth node is " + kthNode.data);

	}

	public static LinkedListNode findkthToLast(LinkedListNode root, int k) {
		LinkedListNode current, kthNode;
		int i;

		/*
		 * Advance current k elements from beginning, checking for the end of
		 * the list
		 */
		current = root;
		for (i = 0; i < k; i++) {
			if (current.next != null) {
				current = current.next;
			} else {
				return null;
			}
		}

		/*
		 * Start kthNode at beginning and advance pointers together until
		 * current hits last element
		 */
		kthNode = root;
		while (current.next != null) {
			current = current.next;
			kthNode = kthNode.next;
		}

		/*
		 * kthNode now points to the element we were searching for, so return it
		 */
		return kthNode;
	}

	// general solution
	ListNode FindKth(ListNode l, int k) {
		int i, count = 0;
		ListNode p;
		p = l.next;
		while (p != null) {
			p = p.next;
			count++;
		}
		if (count < k)
			return null;
		p = l.next;
		for (i = 1; i <= (count - k); i++)
			p = p.next;
		return p;
	}

	ListNode FindKth1(ListNode l, int k) {
		ListNode p, q;
		p = q = l.next;
		while (k >= 1) {
			p = p.next;
			if (p == null)
				return null;
			k--;
		}
		while (p != null) {
			p = p.next;
			q = q.next;
		}
		return q;
	}

}
