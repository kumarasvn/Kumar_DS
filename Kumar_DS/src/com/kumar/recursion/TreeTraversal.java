/*Given a tree traverse using Inorder preorder and postoreder recursively
 * */
package com.kumar.recursion;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class TreeTraversal {
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		TreeTraversal t = new TreeTraversal();
		System.out.println("\nPre order traversal.....");
		t.preOrderTraversal(root);
		System.out.println("\nIn order traversal.....");
		t.InorderTraversal(root);
		System.out.println("\nPost order traversal.....");
		t.postOrderTraversal(root);
	}

	public void InorderTraversal(TreeNode root) {
		if (root == null)
			return;
		InorderTraversal(root.left);
		System.out.print(" " + root.data + " ");
		InorderTraversal(root.right);

	}

	public void preOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		System.out.print(" " + root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);

	}

	public void postOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(" " + root.data + " ");

	}

}
