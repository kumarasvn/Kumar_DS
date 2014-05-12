/*Write a program to determine two arrays are identical or not(ordering is not a matter)
 * */
package com.kumar.hashtable;

import java.util.HashMap;

public class IdenticalArrays {

	public static void main(String[] args) 
	{
	   int a[]={1,2,4,5,6};
	   int b[]={4,5,6,2,1};
	   System.out.println(areIdentical(a, b));
   
	}
	private static boolean areIdentical(int a[],int b[])
	{
		int len1=a.length;
		int len2=b.length;
		int c;
		if(len1!=len2) return false;
		HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
		for(int k:a)
		{
			if(!h.containsKey(k))
				h.put(k,1);
			else
			{
				c=h.get(k);
				h.put(k,++c);
			}
				
		}
		for(int k:b)
		{
			if(!h.containsKey(k))
				return false;
			else
			{
				c=h.get(k);
				if(--c==0)
					h.remove(k);
				else
					h.put(k, c);
			}
		}
		return true;
	}
}
