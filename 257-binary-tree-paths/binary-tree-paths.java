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
    void BSTpath(TreeNode root , List<String> list , String str){

        if(root == null){
            return;
        }
        
        String currStr = String.valueOf(root.val);
        if(str.isEmpty()){
            str += currStr;        
        }
        else{
            str += "->" + currStr;
        }
        if(root.left == null && root.right == null){
            list.add(str);
        }
        BSTpath(root.left,list,str);
        BSTpath(root.right,list,str);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        BSTpath(root, list ,"");
        return list ;
    }
}