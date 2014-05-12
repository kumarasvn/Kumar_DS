/*Given an array contains only 0's  1's and 2's sort the array
 * */
package com.kumar.sorting;

public class SortZeroOneandTwos {
	public static void main(String[] args) {
		int a[] = { 0, 1, 1, 2, 0, 2, 2, 0, 1, 0 };

		System.out.println("\nArray before sorting....");
		for (int i : a) {
			System.out.print(i + " ");
		}
		sort(a);
		System.out.println("\nArray after sorting....");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	static void sort(int a[]) {
		int len = a.length;
		for (int lastzero = -1, current = 0, firstTwo = len; current < firstTwo;) {
			if (a[current] == 0) {
				swap(a, ++lastzero, current++);
			} else if (a[current] == 2) {
				swap(a, --firstTwo, current);
			} else
				++current;
		}
	}

	private static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
