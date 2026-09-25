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
    class Info{
        int maxSubTree;
        int maxSum;
        Info(int maxSubTree, int maxSum){
            this.maxSubTree = maxSubTree;
            this.maxSum = maxSum;
        }
    }

    public Info helperFun(TreeNode root){
        if(root == null){
            return new Info(0,Integer.MIN_VALUE);
        }

        Info leftInfo = helperFun(root.left);
        Info rightInfo = helperFun(root.right);

        int leftContribution = Math.max(leftInfo.maxSubTree,0);
        int rightContribution = Math.max(rightInfo.maxSubTree,0);
        
        int maxSum = Math.max(Math.max(leftInfo.maxSum, rightInfo.maxSum) ,leftContribution + rightContribution + root.val);

        int maxOfLeftRight = Math.max(leftContribution,rightContribution);
        return new Info(maxOfLeftRight+root.val,maxSum);
    }
    public int maxPathSum(TreeNode root) {
        Info maxInfo = helperFun(root);
        return maxInfo.maxSum;
    }
}