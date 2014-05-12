/*Given a sorted array build a avl tree out of it
 * */
package com.kumar.avltrees;

import MyLibrary.AVLTreeNode;
import MyLibrary.AssortedMethods;

public class ArrayToAvlTree {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		AVLTreeNode root = BuildTree(a, 0, a.length - 1);
		System.out.println("the tree in Inorder is....");
		AssortedMethods.printInorder(root);
	}

	public static AVLTreeNode BuildTree(int a[], int start, int end) {
		if (start > end)
			return null;
		int mid = (start + end) / 2;
		AVLTreeNode temp = new AVLTreeNode(a[mid]);
		temp.left = BuildTree(a, start, mid - 1);
		temp.right = BuildTree(a, mid + 1, end);
		return temp;
	}
}
