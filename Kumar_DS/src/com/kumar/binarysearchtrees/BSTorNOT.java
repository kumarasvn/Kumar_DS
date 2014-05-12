/*Given a tree return true if it is  binary search tree otherwise return false*/
package com.kumar.binarysearchtrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class BSTorNOT {
	public static void main(String args[]) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		AssortedMethods.printInorder(root);root.data=1;
		boolean isBST = isBST(root);
		System.out.println(isBST);
		System.out.println(isBST1(root));
	}

	static boolean isBST(TreeNode root) {
		return auxBstree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean auxBstree(TreeNode root, int minValue, int maxValue) {

		if (root == null)
			return true;
		return (root.data > minValue && root.data < maxValue)
				&& auxBstree(root.left, minValue, root.data)
				&& auxBstree(root.right, root.data, maxValue);
	}
	static int isBST1(TreeNode t)
	{
	      int prev= Integer.MIN_VALUE;
	      return AuxBST(t, prev);
	}
	static int AuxBST(TreeNode t, int prev)
	{ 
	      if(t==null) return 1;
	      if(AuxBST(t.left, prev)!=1 ) return 0;
	      if(t.data < prev) return 0;
	      prev=t.data;
	      return AuxBST(t.right, prev);
	}



}
