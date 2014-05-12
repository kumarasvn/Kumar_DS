package com.kumar.priorityqueues;
public class HeapSort {

	public static void main(String[] args) {
		int a[] = { 10, 15, 2, 8, 20, 11, 16 };
		System.out.println("array before sorting...\n");
		for (int k : a)
			System.out.print(k + " ");
		heapsort(a);
		System.out.println("array After sorting...\n");
		for (int k : a)
			System.out.print(k + " ");

	}

	private static void heapsort(int a[]) {
		int n = a.length;
		int parent, left, right, max;
		makeHeap(a);
		System.out.println("array after converting into heap...\n");
		for (int k : a)
			System.out.print(k + " ");
		for (int i = n - 1; i > 0; i--) {
			swap(a, 0, i);
			parent = 0;
			while (true) {
				left = (2 * parent) + 1;
				right = (2 * parent) + 2;
				if (left < i && right < i) {
					max = (a[left] > a[right] ? left : right);
					if (a[max] > a[parent]) {
						swap(a, max, parent);
						parent = max;
					} else
						break;
				} else if (left < i) {
					if (a[left] > a[parent]) {
						swap(a, left, parent);
						break;
					}
				} else
					break;

			}
		}

	}

	private static void makeHeap(int[] a) {
		int n = a.length;
		for (int i = PriorityQueue.parent(n - 1); i >= 0; i--) {
			maxHeapify(a, i);
		}

	}

	private static void maxHeapify(int[] a, int i) {
		int maxchild;
		while (PriorityQueue.left(i) < a.length) {
			maxchild = PriorityQueue.left(i);
			if (PriorityQueue.right(i) < a.length
					&& a[(PriorityQueue.right(i))] > a[(maxchild)])
				maxchild++;
			if (a[(maxchild)] > a[i]) {
				swap(a, maxchild, i);
				i = maxchild;
			} else
				break;
		}

	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
