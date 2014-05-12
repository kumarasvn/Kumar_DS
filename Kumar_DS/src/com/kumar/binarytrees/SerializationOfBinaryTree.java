/*Given a binary tree how will you store it and  how to re construct a tree from that 
 * */
package com.kumar.binarytrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class SerializationOfBinaryTree {
	static int preIndex = 0;

	public static TreeNode BuildTree(int in[], int pre[], int l, int r) {
		if (l > r)
			return null;
		TreeNode temp = new TreeNode(pre[preIndex++]);
		if (l == r)
			return temp;
		int inIndex = linearSearch(in, l, r, temp.data);
		// preIndex++;
		temp.left = BuildTree(in, pre, l, inIndex - 1);
		temp.right = BuildTree(in, pre, inIndex + 1, r);
		return temp;
	}

	public static void main(String args[]) {
		int in[] = { 60, 70, 75, 80, 85, 90, 95 };
		int pre[] = { 80, 70, 60, 75, 90, 85, 95 };
		int l = 0;
		int r = in.length - 1;
		TreeNode root = BuildTree(in, pre, l, r);
		System.out.println("this is after reconstructing the tree...");
		AssortedMethods.printInorder(root);
	}

	public static int linearSearch(int a[], int left, int right, int ele) {
		while (left < right) {
			if (a[left] == ele)
				return left;
			left++;
		}
		return 0;
	}
}
