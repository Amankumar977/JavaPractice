package binaryTree;

import java.util.*;

public class Q1 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	static class Solution {
		public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
			List<List<Integer>> result = new ArrayList<>();
			if (root == null) {
				return result;
			}
			boolean leftToRight = true;
			Queue<TreeNode> queue = new LinkedList<>();
			queue.offer(root);
			while (!queue.isEmpty()) {
				int size = queue.size();
				List<Integer> levelNode = new ArrayList<>();
				for (int i = 0; i < size; i++) {
					TreeNode node = queue.poll();
					if (leftToRight) {
						levelNode.add(node.val);
					} else {
						levelNode.add(0, node.val);
					}
					if (node.left != null) {
						queue.offer(node.left);
					}
					if (node.right != null) {
						queue.offer(node.right);
					}
				}
				result.add(levelNode);
				leftToRight = !leftToRight;
			}
			return result;
		}
	}

	public static void main(String[] args) {
		// Example usage
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);
		root.right.left.left = new TreeNode(7);
		root.right.left.right = new TreeNode(8);

		Solution solution = new Solution();
		List<List<Integer>> result = solution.zigzagLevelOrder(root);
		System.out.println(result);
	}
}
