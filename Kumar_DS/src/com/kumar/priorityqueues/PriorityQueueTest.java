package com.kumar.priorityqueues;

public class PriorityQueueTest {

	public static void main(String args[]) {
		PriorityQueue pq = new PriorityQueue();
		pq.insert(10);
		pq.insert(20);
		pq.insert(30);
		pq.insert(40);
		pq.insert(5);
		for (int i : pq.a)
			System.out.println(i);
		System.out.println("this is maximum value " + pq.findMax());
		System.out.println("this is maximum value " + pq.deleteMax());

		for (int i : pq.a)
			System.out.println(i);
	}

}
