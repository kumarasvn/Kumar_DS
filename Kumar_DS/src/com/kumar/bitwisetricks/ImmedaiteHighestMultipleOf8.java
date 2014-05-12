/*Given a number n find the immediate highest multiple of 8
 * i.e for 17--->24
 *     for 9---->16     
 * */
package com.kumar.bitwisetricks;

public class ImmedaiteHighestMultipleOf8 {

	public static void main(String[] args) {
		int n = 19;
		System.out.println("Immediate highest multiple of 8 for " + n + " is "
				+ immediateHighestMultipleOf8(n));
	}

	static int immediateHighestMultipleOf8(int n) {
		int highestMultiple = (n + 7) & ~7;
		return highestMultiple;

	}

}
