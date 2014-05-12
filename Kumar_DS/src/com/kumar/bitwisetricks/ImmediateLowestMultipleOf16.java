/*Given a number n find the immediate lowest multiple of 16
 * i.e for 17--->16
 *     for 35---->32     
 * */
package com.kumar.bitwisetricks;

public class ImmediateLowestMultipleOf16 {
	public static void main(String[] args) {
		int n = 49;
		System.out.println("lowest multiple of 16 for " + n + " is "
				+ ImmediatelowestMultipleOf16(n));
	}

	static int ImmediatelowestMultipleOf16(int n) {
		int lowestMultiple = n & ~15;// int lowestMultiple=n&-16;
		return lowestMultiple;

	}

}
