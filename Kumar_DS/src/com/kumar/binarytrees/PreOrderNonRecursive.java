/*Given a binary tree do Preorder traversal without using recursion
 * */
package com.kumar.binarytrees;

import java.util.Stack;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class PreOrderNonRecursive {
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		preorderNR(root);
	}

	static void preorderNR(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		while (true) {
			while (root != null) {
				System.out.print(root.data + " ");
				s.push(root);
				root = root.left;
			}
			if (s.empty())
				break;
			root = s.pop().right;
		}
	}
}
