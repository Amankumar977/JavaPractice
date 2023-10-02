package binaryTree;

import java.util.*;

public class Q3 {
   static class TreeNode{
	   int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int val){
		   this.val = val;
	   }
   }
   static class Solution{
	   
   }
	public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
       root.left= new TreeNode(2);
       root.right = new TreeNode(3);
       root.left.left= new TreeNode(4);
       root.right.left= new TreeNode(5);
       root.right.right = new TreeNode(6);
       root.right.left.left= new TreeNode(7);
       root.right.left.right = new TreeNode(8);
       List<Integer> result = levelTraversal(root);
       System.out.println(result);
	}
	private static List<Integer> levelTraversal(TreeNode root) {
		List <Integer> result = new ArrayList<>();
		if(root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		Stack<List<Integer>> stack = new Stack<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int n = queue.size();
			List<Integer> levelNodes = new ArrayList<>();
			for(int i=0; i<n; i++) { 
				TreeNode node = queue.poll();
				levelNodes.add(node.val);
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
			}
			stack.add(levelNodes);
		}
		while(!stack.isEmpty()) {
			result.addAll(stack.pop());
		}
		return result;
			
	}
	
}
