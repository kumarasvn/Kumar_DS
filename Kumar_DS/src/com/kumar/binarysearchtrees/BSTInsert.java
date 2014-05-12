package com.kumar.binarysearchtrees;

import MyLibrary.TreeNode;

public class BSTInsert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	TreeNode bstInsert(TreeNode t, int k) {
		if (t == null) {
			t = new TreeNode(k);
			t.left = t.right = null;
			t.data = k;
			return t;
		} else if (k < t.data)
			t.left = bstInsert(t.left, k);
		else if (k > t.data)
			t.right = bstInsert(t.right, k);
		return t;
	}

	TreeNode bstInsertNR(TreeNode t, int k) {
		TreeNode parent = null, root = t;
		while (t != null) {
			parent = t;
			if (k < t.data)
				t = t.left;
			else if (k > t.data)
				t = t.right;
		}
		t = new TreeNode(k);
		t.left = t.right = null;
		t.data = k;
		if (parent == null)
			return t;
		if (k < parent.data)
			parent.left = t;
		else
			parent.right = t;
		return root;
	}

}
