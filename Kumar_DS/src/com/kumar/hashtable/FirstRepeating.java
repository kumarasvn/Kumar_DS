/*Given a string find the first repeated character*/
package com.kumar.hashtable;

import java.util.HashSet;

public class FirstRepeating {
	
	public static void  main(String args[])
	{
		
		System.out.println(firstRepeating("abcbc".toCharArray()));
	}
	private static char firstRepeating(char[] s)
	{
		HashSet<Character> h=new HashSet<Character>();
		boolean isadded=false;
		for(char c:s)
		{
			isadded=h.add(c);
			if(!isadded) return c;
		}
		return 0;
	}
}
