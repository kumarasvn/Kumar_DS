/*Given a binary tree count the no of leaf nodes
 * */
package com.kumar.binarytrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class LeafNodeCount {
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		System.out.print("Total number of leaf nodes in given tree are "
				+ countLeafNodes(root));
	}

	static int countLeafNodes(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		return countLeafNodes(root.left) + countLeafNodes(root.right);

	}
}
