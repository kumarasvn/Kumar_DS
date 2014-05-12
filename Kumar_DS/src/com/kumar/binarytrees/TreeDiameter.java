/*Given a binary tree find the diameter.Diameter is defined as longest distance between any two nodes
 * */
package com.kumar.binarytrees;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class TreeDiameter {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70 };
		TreeNode root = AssortedMethods.createTreeFromArray(a);
		AssortedMethods.printInorder(root);
		Diameter d = new Diameter(0);
		TreeDiameter t = new TreeDiameter();
		t.findDiameter(root, d);
		System.out.println("Diameter is " + d.d);
	}

	int findDiameter(TreeNode root, Diameter d) {
		if (root == null)
			return 0;
		int lh = findDiameter(root.left, d);
		int rh = findDiameter(root.right, d);
		d.d = Math.max(d.d, lh + rh);
		return 1 + Math.max(lh, rh);

	}

}

class Diameter {
	int d;

	public Diameter(int d) {
		// TODO Auto-generated constructor stub
		this.d = d;
	}

}
