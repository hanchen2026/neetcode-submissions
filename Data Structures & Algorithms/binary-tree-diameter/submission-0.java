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
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameterRecursive(root);
        return diameter;
    }

    //return depth
    private int diameterRecursive(TreeNode n) {
        //if leaf node, children are empty, so nothing to diameter
        if (n == null) return 0;

        //find left subtree max length
        int l = diameterRecursive(n.left);

        //find right subtree max length
        int r = diameterRecursive(n.right);


        //return the maximal sum of left subtree and right subtree
        // but how??? 
        int depth = 1 + Math.max(l, r);

        int diam = (l + r);
        
        diameter = (diam > diameter) ? diam : diameter;

        return depth;
    }
}
