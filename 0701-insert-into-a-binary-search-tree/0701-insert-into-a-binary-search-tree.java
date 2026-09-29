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
    public TreeNode search(TreeNode prev, TreeNode curr, int val){
        if (curr == null)
            return prev;

        if (curr.val > val){
            prev = curr;
            curr = curr.left;
        }
        else if (curr.val < val){
            prev = curr;
            curr = curr.right;
        }

        return search(prev, curr, val);
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode loc = search(root, root, val);
        if (loc == null)
            return new TreeNode(val);
        if (loc.val > val){
            loc.left = new TreeNode(val);
        }
        else{
            loc.right = new TreeNode(val);
        }
        return root;
    }
}