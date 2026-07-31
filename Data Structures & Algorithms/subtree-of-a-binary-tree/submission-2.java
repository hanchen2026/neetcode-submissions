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

    //global, idk if it could be local but i dont wanna bother
    boolean isSubtree = false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        traverseTree(root, subRoot);
        return isSubtree;
    }

    private void traverseTree(TreeNode n, TreeNode sub) {
        if (n == null) return;
        if (isSubtree) return;

        //if a node matches, do the scannign algo on both trees
        if (n.val == sub.val) {
            //if match permaset to true
            boolean check = scanTrees(n, sub);
            if (check) isSubtree = true;
        }
        traverseTree(n.left, sub);
        traverseTree(n.right, sub);
    }

    private boolean scanTrees(TreeNode n, TreeNode sub) {
        if (n == null && sub == null) return true;
        else if (n == null || sub == null) return false;
        else if (n.val != sub.val) return false;

        return (scanTrees(n.left, sub.left) && scanTrees(n.right, sub.right));
    }
}
