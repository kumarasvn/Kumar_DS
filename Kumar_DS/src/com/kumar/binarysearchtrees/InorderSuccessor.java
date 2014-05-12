package com.kumar.binarysearchtrees;

import MyLibrary.TreeNode;

public class InorderSuccessor {
	static TreeNode Inordersucc(TreeNode root) {
		TreeNode p;
		if (root.parent==null||root.right != null) {
			p = leftmostchild(root.right);
		} else {

			while ((p = root.parent) != null) {
				if (p.left == root)
					break;
				root = p;
			}
		}
		return p;
	}

	private static TreeNode leftmostchild(TreeNode root) {
		if (root == null)
			return null;
		while (root.left != null)
			root = root.left;
		return root;
	}
}
