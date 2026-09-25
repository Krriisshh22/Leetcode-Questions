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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if (root == null)
            return l;
        
        Queue<TreeNode> temp = new LinkedList<>();
        temp.add(root);
        temp.add(null);
        TreeNode prev = null;

        while (!temp.isEmpty()){
            TreeNode curr = temp.remove();
            if (curr == null){
                if (temp.isEmpty()){
                    l.add(prev.val);
                    return l;
                }
                else{
                    l.add(prev.val);
                    temp.add(null);
                }
            }
            else{
                prev = curr;
                if (curr.left != null)
                    temp.add(curr.left);
                if (curr.right != null)
                    temp.add(curr.right);
            }
        }
        return l;
    }
}