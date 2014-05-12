/*Given a 2-D array of all 1's and 0's.All 0's will come after all 1's in each row.Find the row that contains the maximum no of zeros
 * */
package com.kumar.arrays;

public class RowwithMaxzero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 1, 0, 0 }, { 1, 1, 1, 0 }, { 1, 0, 0, 0 },
				{ 1, 1, 1, 1 } };
		System.out.println(rowWithMaxZero(a));

	}

	static int rowWithMaxZero(int a[][]) {
		int r = 0;
		int c = a[0].length - 1;
		int n = a.length;
		int rowWithMaxZero = 0;
		while (r <= n - 1 && c >= 0) {
			if (a[r][c] == 0) {
				--c;
				rowWithMaxZero = r;
			} else
				++r;
		}
		return rowWithMaxZero;
	}

}
