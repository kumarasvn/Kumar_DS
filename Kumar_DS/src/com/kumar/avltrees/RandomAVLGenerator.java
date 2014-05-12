/*Given tree height h generate random avl tree of height h 
 * */
package com.kumar.avltrees;

import MyLibrary.AVLTreeNode;
import MyLibrary.AssortedMethods;

public class RandomAVLGenerator {

	public static void main(String[] args) {
		AVLTreeNode root = generateAvlTree(3);
		AssortedMethods.printInorder(root);
	}

	public static AVLTreeNode generateAvlTree(int height) {
		if (height <= 0)
			return null;
		AVLTreeNode temp = new AVLTreeNode(-1);
		temp.left = generateAvlTree(height - 1);
		temp.data = label.num++;
		temp.right = generateAvlTree(height - 2);
		return temp;
	}

	static class label {
		static int num = 1;
	}

}
