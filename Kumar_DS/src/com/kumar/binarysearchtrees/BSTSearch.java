package com.kumar.binarysearchtrees;

import MyLibrary.TreeNode;

public class BSTSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	TreeNode bstSearch(TreeNode t, int k) {
		if (t == null)
			return null;
		if (k == t.data)
			return t;
		if (k < t.data)
			return bstSearch(t.left, k);
		return bstSearch(t.right, k);
	}

	TreeNode bstSearchNR(TreeNode t, int k) {
		while (t != null) {
			if (k == t.data)
				return t;
			if (k < t.data)
				t = t.left;
			else
				t = t.right;
		}
		return t;
	}

}
