package com.kumar.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class Search {

	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		TreeNode temp = searchNR(root, 75);
		if (temp != null)
			System.out.println(temp.data);

	}

	static TreeNode search(TreeNode t, int x) {
		TreeNode tmp;
		if (t == null)
			return null;
		if (x == t.data)
			return t;
		// If found in left subtree then return
		if ((tmp = search(t.left, x)) != null)
			return tmp;
		return search(t.right, x);
	}

	static TreeNode searchNR(TreeNode t, int x) {
		TreeNode tmp;

		if (t == null)
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(t);
		while (!q.isEmpty()) {
			tmp = q.remove();
			if (tmp.data == x)
				return tmp;
			if (tmp.left != null)
				q.add(tmp.left);
			if (tmp.right != null)
				q.add(tmp.right);
		}

		return null;
	}

}
