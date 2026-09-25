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
    public static String findDuplicates(TreeNode root,HashMap<String,Integer> map , List<TreeNode> result){
        if(root == null){
            return "#";
        }

        String leftString = findDuplicates(root.left, map, result);
        String rightString = findDuplicates(root.right, map, result);

        String newStr = root.val+","+leftString+","+rightString;
        int count = map.getOrDefault(newStr,0);
        if(count == 1){
            result.add(root);
        }
        count++;
        map.put(newStr,count);

        return newStr;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        findDuplicates(root,map,result);
        return result;
    }
}