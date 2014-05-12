package com.kumar.test;

import MyLibrary.AssortedMethods;
import MyLibrary.TreeNode;

public class NthLargestNode {
	static int i=1;
	public static void main(String[] args) {
		TreeNode root=AssortedMethods.createBinarySearchTree();
		System.out.println("nth largest is: ");
		nthLargestinBST(root, 2);
		System.out.println();
		InorderTraversal(root);
	}
	static void nthLargestinBST(TreeNode root, int n){
		if(root==null) return;
		nthLargestinBST(root.left,n);
		 if(n==i++)
			 System.out.println(root.data);
		nthLargestinBST(root.right,n);
		
	}
	static void InorderTraversal(TreeNode root){
	
		if(root==null) return;
		InorderTraversal(root.left);
		   System.out.println(root.data);
		InorderTraversal(root.right);
	}

}
