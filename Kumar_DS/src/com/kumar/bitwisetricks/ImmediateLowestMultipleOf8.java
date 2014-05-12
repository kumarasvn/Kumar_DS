/*Given a number n find the immediate lowest multiple of 8
 * i.e for 17--->16
 *     for 9---->8     
 * */
package com.kumar.bitwisetricks;

public class ImmediateLowestMultipleOf8 {
	public static void main(String[] args) {
		int n = 33;
		System.out.println("lowest multiple of 8 for " + n + " is "
				+ immediateLowestMultipleOf8(n));
	}

	static int immediateLowestMultipleOf8(int n) {
		int lowestMultiple = n & ~7;// int lowestMultiple=n&-8;
		return lowestMultiple;

	}

}
