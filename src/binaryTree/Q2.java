package binaryTree;

import java.util.*;

class Q2 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);
		if (isComplete(root)) {
			System.out.println("It is a binary tree");
		} else {
			System.out.println("It is not a binary tree.");
		}
	}

	private static boolean isComplete(TreeNode root) {
		if (root == null) {
			return true;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		 
		boolean flag = false;
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if(node == null) {
				flag = true;
			} else {
				if(flag) {
					return false;
				}
				queue.add(node.left);
				queue.add(node.right);
			}
		}
		return true;
	}
}
