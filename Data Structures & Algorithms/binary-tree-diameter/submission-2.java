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

    //global diameter parameter to act as global anchor for diameter
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

        //return depth of current node 
        int depth = 1 + Math.max(l, r);

        //calculate diameter at current node (l + r), idk why
        int currentDiameter = (l + r);
        
        //if new diam is better than global, set global to current
        if (currentDiameter > diameter) diameter = currentDiameter;

        //return current node depth.
        return depth;
    }
}
