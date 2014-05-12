/*Given a array of size n find the next maximum value for each element
 * */
package com.kumar.stacksandqueues;

import java.util.Stack;

public class ImmediateMaximum {
	public static void main(String args[]) {
		int in[] = { 10, 20, 50, 40, 30 };
		int out[] = new int[in.length];
		findHigher(in, out);
		for (int k : in)
			System.out.print(k + " ");
		System.out.println();
		for (int k : out)
			System.out.print(k + " ");
	}

	static void findHigher(int in[], int out[]) {
		Stack<Integer> s = new Stack<Integer>();
		int n = in.length;
		for (int i = n - 1; i >= 0; i--) {
			while (!s.isEmpty()) {
				if (in[i] < s.peek()) {
					out[i] = s.peek();
					s.push(in[i]);
					break;
				} else
					s.pop();

			}
			if (s.isEmpty()) {
				s.push(in[i]);
				out[i] = -1;
			}
		}
	}

}
