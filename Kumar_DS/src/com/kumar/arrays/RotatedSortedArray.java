/*Given a rotated sorted array find the index of smallest element
 * */
package com.kumar.arrays;

public class RotatedSortedArray {
	public static void main(String[] args) {
		int a[] = { 7, 8, 9, 10, 1, 2, 3, 4, 5, 6 };
		System.out.println("Initial array");
		for (int k : a) {
			System.out.print(k + " ");
		}
		int minIndex = findMinIndex(a);
		System.out.println("minimum  index is " + minIndex);
	}

	static int findMinIndex(int a[]) {
		int left = 0, right = a.length - 1, mid;
		while (left < right) {
			mid = left + (right - left) / 2;
			if (a[mid] > a[right]) {
				left = mid + 1;
			} else
				right = mid;
		}
		return left;
	}
}
