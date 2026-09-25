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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        
        if(root.left != null){
            if(root.left.val != root.val){
                return false;
            }
        }
        
        if(root.right != null){
            if(root.right.val != root.val){
                return false;
            }
        }

        boolean leftCheck = isUnivalTree(root.left);
        boolean rightCheck = isUnivalTree(root.right);

        return leftCheck && rightCheck;
    }
}