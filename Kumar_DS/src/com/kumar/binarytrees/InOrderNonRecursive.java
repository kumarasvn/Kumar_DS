/*Given a binary tree do InOrder traversal without using recursion
 * */
package com.kumar.binarytrees;

import java.util.Stack;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class InOrderNonRecursive {
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		inorderNR(root);
	}

	static void inorderNR(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		while (true) {
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			if (s.empty())
				break;
			root = s.pop();
			System.out.print(root.data + " ");
			root = root.right;
		}
	}
}
