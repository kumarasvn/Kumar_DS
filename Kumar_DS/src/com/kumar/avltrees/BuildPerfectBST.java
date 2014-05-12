package com.kumar.avltrees;

import MyLibrary.AVLTreeNode;
import MyLibrary.AssortedMethods;

public class BuildPerfectBST {

	public static void main(String[] args) {
		BuildPerfectBST b=new BuildPerfectBST();
		AVLTreeNode root=b.buildPerfectBST(3);
		AssortedMethods.printInorder(root);

	}

	AVLTreeNode buildPerfectBST(int h) {
		return AuxPerfectBST(h, 1, (1 << h) - 1);
	}

	AVLTreeNode AuxPerfectBST(int h, int lkey, int rkey) {
		AVLTreeNode tmp;
		int middle;
		if (h == 0)
			return null;
		middle = lkey + (rkey - lkey) / 2;
		tmp = new AVLTreeNode(middle);
		tmp.left = AuxPerfectBST(h - 1, lkey, middle - 1);
		tmp.right = AuxPerfectBST(h - 1, middle + 1, rkey);
		return tmp;
	}

}
