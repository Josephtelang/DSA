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
    public static void getInOrder(ArrayList<Integer> list , TreeNode root){
        if(root== null){
            return;
        }

        getInOrder(list,root.left);
        list.add(root.val);
        getInOrder(list,root.right);
    }

    public static TreeNode createBalanceBST(ArrayList<Integer> list,int st , int end){
        if(st > end){
            return null;
        }

        int mid = st + (end - st)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = createBalanceBST(list,st,mid-1);
        root.right = createBalanceBST(list,mid+1,end);
        return root;

    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        getInOrder(list,root);
        return createBalanceBST(list,0,list.size()-1);
        
    }
}