package com.kumar.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class FindHeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		System.out.println(findHeight(root));
		System.out.println(findHeightNR(root));
		

	}

	static int findHeight(TreeNode t) {
		if (t == null)
			return 0;
		return Math.max(findHeight(t.left), findHeight(t.right)) + 1;
	}

	static int findHeightNR(TreeNode t) {
		int level = 0;

		if (t == null)
			return 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(t);
		q.add(null);// indicator for end of first level
		while (!q.isEmpty()) {
			t = q.remove();
			// If the previous level is finished up increment level
			if (t == null) {
				// place the indicator for end of next level at the end of queue
				if (!q.isEmpty())
					q.add(null);
				level++;
			} else {
				if (t.left != null)
					q.add(t.left);
				if (t.right != null)
					q.add(t.right);
			}
		}
		return level;
	}
}
