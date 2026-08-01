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
        
        List<Integer> lst = new ArrayList<>();

        stack.push(root);
        set.add(null);
        while (!stack.isEmpty()) {
            //look at the node, then do postorder, until both children are either null or in the set
            TreeNode n = stack.peek();

            // if (n != null) System.out.println("N: " + n.val);


            //if both children are null, or in set, pop from the tree
            if (n.right == null && n.left == null || (set.contains(n.right) && set.contains(n.left))) {
                n = stack.pop();
                // System.out.println(n.val);
                set.add(n);
                lst.add(n.val);
            }
            //standard post-order stuff
            else {
                if (n.right != null) stack.push(n.right);
                if (n.left != null) stack.push(n.left);
            }

        }

        return lst;
    }

    // //discard.
    // private void fuck(TreeNode n, List<Integer> l) {
    //     if (n == null) return;

    //     fuck(n.left, l);
    //     fuck(n.right, l);

    //     if (n != null) l.add(n.val);
    // }

}