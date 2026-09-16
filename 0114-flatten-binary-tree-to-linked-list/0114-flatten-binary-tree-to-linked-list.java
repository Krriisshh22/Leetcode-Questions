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
    public static void flat (TreeNode root, Queue<TreeNode> ll){
        if (root == null){
            return;
        }
        ll.add(root);
        flat(root.left, ll);
        flat(root.right, ll);
        return;
    }
    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        flat(root, q);

        TreeNode prev = null;
        while (!q.isEmpty()){
            TreeNode curr = q.remove();
                if (prev!= null){
                prev.left = null;
                prev.right = curr;
            }
            prev = curr;
        }
    }
}