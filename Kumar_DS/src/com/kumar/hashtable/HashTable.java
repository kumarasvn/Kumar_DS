/*Design a Hash table(Hash set in Java) with add remove and find methods
 * */
package com.kumar.hashtable;

public class HashTable {
	private int nkeys;
	private int size;
	private int loadFactor;
	private LinkedListNode arrayOfLists[];

	HashTable() {
		this.size = 11;
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
			rehash();
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

	private void rehash() {
		LinkedListNode[] oldArray;
		LinkedListNode temp,temp1;
		oldArray=arrayOfLists;
		int oldSize=this.size;
		arrayOfLists=new LinkedListNode[2*size];
		this.size=2*this.size;
		for(int i=0;i<this.size;i++){
			temp=new LinkedListNode();
			arrayOfLists[i]=temp;
		}
		for(int i=0;i<oldSize;i++){
			for(LinkedListNode head=oldArray[i].next;head!=null;head=temp1){
				temp1=head.next;
				add(head.data);
			}
		}
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

class LinkedListNode {
	int data;
	LinkedListNode next;

	public LinkedListNode() {
		this.next = null;
	}

	public LinkedListNode(int n) {
		this.data = n;
		this.next = null;
	}
}
