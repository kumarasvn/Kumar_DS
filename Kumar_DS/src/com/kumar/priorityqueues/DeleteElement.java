/*Given a max heap of size n delete x
 * */
package com.kumar.priorityqueues;

public class DeleteElement {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.insert(10);
		pq.insert(20);
		pq.insert(30);
		pq.insert(40);
		pq.insert(5);
		System.out.println("Initial queue is...");
		for (int k : pq.a) {
			System.out.print(k + " ");
		}
		delete(pq, 20);
		System.out.println("After deleting 20...");
		for (int k : pq.a) {
			System.out.print(k + " ");
		}
	}

	static void delete(PriorityQueue pq, int x) {
		if (pq.size() == 0) {
			System.out.println("Given priority queue is empty");
			return;
		}
		int index = pq.a.indexOf(x);
		if (index == -1) {
			System.out
					.println("Given element is not present in the priority queue");
			return;
		}
		int lastElement = pq.get(pq.size() - 1);
		pq.removeLast();
		pq.a.set(index, lastElement);
		if (lastElement < x) {
			// heapify downwards
			PriorityQueue.maxHeapify(pq.a, index);
			return;
		} else {
			// heapify upwards
			while (pq.get(PriorityQueue.parent(index)) < pq.get(index)) {
				PriorityQueue.swap(pq.a, index, PriorityQueue.parent(index));
				index = PriorityQueue.parent(index);
			}
		}

	}

}
