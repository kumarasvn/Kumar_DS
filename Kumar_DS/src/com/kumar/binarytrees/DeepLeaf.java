package com.kumar.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class DeepLeaf {

	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		TreeNode temp = deepLeaf(root);
		System.out.println(temp.data);

	}

	static TreeNode deepLeaf(TreeNode t) {
		TreeNode tmp, prev = null;

		if (t == null)
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(t);
		while (!q.isEmpty()) {
			tmp = q.remove();
			prev = tmp;
			if (tmp.left != null)
				q.add(tmp.left);
			if (tmp.right != null)
				q.add(tmp.right);
		}

		return prev;
	}

}
