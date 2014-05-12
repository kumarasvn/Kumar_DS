/*Given a number n find the immediate highest power of 2
 * */
package com.kumar.bitwisetricks;

/*Given a number n find next higher power of 2
 * */
public class NextPowerOfTwo {
	public static void main(String[] args) {
		int n = 15;
		System.out.println("next immediate higher power of 2 is "
				+ powerofTwo(n));

	}

	static int powerofTwo(int n) {
		if ((n & (n - 1)) == 0)
			return n;
		n = n | (n >>> 1);
		n = n | (n >>> 2);
		n = n | (n >>> 4);
		n = n | (n >>> 8);
		n = n | (n >>> 16);
		return n + 1;

	}

}
