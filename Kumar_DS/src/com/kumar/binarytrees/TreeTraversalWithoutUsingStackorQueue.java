/*Given a tree traverse all its nodes without using any stack or queue
 * */
package com.kumar.binarytrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class TreeTraversalWithoutUsingStackorQueue {
	public static void main(String args[]) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		System.out
				.println("Inordertree traversal using Inorder Predecessor.... without using stack or queue");
		treeTraversalInorder(root);
		System.out
				.println("\nPreordertree traversal using Inorder Predecessor.... without using stack or queue");
		treeTraversalPreorder(root);
	}

	public static void treeTraversalInorder(TreeNode root) {
		TreeNode temp;
		while (root != null) {
			if (root.left != null) {
				temp = root.left;
				while (temp.right != null && temp.right != root)
					temp = temp.right;
				if (temp.right == null) {
					temp.right = root;
					root = root.left;
				} else if (temp.right == root) {
					System.out.print(" " + root.data + " ");
					temp.right = null;
					root = root.right;

				}
			} else {
				System.out.print(" " + root.data + " ");
				root = root.right;
			}
		}
	}

	public static void treeTraversalPreorder(TreeNode root) {
		TreeNode temp;
		while (root != null) {
			if (root.left != null) {
				temp = root.left;
				while (temp.right != null && temp.right != root)
					temp = temp.right;
				if (temp.right == null) {
					System.out.print(" " + root.data + " ");
					temp.right = root;
					root = root.left;
				} else if (temp.right == root) {

					temp.right = null;
					root = root.right;

				}
			} else {
				System.out.print(" " + root.data + " ");
				root = root.right;
			}
		}
	}

}
