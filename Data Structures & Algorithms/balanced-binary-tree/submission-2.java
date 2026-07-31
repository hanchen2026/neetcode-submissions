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
        //dfs is a method that performs post-order dfs, returning 
        //  [int, int]          (1 == isBalanced; 0 = NOT balanced)
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

        //  if the left subtree is balanced, and the right subtree is balanced
        //  AND the difference between right and left subtrees is <= 1, 
        //  the current tree is balanced, and return that up
        //  with 1 + max depth
        if (l[0] == 1 && r[0] == 1 && Math.abs(l[1] - r[1]) <= 1) {
            int[] ret = {1, 1 + Math.max(l[1], r[1])};
            return ret;
        }

        //  otherwise, it isn't, so flag false, and return up 
        //  with 1 + max depth
        else {
            int[] ret = {0, 1 + Math.max(l[1], r[1])};
            return ret;
        }
    }
}
