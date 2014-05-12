/*Given an array of size n find majority element
 * @author : SVN Kumar Atyam
 * */
package com.kumar.arrays;

public class MajorityElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 4, 1, 3, 1, 0, 1 };
		int majorityelement = findMajorityElement(a);
		System.out.println(majorityelement);

	}

	private static int findMajorityElement(int[] a) {
		int n = a.length;
		int count = 1;
		int majorityElement = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] == majorityElement)
				count++;
			else
				count--;
			if (count == 0) {
				majorityElement = a[i];
				count = 1;
			}
		}
		return checkMajority(majorityElement, a);

	}

	private static int checkMajority(int majorityElement, int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == majorityElement)
				count++;
		}
		if (count > (a.length / 2))
			return majorityElement;
		return -1;
	}

}
