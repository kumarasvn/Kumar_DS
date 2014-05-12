/*Given an array of size n convert it into max heap
 * */
package com.kumar.priorityqueues;

import java.util.ArrayList;

public class ArraytoHeap {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(25);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		System.out.println("Array before converting to heap");
		for (int k : a)
			System.out.print(k + " ");
		makeHeap(a);
		System.out.println("Array after converting to heap");
		for (int k : a)
			System.out.print(k + " ");

	}

	static void makeHeap(ArrayList<Integer> a) {
		int n = a.size();
		for (int i = PriorityQueue.parent(n - 1); i >= 0; i--) {
			PriorityQueue.maxHeapify(a, i);
		}
	}
}
