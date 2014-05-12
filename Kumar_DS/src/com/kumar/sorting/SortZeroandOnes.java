/*Given an array contains only 0's and 1's sort the array
 * */
package com.kumar.sorting;

public class SortZeroandOnes {
	public static void main(String[] args) {
		int a[] = { 0, 1, 1, 0, 0, 1, 0, 0, 1, 0 };

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
		for (int lastzero = -1, current = 0; current < len; ++current) {
			if (a[current] == 0) {
				swap(a, ++lastzero, current);
			}
		}
	}

	private static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
