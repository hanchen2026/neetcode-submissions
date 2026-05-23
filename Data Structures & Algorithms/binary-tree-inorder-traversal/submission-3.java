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

        //Edge case and instantiation:
        List<Integer> lst = new ArrayList<>();
        if (root == null) return lst;

        // highkey FUCK morris traversals, O(n) space it is
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;

        // Iterative loops:
        while (!stack.isEmpty() || cur != null) {

            //If not null, push leftmost node until not possible
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            
            else {
                //pop from stack
                cur = stack.pop();
                lst.add(cur.val);

                //Then start with right subtree
                cur = cur.right;
            }
        }

        return lst;
    }
}