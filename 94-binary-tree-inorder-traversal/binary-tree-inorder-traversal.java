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
    public void helperFun(TreeNode root, List<Integer> inorderList){
        if(root == null){
            return;
        }

        helperFun(root.left,inorderList);
        inorderList.add(root.val);
        helperFun(root.right,inorderList);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        helperFun(root,inorderList);
        return inorderList;
    }
}