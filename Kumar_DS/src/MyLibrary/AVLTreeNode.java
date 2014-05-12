package MyLibrary;

public class AVLTreeNode {
	public int data;
	public AVLTreeNode left;
	public AVLTreeNode right;
	public int height;
	public AVLTreeNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
		this.height=1;
	}

}
