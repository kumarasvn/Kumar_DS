/*Given an array check whether it is a maxHeap or not
 * */
package com.kumar.priorityqueues;

public class IsMaxHeap {
	public static void main(String[] args) {
		int a[] = { 25, 11, 13, 9, 10, 12, 7, 8, 4, 1, 2, 3, 6 };
		int b[] = { -1, -2, 4 };
		System.out.println(isMaxHeap(a));
		System.out.println(isMaxHeap(b));

	}

	static boolean isMaxHeap(int a[]) {
		int n = a.length;
		int lastNonleafNode = PriorityQueue.parent(n - 1);
		for (int i = 0; i <= lastNonleafNode; i++) {
			if (a[PriorityQueue.left(i)] > a[i]
					|| (PriorityQueue.right(i) < n && a[PriorityQueue.right(i)] > a[i]))
				return false;
		}
		return true;

	}

}
