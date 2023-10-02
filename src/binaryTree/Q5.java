package binaryTree;

import java.util.*;

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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeNode mirroredRoot = mirrorTree(root);
        List<Integer> result = new ArrayList<>();
        preOrderTraversal(mirroredRoot, result);
        System.out.println(result);
    }

    private static TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap left and right subtrees
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recur for left and right subtrees
        root.left = mirrorTree(root.left);
        root.right = mirrorTree(root.right);

        return root;
    }

    private static void preOrderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val); // Add the current node to the result list
        preOrderTraversal(root.left, result); // Traverse the left subtree
        preOrderTraversal(root.right, result); // Traverse the right subtree
    }
}
