package com.kumar.binarysearchtrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class BSTtoDLL1 {
	static TreeNode head;
	public static void main(String[] args) {
		
		TreeNode root = AssortedMethods.createBinarySearchTree();
		bstToDll(root, head);
		TreeNode current = head;
		do {
			System.out.print(" " + current.data + " ");
			current = current.right;
		} while (head != current);

	}

	static void bstToDll(TreeNode root, TreeNode head) {
		if (root == null)
			return;
		bstToDll(root.left, head);
		TreeNode temp = root.right;
		head=append(root, head);
		bstToDll(temp, head);
		
		
	}

	static TreeNode append(TreeNode current, TreeNode head) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = current;
			head.right = head;
			head.left = head;
		} else {

			current.right = head;
			current.left = head.left;
			head.left.right = current;
			head.left = current;
		}
		return head;
	}
}


