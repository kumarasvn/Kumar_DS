package com.kumar.arrays;

/*A sorted array with duplicates and an element n are given find the lowest index of element x
 * */
public class FindLowestIndex {
	static int findlowestindex(int a[], int n) {
		int l = 0;
		int r = a.length;
		int m;
		while (l < r) {
			m = l + (r - l) / 2;
			if (a[m] >= n)
				r = m;
			else
				l = m + 1;
		}
		if (a[l] == n)
			return l;
		else
			return -1;
	}

	public static void main(String args[]) {
		int a[] = { 10, 10, 10, 10, 20, 30, 40 };
		int n = 10;
		System.out.println(FindLowestIndex.findlowestindex(a, n));
	}

}
