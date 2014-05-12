package com.kumar.recursion;

public class TowersOfHonai {

	public static void main(String[] args) {

		Honai(5, 'A', 'B', 'C');
	}

	public static void Honai(int n, char src, char aux, char target) {
		if (n > 0) {
			Honai(n - 1, src, target, aux);
			System.out.println(src + "-->" + target);
			Honai(n - 1, aux, src, target);
		}
	}
}
