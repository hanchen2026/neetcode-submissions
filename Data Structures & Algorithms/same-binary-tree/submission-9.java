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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return recursionMethodBleh(p, q);
    }

    private boolean recursionMethodBleh(TreeNode a, TreeNode b) {
        //if one is null and the other isn't
        if (a == null && b != null || a != null && b == null) return false;

        //if both null return true
        if (a == null && b == null) return true;

        //if values differ return false
        if (a.val != b.val) return false;

        //recurse left and right until null, if either on the way differs, return false.
        return ((recursionMethodBleh(a.left, b.left)) && (recursionMethodBleh(a.right, b.right)));
    }
}
