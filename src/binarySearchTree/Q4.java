package binarySearchTree;

import java.util.ArrayList;

public class Q4 {
    static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int val){
    		this.val = val;
    	}
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(12);
		root.right.left = new TreeNode(16);
		root.right.right = new TreeNode(25);
		ArrayList<Integer> result = new ArrayList<>();
		inorderTravsel(root, result);
		int n = result.size();
		for(int i=1; i<n; i++) {
			if(i-1 ==0) {
				System.out.println("The predecessor of "+ result.get(i-1)+ " Doesn't exist.");
			}
			System.out.println("The predecessor of "+ result.get(i)+" is " +result.get(i-1));
		}
	}
	private static void inorderTravsel(TreeNode root, ArrayList<Integer> result) {
		if(root == null) {
			return;
		}
		if(root.left != null) {
			inorderTravsel(root.left, result);
		}
		result.add(root.val);
		if(root.right != null) {
			inorderTravsel(root.right, result);
		}
	}
}
