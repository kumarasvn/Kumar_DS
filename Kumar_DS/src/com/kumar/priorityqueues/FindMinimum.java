/*Given a max heap find minimum element 
 * */
package com.kumar.priorityqueues;

public class FindMinimum {

	public static void main(String[] args) {
		int a[] = { 25, 1, 13, 9, 10, 12, 7, 8, 4, 1, 2, 3, 6 };
		System.out.println("minimum is " + findMinimum(a));
	}

	static int findMinimum(int a[]) {
		int len = a.length;
		int min = Integer.MAX_VALUE;
		for (int i = (PriorityQueue.parent(len - 1) + 1); i < len; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;

	}

}
