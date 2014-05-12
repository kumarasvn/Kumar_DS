/*Given a binary tree create a mirror copy of it*/
package com.kumar.binarytrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class MirrorCopy {

	public static void main(String[] args) {
		TreeNode root = AssortedMethods.createBinarySearchTree();
		System.out.println("Actual tree is ");
		AssortedMethods.printInorder(root);
		MirrorCopy mc = new MirrorCopy();
		TreeNode mcopy = mc.createMirrorCopy(root);
		System.out.println("Mirror copy is ");
		AssortedMethods.printInorder(mcopy);

	}

	public TreeNode createMirrorCopy(TreeNode root) {
		if (root == null)
			return null;
		TreeNode temp = new TreeNode(root.data);
		temp.left = createMirrorCopy(root.right);
		temp.right = createMirrorCopy(root.left);
		return temp;
	}

}
