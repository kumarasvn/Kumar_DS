/*You are given a Double Link List with one pointer of each node pointing to the next node just 
 like in a single link list. The second pointer however CAN point to any node in the list and
 not just the previous node. Now write a program in O(n) time to duplicate this list.
  That is, write a program which will create a copy of this list.
Let us call the second pointer as arbitrary pointer as it can point to any arbitrary node in the linked list. 
 * */
package com.kumar.linkedlists;

public class CloneList {
	public static void main(String aargs[]) {
		LNode head1 = createListWithOrbitaryptr();
		printList(head1);
		printArbitaryList(head1);
		LNode head2 = clone(head1);
		printList(head2);
		printArbitaryList(head2);
	}

	private static LNode clone(LNode head1) {
		LNode current1, temp, temp2;
		// phase1: create new list nodes and place them within the list
		for (current1 = head1; current1 != null; current1 = current1.next.next) {
			temp = current1.next;
			temp2 = createNode(current1.data);
			current1.next = temp2;
			temp2.next = temp;
		}
		// phase2:filling the arbitary fields of new list nodes
		for (current1 = head1; current1 != null; current1 = current1.next.next)
			current1.next.arbitary = current1.arbitary.next;

		// phase3:separting the new list from old list
		LNode l2 = createList(head1.next);
		return l2;
	}

	private static LNode createList(LNode head) {
		LNode current = head;
		while (current != null && current.next != null) {
			current.next = current.next.next;
			current = current.next;
		}
		return head;
	}

	static void printList(LNode head) {
		System.out.println();
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

class LNode {
	Object data;
	LNode arbitary;
	LNode next;

}
