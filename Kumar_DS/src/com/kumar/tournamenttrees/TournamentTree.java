/*WAP to decide the kth winner of a tournament in which n people are participated*/
package com.kumar.tournamenttrees;

import java.util.Scanner;

public class TournamentTree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out
				.println("enter the no of people want to participate in tournament\n");
		int n = s.nextInt();
		int a[] = new int[2 * n - 1];
		int temp;
		int iteration = 0;
		int index;
		System.out.println("enter the elements...");
		for (int i = n - 1; i < (2 * n - 1); i++) {
			a[i] = s.nextInt();
		}
		System.out
				.println("enter the kth winner u want(1st winner 2nd winner 3rd winner)...");
		int kthwinner = s.nextInt();
		while (true) {
			for (int i = n - 2; i >= 0; i--) {
				a[i] = (a[2 * i + 1] > a[2 * i + 2]) ? a[2 * i + 1]
						: a[2 * i + 2];
			}
			temp = a[0];
			a[0] = Integer.MIN_VALUE;
			for (int i = 0; (2 * i + 2) < (2 * n - 1); i = index) {
				index = (a[2 * i + 1] == temp) ? 2 * i + 1 : 2 * i + 2;
				a[index] = Integer.MIN_VALUE;
			}
			if (++iteration == kthwinner) {
				System.out.println(kthwinner + "th winner is " + temp);
				break;
			}
		}
	}

}
