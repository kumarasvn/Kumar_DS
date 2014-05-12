/*Given a sorted array return true if there exists a pair such that x+y+z=k for a given k otherwise
 * return false
 * */
package com.kumar.arrays;

public class FindTriplet {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.print(findTriplet(a, 60));
	}

	static boolean findTriplet(int a[], int sum) {
		int n = a.length;
		int secondarySum;
		for (int i = 0; i < n - 2; ++i) {
			secondarySum = sum - a[i];
			for (int j = i + 1, k = n - 1; j < k;) {
				if (a[j] + a[k] > secondarySum)
					k--;
				else if (a[j] + a[k] < secondarySum)
					j++;
				else
					return true;
			}
		}
		return false;

	}

}
