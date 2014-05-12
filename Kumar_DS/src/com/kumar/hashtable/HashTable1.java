/*Design a Hash table(Hash set in Java) with add remove and find methods
 * */
package com.kumar.hashtable;

public class HashTable1 {
	private int nkeys;
	private int size;
	private int loadFactor;
	private LinkedListNode arrayOfLists[];

	HashTable1(int size) {
		this.size = size;
		this.nkeys = 0;
		this.loadFactor = 20;
		this.arrayOfLists = new LinkedListNode[this.size];
		LinkedListNode temp;
		for (int i = 0; i < this.size; i++) {
			temp = new LinkedListNode();
			arrayOfLists[i] = temp;
		}
	}

	boolean add(int key) {
		if ((this.nkeys / this.size) > this.loadFactor)
		{
			System.out.println("no space in hash table");
			return false;
		}
		int p = hashCode(key, this.size);
		for (LinkedListNode head = arrayOfLists[p]; head != null; head = head.next) {
			if (head.next == null) {
				LinkedListNode temp = new LinkedListNode(key);
				head.next = temp;
				this.nkeys++;
				return true;
			}
			if (key == head.next.data) {
				return false;
			}
			if (key < head.next.data) {
				LinkedListNode temp = new LinkedListNode(key);
				temp.next = head.next;
				head.next = temp;
				this.nkeys++;
				return true;
			}
		}
		return false;
	}

	boolean find(int key) {
		int p = hashCode(key, this.size);
		return searchList(arrayOfLists[p], key);
	}

	private boolean searchList(LinkedListNode linkedListNode, int key) {
		for (LinkedListNode head = linkedListNode; head.next != null; head = head.next) {
			if (head.next.data == key)
				return true;
		}
		return false;
	}

	boolean remove(int key) {
		int p = hashCode(key, this.size);
		return ldelete(arrayOfLists[p], key);
	}

	private boolean ldelete(LinkedListNode linkedListNode, int key) {
		for (LinkedListNode head = linkedListNode; head.next != null; head = head.next) {
			if (head.next.data == key) {
				head.next = head.next.next;
				this.nkeys--;
				return true;
			}
		}
		return false;
	}

	
	void printList(){
		for(int i=0;i<this.size;i++){
			for(LinkedListNode head=arrayOfLists[i];head.next!=null;head=head.next)
				System.out.print(head.next.data+" ");
		}
	}
	

	private int hashCode(int key, int size) {
		return key % size;
	}

}

