package binarySearchTree;

public class Q1 {

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
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        int k = 25;
        TreeNode result = searchBST(root, k);
        if (result != null) {
            System.out.println("The given key is the right node of the node with key " + result.val);
        } else {
            System.out.println("Key not found in the BST.");
        }
    }

    private static TreeNode searchBST(TreeNode root, int k) {
        while (root != null && root.val != k) {
            if (k < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }
}
