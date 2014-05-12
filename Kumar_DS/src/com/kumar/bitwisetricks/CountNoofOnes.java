/*Given a number n count no of 1s in its bit pattern*/
package com.kumar.bitwisetricks;

public class CountNoofOnes {

	public static void main(String[] args) {
		int n = 9;
		System.out.println("no of ones in " + n + " are " + countOnes(n));
		System.out.println("no of ones in " + n + " are " + countOnes1(n));
		System.out.println("no of ones in " + n + " are " + countOnes2(n));

	}

	// checking each bit
	static int countOnes(int n) {
		int count = 0;
		if (n == 0)
			return count;
		for (; n != 0; n = n >>> 1) {
			if ((n & 1) > 0)
				count++;
		}
		return count;
	}

	// each time make the lowest one as zero
	static int countOnes1(int n) {
		int count = 0;
		if (n == 0)
			return count;
		do {
			++count;
			n = (n & (n - 1));
		} while (n != 0);
		return count;

	}

	// using preprocessed bit count array.If we want for -ve numbers and some
	// what large numbers
	// we need to preprocess initially and store it in bitCount array
	static int countOnes2(int n) {
		int count = 0;
		int bitCount[] = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
		for (; n != 0; n = n >> 4) {
			count = count + bitCount[n & 0xF];
		}
		return count;

	}

}
