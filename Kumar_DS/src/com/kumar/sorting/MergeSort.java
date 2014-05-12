/*Write a program to implement merge sort*/
package com.kumar.sorting;

public class MergeSort {
	int a[];
	int numbers;

	MergeSort(int a[]) {
		this.a = a;
		this.numbers = a.length;
	}

	public static void main(String[] args) {
		int a[] = { 20, 30, 10, 40, 15, -9, -6, 0, 50, 35 };
		MergeSort m = new MergeSort(a);
		System.out.println("\nElements before sorting.....\n");
		for (int i : a) {
			System.out.print(i + " ");
		}
		m.mergeSort(a, 0, a.length - 1);
		System.out.println("\nElements after sorting.....\n");
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	void mergeSort(int a[], int l, int r) {
		if (l >= r)
			return;
		int m = l + (r - l) / 2;
		mergeSort(a, l, m);
		mergeSort(a, m + 1, r);
		merge(a, l, m, r);

	}

	private void merge(int[] a, int l, int m, int r) {
		int helper[] = new int[this.numbers];
		int k = 0;
		int i, j;
		for (i = l, j = m + 1; i <= m && j <= r;) {
			if (a[i] < a[j]) {
				helper[k++] = a[i++];
			} else {
				helper[k++] = a[j++];
			}
		}

		while (i <= m)
			helper[k++] = a[i++];
		while (j <= r)
			helper[k++] = a[j++];
		for (int h = 0; h < k; h++) {
			a[l++] = helper[h];
		}
		helper = null;
	}

}
