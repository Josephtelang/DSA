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
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHit = height(root.left);
        int rightHit = height(root.right);

        return Math.max(leftHit,rightHit) + 1 ;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftDiam = diameterOfBinaryTree(root.left);
        int leftHit = height(root.left) ;
        int rightDiam = diameterOfBinaryTree(root.right);
        int rightHit = height(root.right) ;

        int selfDiam = leftHit + rightHit;

        return Math.max(Math.max(leftDiam,rightDiam),selfDiam) ;
    }
}