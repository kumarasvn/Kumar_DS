/*Given a binary search tree find least common ancestor*/
package com.kumar.binarysearchtrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class LeastCommonAncestor {
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		System.out.println("Given tree in Inorder..");
		AssortedMethods.printInorder(root);
		System.out.println("LCA of 90 and 95 is.." + findLCA(root, 90, 95));
	}

	static int findLCA(TreeNode root, int p, int q) {
		while (true) {
			if (root.data > p && root.data > q)
				root = root.left;
			else if (root.data < p && root.data < q)
				root = root.right;
			else
				return root.data;
		}

	}

}
