/*You are given a Double Link List with one pointer of each node pointing to the next node just 
 like in a single link list. The second pointer however CAN point to any node in the list and
 not just the previous node. Now write a program in O(n) time to duplicate this list.
  That is, write a program which will create a copy of this list.
Let us call the second pointer as arbitrary pointer as it can point to any arbitrary node in the linked list. 
 * */
package com.kumar.linkedlists;

import java.util.HashMap;

public class CloneList1 {
	public static void main(String args[]) {
		LNode head1 = createListWithOrbitaryptr();
		System.out.println("actual list");
		printList(head1);
		printArbitaryList(head1);
		LNode head2 = createClone(head1);
		System.out.println("\ncloned list");
		printList(head2);
		printArbitaryList(head2);

	}

	static LNode createClone(LNode head1) {
		HashMap<LNode, LNode> h = new HashMap<LNode, LNode>();
		LNode prev = null;
		LNode head2 = null;
		LNode current1;
		LNode current2;
		for (current1 = head1; current1 != null; current1 = current1.next) {
			LNode temp = createNode(current1.data);
			if (prev != null)
				prev.next = temp;
			else
				head2 = temp;
			h.put(current1, temp);
			prev = temp;
		}
		for (current1 = head1, current2 = head2; current1 != null; current1 = current1.next, current2 = current2.next) {
			current2.arbitary = h.get(current1.arbitary);
		}
		return head2;
	}

	static void printList(LNode head) {
		System.out.println("printing in normal manner");
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	private static void printArbitaryList(LNode head) {
		System.out.println();
		System.out.println("\nprinting in Arbitary manner");
		while (head != null) {
			System.out.print(head.arbitary.data + " ");
			head = head.next;
		}
	}

	private static LNode createListWithOrbitaryptr() {
		LNode a = createNode(10);
		LNode b = createNode(20);
		LNode c = createNode(30);
		LNode d = createNode(40);
		LNode e = createNode(50);
		LNode f = createNode(60);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		a.arbitary = c;
		b.arbitary = f;
		c.arbitary = a;
		d.arbitary = c;
		e.arbitary = d;
		f.arbitary = a;
		return a;
	}

	private static LNode createNode(Object n) {
		LNode a = new LNode();
		a.data = n;
		a.arbitary = null;
		a.next = null;
		return a;
	}
}
