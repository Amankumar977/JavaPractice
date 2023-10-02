package binarySearchTree;

import java.util.ArrayList;

public class Q3 {
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
        int k = 14;
        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);

        boolean found = false;
        for (int i = 0, j = result.size() - 1; i < j;) {
            if (result.get(i) + result.get(j) == k) {
                found = true;
                break;
            } else if (result.get(i) + result.get(j) < k) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(found);
    }

    private static void inorderTraversal(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorderTraversal(root.left, result);
        }
        result.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right, result);
        }
    }
}
