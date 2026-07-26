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
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> lst = new ArrayList<>();

        TreeNode cur = root;  //need this bc you cant just insta pop like in dfs

        //iterate until both empty stack and null pointer
        while(cur != null || !stack.isEmpty()){         //there is a node in stack OR current node isn't null
            //node.left part of in-order
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            lst.add(cur.val);

            //DONT PUSH, just change pointers. This is node.right.
            cur = cur.right;
        }

        return lst;
    }
}