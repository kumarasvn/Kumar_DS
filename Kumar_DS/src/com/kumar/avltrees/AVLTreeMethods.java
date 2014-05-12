package com.kumar.avltrees;
import MyLibrary.AVLTreeNode;
import MyLibrary.AssortedMethods;

public class AVLTreeMethods {
	public AVLTreeNode insert(AVLTreeNode root,int x)
	{
		if(root==null)
		{
			 root=new AVLTreeNode(x);
			 root.right=root.left=null;
			 root.height=1;
			 return root;
		}
		else if(x<root.data)
		{
			root.left=insert(root.left,x);
			if(Math.abs(height(root.left)-height(root.right))>1)
			{
				if(x<root.left.data)
					return singleRotateRight(root);
				else
					return doubleRotateLeftRight(root);
			}
		}
		else if(x>root.data)
		{
			root.right=insert(root.right,x);
			if(Math.abs(height(root.left)-height(root.right))>1)
			{
				if(x>root.right.data)
					return singleRotateLeft(root);
				else
					return doubleRotateRightLeft(root);
			}
		}
		root.height=Math.max(height(root.left), height(root.right))+1;
		return root;
	}
	public AVLTreeNode singleRotateRight(AVLTreeNode p)
	{
		AVLTreeNode q=p.left;
		p.left=q.right;
		q.right=p;
		p.height=Math.max(height(p.left), height(p.right))+1;
		q.height=Math.max(height(q.left), height(q.right))+1;
		return q;
	}
	public AVLTreeNode singleRotateLeft(AVLTreeNode p)
	{
		AVLTreeNode q=p.right;
		p.right=q.left;
		q.left=p;
		p.height=Math.max(height(p.left), height(p.right))+1;
		q.height=Math.max(height(q.left), height(q.right))+1;
		return q;
	}
		public AVLTreeNode doubleRotateLeftRight(AVLTreeNode p)
		{
			p.left=singleRotateLeft(p.left);
			p=singleRotateRight(p);// or directly return SingleRotateRight(p);
			return p;
			
		}
	public AVLTreeNode doubleRotateRightLeft(AVLTreeNode p)
	{
		p.right=singleRotateRight(p.right);
		return singleRotateLeft(p);
	}
	public int height(AVLTreeNode root)
	{
		if(root==null)
		  return 0;
		if(root.left==null && root.right==null)
		 return 1;
		return Math.max(height(root.left),height(root.right))+1;
		
	}
	AVLTreeNode AvlSearch(AVLTreeNode t, int k)
	{
	      if(t==null) return null;
	      if(k== t.data) return t;
	      if(k < t.data) return AvlSearch(t.left, k);
	      return AvlSearch(t.right, k);
	}
	AVLTreeNode AvlSearchNR(AVLTreeNode t, int k)
	{
	       while(t!=null) {
	           if(k == t.data)  return t;
	           if(k < t.data)  t=t.left;
	           else  t=t.right;
	       }
	        return t;
	}


	//for testing
	public static void main(String args[])
	{
		AVLTreeMethods avltm=new AVLTreeMethods();
		AVLTreeNode root=null;
		root=avltm.insert(root, 10);
		root=avltm.insert(root, 8);
		root=avltm.insert(root, 7);
		root=avltm.insert(root, 6);
		AssortedMethods.printInorder(root);
	}

}

