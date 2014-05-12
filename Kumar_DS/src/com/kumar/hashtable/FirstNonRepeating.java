/*Given a string find the first non repeating character
 * */
package com.kumar.hashtable;

import java.util.HashMap;

public class FirstNonRepeating {

	public static void main(String[] args) {
		System.out.println(firstNonRepeating("abcba"));

	}

	private static char firstNonRepeating(String s) {
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		int len = s.length();
		int c;
		for (int i = 0; i < len; i++) {
			if (!h.containsKey(s.charAt(i)))
				h.put(s.charAt(i), 1);
			else {
				c = h.get(s.charAt(i));
				h.put(s.charAt(i), ++c);
			}
		}
		for (int i = 0; i < len; i++) {
			c = h.get(s.charAt(i));
			if (c == 1)
				return s.charAt(i);
		}
		return 0;

	}

}
