package com.kumar.arrays;

/*In a given array find max and min in efficient way
 * */
public class FindMaxnMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 20, 50, 89, 10, 2, -1 };
		findMaxnMin(a);

	}

	static void findMaxnMin(int a[]) {
		int max;
		int min;
		if (a[0] > a[1]) {
			max = a[0];
			min = a[1];
		} else {
			max = a[1];
			min = a[0];
		}

		int len = a.length;
		int localMax;
		int localMin;
		// finding maximum and minimum using pair wise comparisons
		for (int i = 2; i < len - 1; i = i + 2) {
			if (a[i] > a[i + 1]) {
				localMax = a[i];
				localMin = a[i + 1];
			} else {
				localMin = a[i];
				localMax = a[i + 1];
			}
			if (localMax > max)
				max = localMax;
			if (localMin < min)
				min = localMin;
		}
		System.out.println("maximum is " + max + " minimum is " + min);
	}

}
