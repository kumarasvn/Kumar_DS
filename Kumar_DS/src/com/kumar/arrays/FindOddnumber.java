package com.kumar.arrays;

/*Given an integer array with each number repeating even number of times except one number
 * find the number which is repeating odd number of times
 * 
 * */
public class FindOddnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 10, 40, 50, 60, 40, 50, 60 };
		System.out.println(oddNumberwithOddcount(a));

	}

	// performing XOR operation on all the elements
	static int oddNumberwithOddcount(int a[]) {
		int result = a[0];
		for (int i = 1; i < a.length; i++)
			result ^= a[i];
		return result;
	}

}
