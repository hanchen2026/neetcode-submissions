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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        traverseInorder(root, lst);
        return lst;
    }

    public void traverseInorder(TreeNode r, List<Integer> l) {
        if (r == null) return;

        traverseInorder(r.left, l);
        l.add(r.val);
        traverseInorder(r.right, l);
    }

}