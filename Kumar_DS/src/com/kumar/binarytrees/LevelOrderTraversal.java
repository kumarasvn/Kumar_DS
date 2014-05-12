/*Given a binary tree print it in level wise
 * */
package com.kumar.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		LevelOrderTraversal l = new LevelOrderTraversal();
		l.printLevelOrder(root);

	}

	public void printLevelOrder(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode t = q.remove();
			System.out.println(t.data);
			if (t.left != null)
				q.add(t.left);
			if (t.right != null)
				q.add(t.right);
		}
	}

}
