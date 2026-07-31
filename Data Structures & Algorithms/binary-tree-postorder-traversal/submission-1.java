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
    public List<Integer> postorderTraversal(TreeNode root) {
        //do this with one stack and a lastVisited flag bozo
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        
        List<Integer> lst = new ArrayList<>();

        fuck(root, lst);

        // stack.push(root);
        // while(!stack.isEmpty()){ 
        //     TreeNode n = stack.pop();
        //     if (n.right != null) stack.push(n.right);
        //     if (n.left != null) stack.push(n.left);
        //     lst.add(n.val);
        // }

        return lst;
    }

    private void fuck(TreeNode n, List<Integer> l) {
        if (n == null) return;

        fuck(n.left, l);
        fuck(n.right, l);

        if (n != null) l.add(n.val);
    }

}