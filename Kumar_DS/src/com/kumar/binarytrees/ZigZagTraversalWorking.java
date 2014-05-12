package com.kumar.binarytrees;

import java.util.Stack;

import MyLibrary.TreeNode;

public class ZigZagTraversalWorking {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70 };
		TreeNode root = BuildTree(a, 0, a.length - 1);
		zigzagTraversal(root);
	}

	private static void zigzagTraversal(TreeNode root) {
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		s1.push(root);
		TreeNode temp;
		while (true) {
			while (!s1.isEmpty()) {
				temp = s1.pop();
				System.out.print(temp.data + " ");
				if (temp.right != null)
					s2.push(temp.right);
				if (temp.left != null)
					s2.push(temp.left);
			}
			while (!s2.isEmpty()) {
				temp = s2.pop();
				System.out.print(temp.data + " ");
				if (temp.left != null)
					s1.push(temp.left);
				if (temp.right != null)
					s1.push(temp.right);
			}
			if (s1.isEmpty() && s2.isEmpty())
				break;
		}

	}

	public static TreeNode BuildTree(int a[], int start, int end) {
		if (start > end)
			return null;
		int mid = (start + end) / 2;
		TreeNode temp = new TreeNode(a[mid]);
		temp.left = BuildTree(a, start, mid - 1);
		temp.right = BuildTree(a, mid + 1, end);
		return temp;
	}

}
