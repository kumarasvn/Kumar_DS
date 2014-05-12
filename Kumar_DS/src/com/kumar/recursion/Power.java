/*calculate the power of a given number in an efficient way
 * */
package com.kumar.recursion;

public class Power {

	public static void main(String[] args) {
		System.out.println(pow(19, 5));

	}

	public static int pow(int a, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return a;
		int temp = pow(a, n / 2);
		int res = temp * temp;
		return (n % 2 == 0) ? res : res * a;
	}

}
