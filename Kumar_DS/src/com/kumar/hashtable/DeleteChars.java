/*Given two strings S1 and S2 delete all elements in S1 which are present in S2
 * and return S2 without loosing relative order
 * S1="abcadce";
 * S2="ac";
 * output should be "bde"
 *  * */
package com.kumar.hashtable;

import java.util.HashSet;

public class DeleteChars {
	public static void main(String[] args) {
		StringBuffer S1 = new StringBuffer("abcadce");
		StringBuffer S2 = new StringBuffer("ac");
		System.out.println(deleteChars(S1, S2));

	}

	private static StringBuffer deleteChars(StringBuffer S1, StringBuffer S2) {
		int len1 = S2.length();
		int prev, current;
		HashSet<Character> h = new HashSet<Character>();
		for (int i = 0; i < len1; i++) {
			h.add(S2.charAt(i));
		}
		int len2 = S1.length();
		for (prev = -1, current = 0; current < len2; current++) {
			if (!h.contains(S1.charAt(current))) {
				S1.setCharAt(++prev, S1.charAt(current));
			}

		}
		return new StringBuffer(S1.substring(0, ++prev));

	}

}
