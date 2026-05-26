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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        //perform DFS
        int level = dfs(root, 0);

        return level;
    }

    private int dfs(TreeNode n, int level) {
        if (n == null) return level;

        int l = dfs(n.left, level + 1);
        int r = dfs(n.right, level + 1);

        return (l > r) ? l : r;
    }
}
