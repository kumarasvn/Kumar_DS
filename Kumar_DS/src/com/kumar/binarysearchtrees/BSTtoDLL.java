package com.kumar.binarysearchtrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class BSTtoDLL {

	public static void main(String[] args) {
		GlobalTreeNode gt = new GlobalTreeNode();
		TreeNode root = AssortedMethods.createBinarySearchTree();
		bstToDll(root, gt);
		TreeNode current = gt.tnode;
		do {
			System.out.print(" " + current.data + " ");
			current = current.right;
		} while (gt.tnode != current);

	}

	static void bstToDll(TreeNode root, GlobalTreeNode head) {
		if (root == null)
			return;
		bstToDll(root.left, head);
		TreeNode temp = root.right;
		append(root, head);
		bstToDll(temp, head);
	}

	static void append(TreeNode current, GlobalTreeNode head) {
		// TODO Auto-generated method stub
		if (head.tnode == null) {
			head.tnode = current;
			head.tnode.right = head.tnode;
			head.tnode.left = head.tnode;
		} else {

			current.right = head.tnode;
			current.left = head.tnode.left;
			head.tnode.left.right = current;
			head.tnode.left = current;
		}
	}
}

class GlobalTreeNode {
	TreeNode tnode;

	GlobalTreeNode() {
		this.tnode = null;
	}
}
