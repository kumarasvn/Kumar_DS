/*Given a binary tree find the level that contains maximum number of nodes
 * */
package com.kumar.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class LevelWithMaxNodes {
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		leveWithMaxNodes(root);
	}

	static void leveWithMaxNodes(TreeNode root) {
		if (root == null)
			return;
		int maxLevel = 0, currentLevel = 1, maxNodes = 0, currentLevelNodes = 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			root = q.poll();
			if (root == null) {
				if (currentLevelNodes > maxNodes) {
					maxNodes = currentLevelNodes;
					maxLevel = currentLevel;
				}
				if (!q.isEmpty()) {
					q.add(null);
					++currentLevel;
					currentLevelNodes = 0;
				}
			} else {
				++currentLevelNodes;
				if (root.left != null)
					q.add(root.left);
				if (root.right != null)
					q.add(root.right);
			}

		}
		System.out
				.println(maxLevel
						+ " contains the most no of nodes and no of nodes in this level are "
						+ maxNodes);

	}

}
