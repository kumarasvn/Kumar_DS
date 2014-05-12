/*Given a binary tree find the least common ancestor of it
 * */
package com.kumar.binarytrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class LeastCommonAncestor {
	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		TreeNode p = root.left.left;
		TreeNode q = root.right.right;
		LeastCommonAncestor lca = new LeastCommonAncestor();
		System.out.println("LCA of " + p.data + "  and " + q.data + " is "
				+ lca.findLCA(root, p, q).data);
	}

	public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return null;
		if (root == p || root == q)
			return root;
		TreeNode leftSubtree = findLCA(root.left, p, q);
		TreeNode rightSubtree = findLCA(root.right, p, q);
		if (leftSubtree != null && rightSubtree != null)
			return root;
		return (leftSubtree != null) ? leftSubtree : rightSubtree;

	}

}
