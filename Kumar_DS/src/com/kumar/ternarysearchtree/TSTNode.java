package com.kumar.ternarysearchtree;

public class TSTNode {
	char data;
	int flag;
	TSTNode left;
	TSTNode middle;
	TSTNode right;

	public TSTNode(char data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.middle = null;
		this.flag = 0;

	}
}
