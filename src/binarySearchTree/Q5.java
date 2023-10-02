package binarySearchTree;

import binarySearchTree.Q3.TreeNode;

public class Q5 {
	static class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(12);
		root.right.left = new TreeNode(20);
		root.right.right = new TreeNode(30); 
		root.left.left.left = new TreeNode(6);
		root.left.left.right = new TreeNode(9);
		root.right.left.left = new TreeNode(18);
		root.right.left.right = new TreeNode(22);
		int x = 6;
		int y= 12;
		int result = lowestCommonAncestor(root, x, y);
		System.out.println(result);
	}

	private static int lowestCommonAncestor(TreeNode root, int x, int y) {
		int parentVal= root.val;
		int pVal = x;
		int qval = y;
		if(pVal >parentVal &&qval >parentVal) {
			return lowestCommonAncestor(root.right, x, y);
		} else if(pVal <parentVal &&qval <parentVal) {
			return lowestCommonAncestor(root.left, x, y);
		}
		return root.val; 
	}
}
