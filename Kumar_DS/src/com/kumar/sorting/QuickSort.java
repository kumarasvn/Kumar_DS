/*Write a program to implement quick sort*/
package com.kumar.sorting;

public class QuickSort {
	void quickSort(int a[], int l, int r) {
		if (l >= r)
			return;
		int p = partition(a, l, r);
		quickSort(a, l, p - 1);
		quickSort(a, p + 1, r);
	}

	private int partition(int[] a, int l, int r) {
		int lastmin;
		int current;
		for (lastmin = l, current = l + 1; current <= r; ++current) {
			if (a[current] < a[l]) {
				int temp = a[current];
				a[current] = a[++lastmin];
				a[lastmin] = temp;
			}
		}
		int temp = a[lastmin];
		a[lastmin] = a[l];
		a[l] = temp;
		return lastmin;
	}

	public static void main(String args[]) {
		int a[] = { 8, 9, 2, 5 };
		System.out.println("elements before sorting...");
		for (int i : a)
			System.out.print(i + " ");
		QuickSort q = new QuickSort();
		q.quickSort(a, 0, a.length - 1);
		System.out.println("\nelements after sorting...");
		for (int i : a)
			System.out.print(i + " ");
	}
}
