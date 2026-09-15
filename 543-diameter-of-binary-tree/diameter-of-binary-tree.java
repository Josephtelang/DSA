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
    static class Info{
        int hit;
        int diam;
        Info(int hit, int diam){
            this.hit = hit;
            this.diam = diam;
        }
    }
    public Info diamHitInfo(TreeNode root){

        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo =  diamHitInfo(root.left);
        Info rightInfo =  diamHitInfo(root.right);
        
        int selfDiam = leftInfo.hit + rightInfo.hit;

        return new Info(Math.max(leftInfo.hit,rightInfo.hit) + 1,Math.max(Math.max(leftInfo.diam,rightInfo.diam),selfDiam)) ;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diamHitInfo(root).diam;
    }
}