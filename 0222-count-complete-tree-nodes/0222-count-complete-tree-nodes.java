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
    public int leftH (TreeNode root){
        int height = 0;
        while (root != null){
            height++;
            root = root.left;
        }
        return height;
    }
    public int rightH (TreeNode root){
        int height = 0;
        while (root != null){
            height++;
            root = root.right;
        }
        return height;
    }


    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int lH = leftH(root);
        int rH = rightH(root);

        if (lH == rH)
            return ((int)Math.pow(2, lH))-1;
        
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}