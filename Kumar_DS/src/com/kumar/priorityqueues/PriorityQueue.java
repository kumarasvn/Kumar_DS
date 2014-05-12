/*Create a priorityQueue and perform insert ,findMax and deleteMax
 * */
package com.kumar.priorityqueues;

import java.util.ArrayList;

public class PriorityQueue {
	ArrayList<Integer> a;

	PriorityQueue() {
		a = new ArrayList<Integer>();
	}

	public void insert(int x) {
		a.add(x);
		int i = a.size() - 1;
		while (a.get(i) > a.get(parent(i))) {
			swap(a, i, parent(i));
			i = parent(i);
		}
	}

	public int findMax() {
		if (a.size() > 0)
			return a.get(0);
		return Integer.MIN_VALUE;
	}

	public int deleteMax() {
		int max = Integer.MIN_VALUE;
		if (a.size() > 0) {
			max = a.get(0);
			a.set(0, a.get(a.size() - 1));
			a.remove(a.size() - 1);
			maxHeapify(a, 0);
		}
		return max;
	}

	static void maxHeapify(ArrayList<Integer> a, int i) {

		int maxchild;
		while (left(i) < a.size()) {
			maxchild = left(i);
			if (right(i) < a.size() && a.get(right(i)) > a.get(maxchild))
				maxchild++;
			if (a.get(maxchild) > a.get(i)) {
				swap(a, maxchild, i);
				i = maxchild;
			} else
				break;
		}

	}

	static int left(int i) {
		return 2 * i + 1;
	}

	static int right(int i) {
		return 2 * i + 2;
	}

	static int parent(int i) {
		return (i - 1) / 2;
	}

	static void swap(ArrayList<Integer> a, int i, int parent) {

		int temp = a.get(i);
		a.set(i, a.get(parent));
		a.set(parent, temp);
	}

	int size() {
		return a.size();
	}

	int get(int index) {

		return a.get(index);
	}
	void removeLast(){
		a.remove(a.size()-1);
	}

}
