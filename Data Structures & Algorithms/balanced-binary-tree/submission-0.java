/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public boolean isBalanced(TreeNode root) {
        //empty root return true
        if (root == null) return true;

        //dfs is a method that performs post-order dfs, returning 
        //  [Boolean, int]
        //  [isBalanced, depth]
        int result = dfs(root)[0];
        return (result == 1);
    }

    private int[] dfs(TreeNode n) {
        //absolute base case: at leaf node, depth is 0, and is balanced
        if (n == null) {
            int[] ret = {1, 0};
            return ret;
        }

        //call dfs on left and right subtree recursively
        int[] l = dfs(n.left);
        int[] r = dfs(n.right);

        if (l[0] == 1 && r[0] == 1 && Math.abs(l[1] - r[1]) <= 1) {
            int[] ret = {1, 1 + Math.max(l[1], r[1])};
            return ret;
        }
        else {
            int[] ret = {0, 1 + Math.max(l[1], r[1])};
            return ret;
        }
    }
}
