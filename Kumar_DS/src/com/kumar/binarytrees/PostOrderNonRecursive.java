/*Given a binary tree do Postorder traversal without using recursion
 * */
package com.kumar.binarytrees;

import java.util.Stack;
public class PostOrderNonRecursive {
	public static void main(String[] args) {
		sTreeNode root = createBinarySearchTree();
		postorderNR(root);
	}

	public static sTreeNode createBinarySearchTree() {
		sTreeNode root = new sTreeNode(80);
		root.left = new sTreeNode(70);
		root.right = new sTreeNode(90);
		root.left.left = new sTreeNode(60);
		root.left.right = new sTreeNode(75);
		root.right.left = new sTreeNode(85);
		root.right.right = new sTreeNode(95);
		return root;
	}

	static void postorderNR(sTreeNode root) {
		if (root == null)
			return;
		Stack<sTreeNode> s = new Stack<sTreeNode>();
		while (true) {
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			if (s.empty())
				break;
			root = s.pop();
			if (root.flag == false) {
				root.flag = true;
				s.push(root);
				root = root.right;
			} else {
				root.flag=false;//making the tree flags to its initial position
				System.out.print(root.data + " ");
				root = null;
			}

		}
	}
}

class sTreeNode {
	public int data;
	public sTreeNode left;
	public sTreeNode right;
	public boolean flag;

	public sTreeNode(int d) {
		data = d;
		flag = false;
	}
}
