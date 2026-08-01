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
    // [4, 5, 2, 6, 7, 3, 1]
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        HashSet<TreeNode> set = new HashSet<>();

        //initial config, null nodes should be recognized as "discovered"
        set.add(null);      

        List<Integer> lst = new ArrayList<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            //look at the node, then do postorder, until both children are either null or in the set
            TreeNode n = stack.peek();

            //if both children are in visited set, pop from the tree, add to list
            //null nodes are counted as already processed in visited set. 
            if (set.contains(n.right) && set.contains(n.left)) {
                n = stack.pop();
                set.add(n);
                lst.add(n.val);
            }

            //standard post-order stuff (note: right then left for iterative stack)
            else {
                if (n.right != null) stack.push(n.right);
                if (n.left != null) stack.push(n.left);
            }

        }

        return lst;
    }
}