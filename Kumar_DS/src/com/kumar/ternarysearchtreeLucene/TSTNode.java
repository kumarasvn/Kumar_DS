package com.kumar.ternarysearchtreeLucene;

public class TSTNode {
	char data;
	String token;
	TSTNode loKid;
	TSTNode eqKid;
	TSTNode hiKid;

	public TSTNode(char data) {
		this.data = data;
		this.loKid = null;
		this.hiKid = null;
		this.eqKid = null;
		this.token = null;

	}
}
