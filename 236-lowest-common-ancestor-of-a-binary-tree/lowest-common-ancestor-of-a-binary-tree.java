/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean getPath(TreeNode root,TreeNode n, ArrayList<TreeNode> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root == n){
            return true;
        }

        boolean foundLeft = getPath(root.left,n,path);
        boolean foundRight = getPath(root.right,n,path);
        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

    public TreeNode lca1(TreeNode root, TreeNode p , TreeNode q){
        if(root==null){
            return null;
        }
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        boolean foundLeft = getPath(root,p,path1);
        boolean foundRight = getPath(root,q,path2);

        if(!foundLeft || !foundRight){
            return null;
        }


        int i=0;
        for(;i<path1.size() && i<path2.size() ; i++){
            if(path1.get(i).val != path2.get(i).val){
                break;
            }
        }

        return path1.get(i-1);

    }

    public TreeNode lca2(TreeNode root, TreeNode p, TreeNode q){
        if(root==null || root == p || root == q){
            return root;
        }

        TreeNode foundLeft = lca2(root.left,p,q);
        TreeNode foundRight = lca2(root.right,p,q);

        if(foundLeft == null){
            return foundRight;
        }
        if(foundRight == null){
            return foundLeft;
        }

        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // return lca1(root,p,q);
        return lca2(root,p,q);
    }
}