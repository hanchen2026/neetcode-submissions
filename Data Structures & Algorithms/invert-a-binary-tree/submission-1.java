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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invertTreeRecursive(root);
        return root;
    }

    private void invertTreeRecursive(TreeNode n) {
        //base case null root just return
        if (n == null) return;

        //swap the two
        TreeNode temp = n.right;
        n.right = n.left;
        n.left = temp;

        //do the same on left and right
        invertTreeRecursive(n.left);
        invertTreeRecursive(n.right);
        return;
    }
}
