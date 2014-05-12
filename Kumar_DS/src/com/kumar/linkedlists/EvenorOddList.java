package com.kumar.linkedlists;

public class EvenorOddList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int IsOddList(ListNode l)
	{
	      int flag=0;
	      l=l.next;
	      for(; l!=null; l=l.next)
	          flag = 1-flag;
	      return flag;
	}
	public int IsOddList1(ListNode l)
	{
	      int count=0;
	      l=l.next;
	      for(; l!=null; l=l.next)
	          count++;
	      return count%2;
	}
	int IsOddList2(ListNode l)
	{
	      l = l.next;
	      // move two links at a time until last node or NULL is reached
	      while(l!=null && l.next!=null)
	          l = l.next.next;
	      if(l!=null) return 1;
	      return 0;
	}




}
class ListNode{
	int data;
	ListNode next;
}
