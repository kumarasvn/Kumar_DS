package com.kumar.binarysearchtrees;

import MyLibrary.TreeNode;

public class FindMaxAndMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int FindMax(TreeNode p) {
		if (p == null)
			return Integer.MAX_VALUE;
		while (p.right != null)
			p = p.right;
		return p.data;
	}

	int FindMin(TreeNode p) {
		if (p == null)
			return Integer.MIN_VALUE;
		while (p.left != null)
			p = p.left;
		return p.data;
	}

	boolean isBST(TreeNode t) {
		if (t == null)
			return true;
		return (t.data > FindMax(t.left)) && (t.data < FindMin(t.right))
				&& isBST(t.left) && isBST(t.right);
	}

}
