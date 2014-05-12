/*Given a binary tree count the no of nodes
 * */
package com.kumar.binarytrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class NodeCount {
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		System.out.print("Total number of nodes in given tree are "
				+ countNodes(root));
	}

	static int countNodes(TreeNode root) {
		if (root == null)
			return 0;
		return countNodes(root.left) + countNodes(root.right) + 1;

	}
}
