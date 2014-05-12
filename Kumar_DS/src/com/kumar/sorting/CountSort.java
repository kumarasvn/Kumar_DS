/*Given an array elements in which all the elements are  in range 0 to k
 * perform count sort
 * */
package com.kumar.sorting;

public class CountSort {

	public static void main(String[] args) {
		int in[]={0,1,2,3,1,0,1,2,3,0,1,1};
		System.out.println("elements before sorting...");
		for (int i : in)
			System.out.print(i + " ");
		CountSort.countSort(in, 3);
		System.out.println("elements after sorting...");
		for (int i : in)
			System.out.print(i + " ");
	}
	static void countSort(int in[],int range){
		int aux[]=new int[range+1];
		int len=in.length;
		int out[]=new int[len];
		for(int i=0;i<len;i++){
			++aux[in[i]];
		}
		for(int i=1;i<=range;i++){
			aux[i]=aux[i]+aux[i-1];
		}
		for(int i=0;i<len;i++){
			out[--aux[in[i]]]=in[i];
		}
		for(int i=0;i<len;i++)
			in[i]=out[i];
	}

}
