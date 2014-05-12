package com.kumar.binarytrees;

public class ThreadedBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//finding Inorder successor
	public ThreadedTreeNode findInOrdersucc(ThreadedTreeNode t)
	{
		ThreadedTreeNode temp=t.right;
		if(t.rthread==0)
		{
			while(temp.left!=null)
			{
				temp=temp.left;
			}
		}
		return temp;
	}
	//this is right threaded binary tree
	public ThreadedTreeNode createThreadedBinaryTree()
	{
		ThreadedTreeNode head=new ThreadedTreeNode();
		ThreadedTreeNode a=new ThreadedTreeNode(80);
		ThreadedTreeNode b=new ThreadedTreeNode(70);
		ThreadedTreeNode c=new ThreadedTreeNode(90);
		ThreadedTreeNode d=new ThreadedTreeNode(65);
		ThreadedTreeNode e=new ThreadedTreeNode(75);
		ThreadedTreeNode f=new ThreadedTreeNode(95);
		ThreadedTreeNode g=new ThreadedTreeNode(85);
		head.left=a;
		head.right=head;
		
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		c.left=g;
		c.right=f;
		//use empty links as threads
		d.right=b;
		d.rthread=1;
		e.right=a;
		e.rthread=1;
		g.right=c;
		g.rthread=1;
				
		return head;
		
	}

}
class ThreadedTreeNode
{
	Object data;
	ThreadedTreeNode left;
	ThreadedTreeNode right;
	int rthread;
	  public ThreadedTreeNode(Object data) {
		this.data=data;
		this.rthread=0;
		this.left=null;
		this.right=null;
	}
	  public ThreadedTreeNode() {
			this.data=null;
			this.rthread=0;
			this.left=null;
			this.right=null;
		}
	
}
