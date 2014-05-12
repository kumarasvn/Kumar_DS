/*Write a program for Ternary search tree and implement the following methods
 * 1)insert
 * 2)contains
 * 3)prefix search
 * 4)printInorder
 * */
package com.kumar.ternarysearchtree;

public class TSTree {

	/*
	 * Insert method is used to insert word into Ternary search tree
	 */
	public TSTNode insert(TSTNode root, String s, int i) {
		if (root == null) {
			root = new TSTNode(s.charAt(i));
		}
		if (s.charAt(i) > root.data)
			root.right = insert(root.right, s, i);
		else if (s.charAt(i) < root.data)
			root.left = insert(root.left, s, i);
		else {
			if ((i + 1) == s.length()) {
				root.flag = 1;
				return root;
			}
			root.middle = insert(root.middle, s, i + 1);
		}
		return root;
	}

	/*
	 * this method finds whether a particular pattern is available or not in the
	 * given TST
	 */
	private TSTNode find(TSTNode root, String s, int i) {
		if (root == null)
			return null;
		if (s.charAt(i) > root.data) {
			return find(root.right, s, i);
		} else if (s.charAt(i) < root.data) {
			return find(root.left, s, i);
		} else {
			if ((i + 1) == s.length())
				return root;
			else
				return find(root.middle, s, i + 1);
		}
	}

	/*
	 * this method finds whether a particular String is available or not in the
	 * given TST
	 */
	public boolean contains(TSTNode root, String s) {
		TSTNode temp = find(root, s, 0);
		if (temp == null)
			return false;
		else
			return temp.flag == 1;

	}

	/*
	 * prints all the strings that are present in a TST
	 */
	public void printInorder(TSTNode root, int d, char a[]) {
		if (root == null)
			return;
		printInorder(root.left, d, a);
		a[d] = root.data;
		if (root.flag == 1)
			print(a, d);

		printInorder(root.middle, d + 1, a);
		printInorder(root.right, d, a);

	}

	/*
	 * Prints all the elements that will start with a particular prefix
	 */
	public void prefixSearch(TSTNode root, String prefix) {
		TSTNode temp = find(root, prefix, 0);
		if (temp != null) {
			System.out.println("words that are starting with "
					+ prefix.toString());
			char word[] = new char[20];
			for (int i = 0; i < prefix.length(); i++) {
				word[i] = prefix.charAt(i);
			}
			printInorder(temp.middle, prefix.length(), word);
		}
	}

	private void print(char[] a, int d) {
		for (int i = 0; i <= d; i++)
			System.out.print(a[i]);
		System.out.println();

	}

}
