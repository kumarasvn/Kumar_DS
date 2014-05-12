package com.kumar.binarysearchtrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class BSTreeOperations {
	public static boolean search(TreeNode root, int x) {
		while (root != null) {
			if (x == root.data)
				return true;
			else if (x < root.data)
				root = root.left;
			else
				root = root.right;
		}
		return false;
	}

	

	public static TreeNode insert(TreeNode root, int x) {
		TreeNode temp = root;
		TreeNode parent = null;
		while (root != null) {
			if (x > root.data) {
				parent = root;
				root = root.right;
			} else {
				parent = root;
				root = root.left;
			}
		}
		root = new TreeNode(x);
		root.left = null;
		root.right = null;
		if (parent != null) {
			if (x > parent.data) {
				parent.right = root;
			} else {
				parent.left = root;
			}
			return temp;
		}
		return root;
	}

	public static void insert1(TreeNode root, int x) {
		TreeNode parent = null;
		while (root != null) {
			if (x > root.data) {
				parent = root;
				root = root.right;
			} else {
				parent = root;
				root = root.left;
			}
		}
		root = new TreeNode(x);
		root.left = null;
		root.right = null;
		if (parent != null) {
			if (x > parent.data) {
				parent.right = root;
			} else {
				parent.left = root;
			}
		}
	}

	public static TreeNode delete(TreeNode root, int x) {
		TreeNode rootdup = root;
		TreeNode temp;
		TreeNode parent = null;
		while (root != null) {
			if (x > root.data) {
				parent = root;
				root = root.right;
			} else if (x < root.data) {
				parent = root;
				root = root.left;
			} else {
				if (root.left != null && root.right != null) {
					temp = InorderSuccessor.Inordersucc(root);
					root.data = temp.data;
					parent = root;
					root = root.right;
					x = temp.data;
				} else {
					temp = root.left != null ? root.left : root.right;
					if (parent == null)
						return temp;
					if (x > parent.data)
						parent.right = temp;
					else
						parent.left = temp;
					break;
				}
			}
		}
		return rootdup;
	}

	public static void main(String args[]) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		TreeNode root = TreeNode.createMinimalBST(array);
		System.out.println("Initial Tree");
		AssortedMethods.printInorder(root);
		BSTreeOperations.insert1(root, 15);
		System.out.println("\nAfter inserting 15");
		AssortedMethods.printInorder(root);
		System.out.println(BSTreeOperations.search(root, 6));
		BSTreeOperations.delete(root, 9);
		System.out.println("\nAfter deleting 9");
		AssortedMethods.printInorder(root);

	}
}
