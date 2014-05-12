/*Find the remainder when n is divided with powers of 2
 * */
package com.kumar.bitwisetricks;

public class Remainder {
	public static void main(String[] args) {

		int n = 18;
		System.out.println("Remainder when " + n + " divided with 4 "
				+ findRemainderwith4(n));
		System.out.println("Remainder when " + n + " divided with 8 "
				+ findRemainderwith8(n));
		System.out.println("Remainder when " + n + " divided with 16 "
				+ findRemainderwith16(n));
		System.out.println("Remainder when " + n + " divided with 32 "
				+ findRemainderwith32(n));

	}

	static int findRemainderwith4(int n) {

		return n & 3;

	}

	static int findRemainderwith8(int n) {

		return n & 7;

	}

	static int findRemainderwith16(int n) {

		return n & 15;

	}

	static int findRemainderwith32(int n) {

		return n & 31;

	}

}
