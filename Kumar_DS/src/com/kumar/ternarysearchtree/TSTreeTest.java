package com.kumar.ternarysearchtree;

public class TSTreeTest {
	public static void main(String[] args) {
		TSTree tst = new TSTree();
		TSTNode root = null;
		root = tst.insert(root, "ab", 0);
		root = tst.insert(root, "abc", 0);
		root = tst.insert(root, "def", 0);
		root = tst.insert(root, "abbas", 0);
		root = tst.insert(root, "babu", 0);
		root = tst.insert(root, "balu", 0);
		root = tst.insert(root, "bhanu", 0);
		System.out.println("Printing all the words..."); 
        tst.printInorder(root, 0, new char[100]);
		System.out.println("this is prefix search....words starting with \"ba\"");
		tst.prefixSearch(root, "ba");
		System.out.println(tst.contains(root, "abhinav"));
		
	}

}
